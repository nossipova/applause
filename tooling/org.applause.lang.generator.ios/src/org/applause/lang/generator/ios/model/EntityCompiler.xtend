package org.applause.lang.generator.ios.model

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.base.AttributeExtensions
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.generator.ios.BoilerplateExtensions
import org.applause.lang.generator.ios.IosOutputConfigurationProvider
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.applause.lang.generator.ios.extensions.ImportManagerExtensions
import org.applause.lang.generator.ios.extensions.TypeExtensions
import org.applause.util.xcode.project.XcodeGroup

/**
 * Compiles entity headers and modules.
 */
class EntityCompiler {

	@Inject extension BoilerplateExtensions
	@Inject extension TypeExtensions
	@Inject extension AttributeExtensions

	@Inject ImportManagerFactory importManagerFactory

	@Inject extension ImportManagerExtensions

	// outlet name
	public String MODEL_OUPUT = IosOutputConfigurationProvider::OUTPUT_MODEL

	/**
	 * Main entry point for the entity compiler.
	 */
	def compile(Entity it, ProjectFileSystemAccess pfsa, XcodeGroup group) {
		pfsa.createHeaderFile(group, MODEL_OUPUT, headerFileName, compileHeader)
		pfsa.createModuleFile(group, MODEL_OUPUT, moduleFileName, compileModule)
	}

	// -- HEADER
	/**
	 * Compiles the header file for an entity.
	 */
	def compileHeader(Entity entity) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create(entity)»
		«val body = entity.compileInterface(importManager)»
		«importManager.headerImports»
		«body»
	'''

	def compileInterface(Entity entity, ImportManager manager) '''
		@interface «entity.typeName»«entity.extendsClause(manager)»
		
		«FOR attribute : entity.attributes»
			«attribute.compile(manager)»
		«ENDFOR»
				
		@end
	'''

	def compile(Attribute attribute, ImportManager manager) '''
		@property (strong, nonatomic) «manager.serialize(attribute.type, attribute.many)» «IF !attribute.type.primitive»*«ENDIF»«attribute.
			fieldName»;
	'''

	def private extendsClause(Entity entity, ImportManager importManager) {
		' : ' +
			if(entity.superEntity != null) {
				importManager.serialize(entity.superEntity)
			} else {
				'NSObject'
			}
	}

	// -- MODULE
	/** 
	 * Compiles the module file for an entity.
	 */
	def compileModule(Entity entity) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create(entity)»
		«val body = entity.compileImplementation(importManager)»
		«importManager.headerImports»
		«body»
	'''

	def compileImplementation(Entity entity, ImportManager manager) '''
		@implementation «manager.serialize(entity)»
		
		@end
	'''

}
