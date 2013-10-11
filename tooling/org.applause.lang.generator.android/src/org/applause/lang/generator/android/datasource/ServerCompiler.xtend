package org.applause.lang.generator.android.datasource

import com.google.inject.Inject
import org.applause.lang.applauseDsl.DataSource
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.generator.android.AndroidOutputConfigurationProvider
import org.applause.lang.generator.android.BoilerplateExtensions
import org.applause.lang.generator.android.extensions.ImportManagerExtensions
import org.applause.lang.generator.android.extensions.TypeExtensions
import org.eclipse.xtext.generator.IFileSystemAccess
import org.applause.lang.generator.android.extensions.RESTURLExtensions
import org.applause.lang.applauseDsl.Entity

class ServerCompiler {

	@Inject extension TypeExtensions
	@Inject extension BoilerplateExtensions
	@Inject extension ImportManagerExtensions
	@Inject extension RESTURLExtensions

	@Inject ImportManagerFactory importManagerFactory

	def compile(DataSource it, IFileSystemAccess fsa) {
		fsa.generateFile(serverFileName, AndroidOutputConfigurationProvider.OUTPUT_MODEL, compile)
	}

	def compile(DataSource it) '''
		�fileHeader�

		package �namespace�.datasource
		
		�val importManager = importManagerFactory.create�
		�val body = compile(importManager)�
		�importManager.imports()�
		�body�
	'''

	def compile(DataSource it, ImportManager importManager) '''
		interface �typeName�Server {

		�val outlet = outlets.get(0)�
		�importManager.addImport('retrofit.http.' + outlet.verb.literal)�
		�importManager.addImport('java.util.List')�
			@�outlet.verb.literal�('�outlet.path.toURLString�')
			�val entity = outlets.get(0).yields.type as Entity�
			�importManager.addImport(entity.namespace + '.entities.' + entity.typeName)�
			def List<�entity.typeName�> get�outlet.name�()
		}
	'''
}