package org.applause.lang.generator.android

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Entity
import org.applause.lang.generator.android.extensions.TypeExtensions
import org.applause.lang.generator.android.model.EntityCompiler
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.applause.lang.applauseDsl.ListItemCellDeclaration
import org.applause.lang.generator.android.ui.ListItemCellCompiler
import org.applause.lang.generator.android.datasource.DatasourceCompiler

class AndroidAppGenerator implements IGenerator {

	@Inject extension TypeExtensions
	@Inject extension EntityCompiler
	@Inject extension ListItemCellCompiler
	@Inject DatasourceCompiler datasourceCompiler

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Entity)).forEach [
			fsa.generateFile(fileName, EntityCompiler.MODEL_OUPUT, compile)
		]

		resource.allContents.filter(typeof(ListItemCellDeclaration)).forEach [
			fsa.generateFile(fileName, ListItemCellCompiler.MODEL_OUPUT, compile)
		]
		
		datasourceCompiler.compile(resource, fsa)
		
	}

}
