package org.applause.lang.generator.ios.datasource

import com.google.inject.Inject
import org.applause.lang.applauseDsl.DataSource
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.eclipse.emf.ecore.resource.Resource

class DatasourceCompiler {

	@Inject MappingProviderCompiler mappingProviderCompiler
	
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		resource.allContents.filter(typeof(DataSource)).forEach [
			mappingProviderCompiler.compile(it, pfsa)
		]
	}
	
}