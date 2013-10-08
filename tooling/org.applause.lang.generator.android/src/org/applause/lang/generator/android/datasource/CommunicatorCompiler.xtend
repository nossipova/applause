package org.applause.lang.generator.android.datasource

import com.google.inject.Inject
import org.applause.lang.applauseDsl.DataSource
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.generator.android.AndroidOutputConfigurationProvider
import org.applause.lang.generator.android.BoilerplateExtensions
import org.applause.lang.generator.android.extensions.ImportManagerExtensions
import org.applause.lang.generator.android.extensions.TypeExtensions
import org.eclipse.xtext.generator.IFileSystemAccess

class CommunicatorCompiler {

	@Inject extension TypeExtensions
	@Inject extension BoilerplateExtensions
	@Inject extension ImportManagerExtensions

	@Inject ImportManagerFactory importManagerFactory

	def compile(DataSource it, IFileSystemAccess fsa) {
		fsa.generateFile(communicatorFileName, AndroidOutputConfigurationProvider.OUTPUT_MODEL, compile)
	}

	def compile(DataSource it) '''
		«fileHeader»

		package «namespace».datasource
		
		«val importManager = importManagerFactory.create»
		«val body = compile(importManager)»
		«importManager.imports()»
		«body»
	'''

	def compile(DataSource it, ImportManager importManager) '''
		«importManager.addImport('android.content.AsyncTaskLoader')»
		«importManager.addImport('android.content.Context')»
		«importManager.addImport('java.util.List')»
		«importManager.addImport('retrofit.RestAdapter')»
		«val entity = outlets.get(0).yields.type as Entity»
		«importManager.addImport(entity.namespace + '.entities.' + entity.typeName)»
		class «typeName»Communicator extends AsyncTaskLoader<List<«entity.typeName»>> {
			
			«typeName»Server server
		
			new(Context context) {
				super(context)
				server = new RestAdapter.Builder().setServer('https://api.github.com').setConverter(new «typeName»JSONConverter).build.create(«typeName»Server)
			}
		
			override loadInBackground() {
				server.get«outlets.get(0).name»()
			}
		}
	'''
	
}