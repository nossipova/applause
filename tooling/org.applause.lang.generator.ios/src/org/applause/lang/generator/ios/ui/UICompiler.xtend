package org.applause.lang.generator.ios.ui

import com.google.inject.Inject
import org.applause.lang.applauseDsl.ListItemCellDeclaration
import org.applause.lang.applauseDsl.ListView
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.eclipse.emf.ecore.resource.Resource

import static extension org.applause.util.xcode.project.Path.*

class UICompiler {
	
	@Inject ListViewCompiler listViewCompiler
	@Inject ListItemCellCompiler listItemCellCompiler
	
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		val group = pfsa.mainSourceGroup.createGroup('UI'.toPath)
		resource.allContents.filter(typeof(ListView)).forEach [
			listViewCompiler.compile(it, pfsa, group)
		]
		resource.allContents.filter(typeof(ListItemCellDeclaration)).forEach [
			listItemCellCompiler.compile(it, pfsa, group)
		]
	}
	
}