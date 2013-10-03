package org.applause.lang.generator.android.model

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Attribute
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.base.AttributeExtensions
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.base.TypeExtensions
import org.applause.lang.generator.android.AndroidOutputConfigurationProvider
import org.applause.lang.generator.android.BoilerplateExtensions
import org.applause.lang.generator.android.extensions.ImportManagerExtensions

class EntityCompiler {
	
	@Inject extension BoilerplateExtensions
	@Inject extension TypeExtensions
	@Inject extension AttributeExtensions
	@Inject extension ImportManagerExtensions
	
	@Inject ImportManagerFactory importManagerFactory
	
	// outlet name
	public static val String MODEL_OUPUT = AndroidOutputConfigurationProvider.OUTPUT_MODEL
	
	def compile(Entity entity) '''
		«fileHeader()»
		
		package «entity.namespace».entities		
		«val importManager = importManagerFactory.create(entity)»
		«val body = compile(entity, importManager)»
		«importManager.imports()»
		«body»
	'''
	
	def private compile(Entity entity, ImportManager importManager) '''
		«entity.abstractClause»class «entity.typeName» «entity.extendsClause(importManager)» {
			
			«entity.attributes.map[compile(importManager)].join»
		}
	'''
	
	def private abstractClause(Entity entity) {
		if (entity.isAbstract()) 
			"abstract " 
	}
	
	def private extendsClause(Entity entity, ImportManager importManager) {
		if (entity.superEntity != null) {
			"extends " + importManager.serialize(entity.superEntity)
		}
	}
	
	def private compile(Attribute attribute, ImportManager importManager) '''
		public «importManager.serialize(attribute.type, attribute.many)» «attribute.fieldName»
	'''
}