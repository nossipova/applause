package org.applause.lang.generator.android.ui

import com.google.inject.Inject
import org.applause.lang.applauseDsl.ListItemCellDeclaration
import org.applause.lang.applauseDsl.UIComponentMemberDeclaration
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.generator.android.AndroidOutputConfigurationProvider
import org.applause.lang.generator.android.BoilerplateExtensions
import org.applause.lang.generator.android.extensions.ImportManagerExtensions
import org.applause.lang.generator.android.extensions.TypeExtensions
import org.applause.lang.applauseDsl.DataType

class ListItemCellCompiler {

	@Inject extension BoilerplateExtensions
	@Inject extension TypeExtensions
	@Inject extension ImportManagerExtensions

	@Inject ImportManagerFactory importManagerFactory

	// outlet name
	public static val String MODEL_OUPUT = AndroidOutputConfigurationProvider.OUTPUT_MODEL
	
	def compile(ListItemCellDeclaration it) '''
		«fileHeader()»
		
		package «namespace».ui
		
		«val importManager = importManagerFactory.create»
		«val body = compile(importManager)»
		«importManager.imports()»
		«body»		
	'''	

	def private compile(ListItemCellDeclaration it, ImportManager importManager) '''
		class «typeName» {
			
			«members.map[compile(importManager)].join»
		}
	'''
	
	def private compile(UIComponentMemberDeclaration it, ImportManager importManager) '''	
		«importManager.addImport((type as DataType).namespace + '.' + type.typeName)»
		public «type.typeName» «name»
	'''
}
