package org.applause.lang.generator.ios.model

import com.google.inject.Inject
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.eclipse.emf.ecore.resource.Resource
import org.applause.lang.applauseDsl.Entity

import static extension org.applause.util.xcode.project.Path.*

/** 
 * The ModelCompiler is responsible for generating all classes and resources that are related to 
 * the model of the application.
 */
class ModelCompiler {

	@Inject EntityCompiler entityCompiler
	
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		val group = pfsa.mainSourceGroup.createGroup("Entities".toPath)
		resource.allContents.filter(typeof(Entity)).forEach [
			entityCompiler.compile(it, pfsa, group)
		]
	}

}