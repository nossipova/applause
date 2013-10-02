package org.applause.lang.generator.ios.app

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Application
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.generator.ios.BoilerplateExtensions
import org.applause.lang.generator.ios.IosOutputConfigurationProvider
import org.applause.lang.generator.ios.ProjectExtensions
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.applause.lang.generator.ios.extensions.ImportManagerExtensions
import org.applause.util.xcode.project.XcodeGroup
import org.eclipse.emf.ecore.resource.Resource

import static extension org.applause.util.xcode.project.XcodeBuildConfigurationSettings.*
import static extension org.applause.util.xcode.project.XcodeProjectObjectExtensions.*

class PrecompiledHeaderCompiler {

	@Inject extension BoilerplateExtensions

	@Inject extension ProjectExtensions

	@Inject ImportManagerFactory importManagerFactory

	@Inject extension ImportManagerExtensions

	// outlet name
	public String APP_OUTPUT = IosOutputConfigurationProvider::OUTPUT_APP

	/**
	 * Main entry point for the precompiled header compiler.
	 */
	def compile(Resource resource, ProjectFileSystemAccess pfsa, XcodeGroup group) {

		resource.allContents.filter(typeof(Application)).forEach [
			val fileName = resource.appName + "-Prefix.pch"
			val pchFile = pfsa.createPrecompiledHeaderFile(group, APP_OUTPUT, fileName, it.compilePrecompiledHeader)
			pfsa.appTarget => [
				getBuildConfiguration("Release") => []
				getBuildConfiguration("Debug") => [
					precompilePrefixHeader = true
					val pchFilePath = pchFile.projectRelativePath
					prefixHeaderFileName = '"' + pchFilePath + '"'
				]
			]
		]

	}

	/**
	 * Compiles the header file for precompiled header files for the project.
	 */
	def compilePrecompiledHeader(Application it) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create()»
		«importManager.addImport("<UIKit/UIKit.h>")»
		«importManager.addImport("<Foundation/Foundation.h>")»
		«importManager.addImport("<SystemConfiguration/SystemConfiguration.h>")»
		«importManager.addImport("<MobileCoreServices/MobileCoreServices.h>")»
		«importManager.addImport("\"RestKit/RestKit.h\"")»
		«compileInterface(importManager)»
	'''

	def compileInterface(Application app, ImportManager manager) '''
		//
		// Prefix header for all source files of the 'GithubBrowser' target in the 'GithubBrowser' project
		//
		
		#import <Availability.h>
		
		#ifndef __IPHONE_6_0
		#warning "This project uses features only available in iOS SDK 6.0 and later."
		#endif
		
		#ifdef __OBJC__
			«manager.frameworkImports»
		#endif
	'''
}
