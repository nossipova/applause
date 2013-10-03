package org.applause.lang.generator.ios.ui

import com.google.inject.Inject
import org.applause.lang.applauseDsl.ListItemCellDeclaration
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.generator.ios.BoilerplateExtensions
import org.applause.lang.generator.ios.IosOutputConfigurationProvider
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.applause.lang.generator.ios.extensions.ImportManagerExtensions
import org.applause.lang.generator.ios.extensions.TypeExtensions
import org.applause.util.xcode.project.XcodeGroup

class ListItemCellCompiler {

	@Inject extension BoilerplateExtensions
	@Inject extension TypeExtensions
	@Inject extension ImportManagerExtensions

	@Inject ImportManagerFactory importManagerFactory

	// outlet name
	public String UI_OUTPUT = IosOutputConfigurationProvider::OUTPUT_UI

	/**
	 * Main entry point for the listview compiler.
	 */
	def compile(ListItemCellDeclaration it, ProjectFileSystemAccess pfsa, XcodeGroup group) {
		pfsa.createHeaderFile(group, UI_OUTPUT, headerFileName, compileHeader)
		pfsa.createModuleFile(group, UI_OUTPUT, moduleFileName, compileModule)
	}

	def compileHeader(ListItemCellDeclaration it) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create»
		«val body = compileInterface(importManager)»
		«importManager.headerImports»
		«body»
	'''

	def compileInterface(ListItemCellDeclaration it, ImportManager manager) '''
		@interface «typeName»«extendsClause(manager)»
		
		@end
	'''

	def private extendsClause(ListItemCellDeclaration it, ImportManager manager) {
		': UITableViewCell'
	}

	def compileModule(ListItemCellDeclaration it) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create()»
		«val body = compileImplementation(importManager)»
		«importManager.headerImports»
		«body»
	'''

	def compileImplementation(ListItemCellDeclaration it, ImportManager manager) '''
		«manager.addImport(typeName)»		
		@implementation «typeName»
		
		- (id)initWithStyle:(UITableViewCellStyle)style reuseIdentifier:(NSString *)reuseIdentifier
		{
		    self = [super initWithStyle:UITableViewCellStyleSubtitle reuseIdentifier:reuseIdentifier];
		    if (self) {
		        // Initialization code
		    }
		    return self;
		}
		
		@end
	'''

}
