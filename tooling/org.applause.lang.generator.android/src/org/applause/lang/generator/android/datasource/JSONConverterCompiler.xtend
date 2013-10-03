package org.applause.lang.generator.android.datasource

import com.google.inject.Inject
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.applauseDsl.DataSource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.applause.lang.generator.android.extensions.TypeExtensions
import org.applause.lang.generator.android.BoilerplateExtensions
import org.applause.lang.generator.android.extensions.ImportManagerExtensions
import org.applause.lang.generator.android.AndroidOutputConfigurationProvider
import org.applause.lang.base.ImportManager
import org.applause.lang.applauseDsl.Entity

class JSONConverterCompiler {

	@Inject extension TypeExtensions
	@Inject extension BoilerplateExtensions
	@Inject extension ImportManagerExtensions

	@Inject ImportManagerFactory importManagerFactory

	def compile(DataSource it, IFileSystemAccess fsa) {
		fsa.generateFile(converterFileName, AndroidOutputConfigurationProvider.OUTPUT_MODEL, compile)
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
		«importManager.addImport('java.lang.reflect.Type')»
		«importManager.addImport('java.io.InputStreamReader')»
		«importManager.addImport('org.json.JSONArray')»
		«importManager.addImport('retrofit.converter.Converter')»
		«importManager.addImport('retrofit.mime.MimeUtil')»
		«importManager.addImport('retrofit.mime.TypedInput')»
		«val entity = outlets.get(0).yields.type as Entity»
		«importManager.addImport(entity.namespace + '.entities.' + entity.typeName)»
		«val variableName = entity.name.toFirstLower»
		class «typeName»JSONConverter implements Converter {
		
			override fromBody(TypedInput body, Type type) {
				var charset = if(body.mimeType == null) 'UTF-8' else MimeUtil.parseCharset(body.mimeType)
				var InputStreamReader reader = null
				val sb = new StringBuilder
				try {
					reader = new InputStreamReader(body.in, charset)
					var buffer = newCharArrayOfSize(512)
					var int count
					while((count = reader.read(buffer, 0, buffer.length)) != -1) {
						sb.append(buffer, 0, count)
					}
				} finally {
					if(reader != null) {
						reader.close
					}
				}
				new JSONArray(sb.toString).to«entity.name»List
			}
		
			override toBody(Object object) {
				null
			}
		
			def to«entity.name»List(JSONArray it) {
				var index = -1
				val length = length
				val «variableName»List = <«entity.name»>newArrayList
				while((index = index + 1) < length) {
					val «variableName»JSON = optJSONObject(index)
					val «variableName» = new «entity.name»
					«variableName».title_ = «variableName»JSON.optJSONObject('payload')?.optJSONObject('issue')?.optString('title')
					«variableName».repoName = «variableName»JSON.optJSONObject('repo')?.optString('name')
					«variableName».type = «variableName»JSON.optString('type')
					«variableName»List += «variableName»
				}
				«variableName»List
			}
		}
	'''
	
}