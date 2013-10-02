package org.applause.lang.generator.ios.app

import com.google.inject.Inject
import org.applause.lang.generator.ios.BoilerplateExtensions
import org.applause.lang.generator.ios.IosOutputConfigurationProvider
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.applause.util.xcode.project.XcodeGroup
import org.eclipse.emf.ecore.resource.Resource

class MainMethodCompiler {

	@Inject extension BoilerplateExtensions

	/**
	 * Main entry point for the main method compiler.
	 */
	def compile(Resource resource, ProjectFileSystemAccess pfsa, XcodeGroup group) {
		pfsa.createModuleFile(group, IosOutputConfigurationProvider.OUTPUT_APP, 'main.m', createMainMethodFile)
	}

	def private createMainMethodFile() '''
		«fileHeader»
		
		#import "AppDelegate.h"
		
		int main(int argc, char * argv[])
		{
		    @autoreleasepool {
		        return UIApplicationMain(argc, argv, nil, NSStringFromClass([AppDelegate class]));
		    }
		}
	'''

}
