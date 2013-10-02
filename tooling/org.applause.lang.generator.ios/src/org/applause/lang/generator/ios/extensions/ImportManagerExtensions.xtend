package org.applause.lang.generator.ios.extensions

import org.applause.lang.base.ImportManager

class ImportManagerExtensions {

	def headerImports(ImportManager it) '''
		«imports.map['#import "' + it + '.h"'].join('\n')»
		
	'''
	
	def frameworkImports(ImportManager it) '''
		«imports.map['#import ' + it].join('\n')»
	'''
	
}