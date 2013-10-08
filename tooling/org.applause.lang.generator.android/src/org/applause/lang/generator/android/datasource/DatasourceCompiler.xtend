package org.applause.lang.generator.android.datasource

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.applause.lang.applauseDsl.DataSource

class DatasourceCompiler {

	@Inject JSONConverterCompiler jsonConverterCompiler
	@Inject ServerCompiler serverCompiler
	@Inject CommunicatorCompiler communicatorCompiler
	
	def compile(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.filter(typeof(DataSource)).forEach [
			jsonConverterCompiler.compile(it, fsa)
			serverCompiler.compile(it, fsa)
			communicatorCompiler.compile(it, fsa)
		]
	}
	
}