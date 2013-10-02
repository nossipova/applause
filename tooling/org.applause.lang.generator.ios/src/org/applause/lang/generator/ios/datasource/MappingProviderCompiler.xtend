package org.applause.lang.generator.ios.datasource

import com.google.inject.Inject
import org.applause.lang.applauseDsl.DataSource
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.generator.ios.BoilerplateExtensions
import org.applause.lang.generator.ios.IosOutputConfigurationProvider
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.applause.lang.generator.ios.TypeExtensions
import org.applause.lang.generator.ios.extensions.ImportManagerExtensions

import static extension org.applause.util.xcode.project.Path.*

class MappingProviderCompiler {

	@Inject extension TypeExtensions
	@Inject extension BoilerplateExtensions
	@Inject extension ImportManagerExtensions

	@Inject ImportManagerFactory importManagerFactory

	def compile(DataSource it, ProjectFileSystemAccess pfsa) {
		val modelGroup = pfsa.mainSourceGroup.createGroup('Datasource'.toPath)
		pfsa.createHeaderFile(modelGroup, IosOutputConfigurationProvider.OUTPUT_DATASOURCE, headerFileName, compileHeader)
		pfsa.createModuleFile(modelGroup, IosOutputConfigurationProvider.OUTPUT_DATASOURCE, moduleFileName, compileModule)
	}

	def compileHeader(DataSource it) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create»
		«val body = compileInterface(importManager)»
		«importManager.headerImports»
		«body»
	'''

	def compileInterface(DataSource it, ImportManager manager) '''
		@interface «typeName» : NSObject
		
		«outlets.map[yields.type].filter(Entity).map [
			'''@property (strong, nonatomic) RKObjectMapping *«name.toFirstLower»RequestMapping;'''
		].join('\n')»
		
		@end
	'''

	def compileModule(DataSource it) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create()»
		«val body = compileImplementation(importManager)»
		«importManager.headerImports»
		«body»
	'''

	def compileImplementation(DataSource it, ImportManager manager) '''
		«manager.addImport(typeName)»
		@implementation «typeName»
		
		«outlets.map[yields.type].filter(Entity).map[
			'''
			- (RKObjectMapping *)«name.toFirstLower»RequestMapping {
			    if (!_eventRequestMapping) {
			        _eventRequestMapping = [RKObjectMapping requestMapping];
			        [_eventRequestMapping addAttributeMappingsFromDictionary:@{@"payload.issue.title": @"title_",
			        														   @"type": @"type",
			        														   @"created_at" : @"createdAt"}];
«««			        [_eventRequestMapping addPropertyMapping:[RKRelationshipMapping relationshipMappingFromKeyPath:@"user"
«««			                                                                                            toKeyPath:@"user"
«««																										withMapping:[self userRequestMapping]]];
			    }
			    return _eventRequestMapping;
			}
		'''].join('\n')»
		
		@end
	'''

}
