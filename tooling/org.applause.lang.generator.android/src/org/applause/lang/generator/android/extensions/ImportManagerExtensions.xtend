package org.applause.lang.generator.android.extensions

import org.applause.lang.base.ImportManager

class ImportManagerExtensions {

	def imports(ImportManager it) '''
		«imports.map['import ' + it].join('\n')»
		
	'''
}