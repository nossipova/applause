package org.applause.lang.generator.ios.ui

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.applauseDsl.ListView
import org.applause.lang.applauseDsl.RESTURLPart
import org.applause.lang.applauseDsl.Variable
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.generator.ios.BoilerplateExtensions
import org.applause.lang.generator.ios.IosOutputConfigurationProvider
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.applause.lang.generator.ios.TypeExtensions
import org.applause.lang.generator.ios.extensions.ImportManagerExtensions
import org.applause.util.xcode.project.XcodeGroup
import org.applause.lang.applauseDsl.StringLiteral
import org.applause.lang.applauseDsl.EntityMemberCall

class ListViewCompiler {

	@Inject extension BoilerplateExtensions
	@Inject extension TypeExtensions
	@Inject extension ImportManagerExtensions

	@Inject ImportManagerFactory importManagerFactory

	// outlet name
	public String UI_OUTPUT = IosOutputConfigurationProvider::OUTPUT_UI

	/**
	 * Main entry point for the listview compiler.
	 */
	def compile(ListView it, ProjectFileSystemAccess pfsa, XcodeGroup group) {
		pfsa.createHeaderFile(group, UI_OUTPUT, headerFileName, compileHeader)
		pfsa.createModuleFile(group, UI_OUTPUT, moduleFileName, compileModule)
	}

	// -- HEADER
	/**
	 * Compiles the header file for a list view.
	 */
	def compileHeader(ListView listview) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create()»
		«val body = listview.compileInterface(importManager)»
		«importManager.headerImports»
		«body»
	'''

	def compileInterface(ListView listview, ImportManager manager) '''
		@interface «listview.typeName»«listview.extendsClause(manager)»«listview.implementsClause(manager)»
		
		@end
	'''

	def private extendsClause(ListView listview, ImportManager manager) {
		': UITableViewController'
	}
	
	def private implementsClause(ListView listview, ImportManager manager) {
		'<UITableViewDataSource, UITableViewDelegate>'	
	}

	// -- MODULE	
	/** 
	 * Compiles the module file for a list view.
	 */
	def compileModule(ListView it) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create()»
		«val body = compileImplementation(importManager)»
		«importManager.headerImports»
		«body»
	'''

	def compileImplementation(ListView it, ImportManager manager) '''
		«manager.addImport(typeName)»		
		@interface «typeName» ()
		
		@property (strong, nonatomic) NSMutableArray *«name.toFirstLower»;
		
		@end
		
		@implementation «typeName»
		
		«method_init(manager)»
		
		«method_viewWillAppear»
		
		«method_resourcePath»
		
		«method_fetchData»
		
		«compileTableViewDataSource(manager)»
		
		@end
	'''

	def method_init(ListView it, ImportManager manager) '''
		- (id)initWithStyle:(UITableViewStyle)style
		{
			self = [super initWithStyle:style];
			if (self) {
				self.title = @"«title»";
				// TODO Table cell setup is dependent on the number of sections and cells,
				//		make sure to factor this out.
				«sections.map[items.items.map[
					manager.addImport(type.typeName)
					'''[self.tableView registerClass:[«type.typeName» class] forCellReuseIdentifier:@"«type.typeName»"];'''
				]].flatten.join('\n')»
			}
			return self;
		}
	'''

	def method_viewWillAppear(ListView it) '''
		- (void)viewWillAppear:(BOOL)animated
		{
			[super viewWillAppear:animated];
			[self fetchData];
		}
	'''

	def method_resourcePath(ListView it) '''
		- (NSString *)resourcePath
		{
			// TODO Note that we might have multiple data sources in place, so the architecture needs to support this!
			//		In the first iteration, let's go with a simple case.
			«val pathParts = datasource.datasource.outlets.get(0).path.parts»
			«IF !pathParts.filter(Variable).nullOrEmpty»
			return [NSString stringWithFormat:@"/«pathParts.map[
			switch it {
				RESTURLPart: text
				Variable: '%@'
			}].join('/')»", «pathParts.filter(Variable).map[parameterReference.name].join(', ')»];
			«ELSE»
			return @"/«pathParts.filter(RESTURLPart).map[text].join('/')»";
			«ENDIF»
		}
	'''

	def method_fetchData(ListView it) '''
		- (void)fetchData
		{
		    [[RKObjectManager sharedManager] getObjectsAtPath:[self resourcePath] parameters:nil success:^(RKObjectRequestOperation *operation, RKMappingResult *mappingResult) {
		        NSArray *resultArray = mappingResult.array;
		        self.«name.toFirstLower» = [NSMutableArray arrayWithCapacity:[resultArray count]];
		        «val entity = sections.get(0).items.items.get(0).datasource.datasource.datasource.outlets.get(0).yields.type as Entity»
		        «val variableName = entity.typeName.toFirstLower»
		        for (NSDictionary *eventDict in resultArray) {
		            «entity.typeName» *«variableName» = [«entity.typeName» new];
		            «entity.attributes.map[
		            	'''«variableName».«name» = «variableName»Dict[@"«name»"];'''
		            ].join('\n')»
		            self.«name.toFirstLower»[[self.«name.toFirstLower» count]] = «variableName»;
		        }
		        [self.tableView reloadData];
		    } failure:^(RKObjectRequestOperation *operation, NSError *error) {
		        NSLog(@"Error loading «name.toFirstLower» for user %@: %@", @"wwaltersen", error);
		    }];
		}
	'''

	def compileTableViewDataSource(ListView it, ImportManager importManager) '''
		#pragma mark - Table view data source methods
		
		«method_numberOfRowsInSection»
		
		«method_cellForRowAtIndexPath(importManager)»
	'''

	def method_numberOfRowsInSection(ListView it) '''
		- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section
		{
			return [self.«name.toFirstLower» count];
		}
	'''

	def method_cellForRowAtIndexPath(ListView it, ImportManager importManager) '''
		- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath
		{
			«val cell = sections.get(0).items.items.get(0)»			
			// TODO this depends on the number of sections and their layout
			static NSString *«cell.type.name»Identifier = @"«cell.type.name»";
			UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:«cell.type.name»Identifier forIndexPath:indexPath];

			«val entityName = (datasource.datasource.outlets.get(0).yields.type as Entity).name»
			«val variableName = entityName.toFirstLower»
			«importManager.addImport(entityName)»
			«entityName» *«variableName» = («entityName» *)[self.«name.toFirstLower» objectAtIndex:[indexPath row]];
			«cell.configurations.map[
				'''cell.«type.component.name».text = «variableName».«switch value {
					StringLiteral: (value as StringLiteral).value
					EntityMemberCall: (value as EntityMemberCall).head.name					
				}»;'''
			].join('\n')»
«««			cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
			return cell;
		}
	'''

}
