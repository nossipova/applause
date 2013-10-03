package org.applause.lang.generator.ios.app

import com.google.inject.Inject
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.applause.util.xcode.project.CLanguageDialect
import org.applause.util.xcode.project.CxxLanguageDialect
import org.applause.util.xcode.project.GCCVersion
import org.applause.util.xcode.project.IOSVersion
import org.applause.util.xcode.project.SDKRoot
import org.eclipse.emf.ecore.resource.Resource

import static extension org.applause.util.xcode.project.Path.*
import static extension org.applause.util.xcode.project.XcodeBuildConfigurationSettings.*

class AppCompiler {
	
	static final String FRAMEWORK_PATH = 'System/Library/Frameworks/'
	
	@Inject AppDelegateCompiler appDelegateCompiler
	@Inject PrecompiledHeaderCompiler pchCompiler
	@Inject InfoPlistCompiler infoPlistCompiler
	@Inject MainMethodCompiler mainMethodCompiler
	
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		setupFrameworks(resource, pfsa)
		setupBuildConfigurations(resource, pfsa)
		
		appDelegateCompiler.compile(resource, pfsa)
		
		// TODO Add them to the 'Supporting Files' group. 
		pchCompiler.compile(resource, pfsa, pfsa.mainSourceGroup)
		infoPlistCompiler.compile(resource, pfsa, pfsa.mainSourceGroup)
		mainMethodCompiler.compile(resource, pfsa, pfsa.mainSourceGroup)
	}
	
	// TODO figure out a smart way how individual compilers can add frameworks.
	// Should be similar to the ImportManager. 
	// For now, let's just add them here. 	
	def setupFrameworks(Resource resource, ProjectFileSystemAccess pfsa) {
		val frameworksGroup = pfsa.frameworksGroup
		pfsa.appTarget.frameworkBuildPhase.add(frameworksGroup.createFrameworkFile((FRAMEWORK_PATH + 'UIKit.framework').toPath))		
		pfsa.appTarget.frameworkBuildPhase.add(frameworksGroup.createFrameworkFile((FRAMEWORK_PATH + 'Foundation.framework').toPath))

		// RestKit dependencies
//		pfsa.appTarget.frameworkBuildPhase.add(frameworksGroup.createFrameworkFile(('libRestKit.a').toPath))
		pfsa.appTarget.frameworkBuildPhase.add(frameworksGroup.createFrameworkFile((FRAMEWORK_PATH + 'CFNetwork.framework').toPath))
		pfsa.appTarget.frameworkBuildPhase.add(frameworksGroup.createFrameworkFile((FRAMEWORK_PATH + 'CoreData.framework').toPath))
		pfsa.appTarget.frameworkBuildPhase.add(frameworksGroup.createFrameworkFile((FRAMEWORK_PATH + 'CoreGraphics.framework').toPath))
		pfsa.appTarget.frameworkBuildPhase.add(frameworksGroup.createFrameworkFile((FRAMEWORK_PATH + 'MobileCoreServices.framework').toPath))
		pfsa.appTarget.frameworkBuildPhase.add(frameworksGroup.createFrameworkFile((FRAMEWORK_PATH + 'Security.framework').toPath))
		pfsa.appTarget.frameworkBuildPhase.add(frameworksGroup.createFrameworkFile((FRAMEWORK_PATH + 'SystemConfiguration.framework').toPath))
	}
	
	def setupBuildConfigurations(Resource resource, ProjectFileSystemAccess pfsa) {
		
		// build configuration for the global project
		pfsa.project => [
			createBuildConfiguration("Release") => [
				alwaysSearchUserPaths = false
				enableArc = true
				warnDuplicateMethods = true
				warnAboutReturnType = true
				warnUninitializedAutos = true
				warnUnusedVariables = true
				validateProduct = true
				SDKRoot = SDKRoot::iPhoneOS
				IOSDeploymentTarget = IOSVersion::iOS_70
				stripDebugSymbolsDuringCopy = true
				codeSigningIdentity = '"iPhone Developer"'
				architectures = '"$(ARCHS_STANDARD_32_BIT)"'
				gccVersion = GCCVersion::LLVM_41
				CLanguageDialect = CLanguageDialect::GNU99
				cxxLanguageDialect = CxxLanguageDialect::CXX_11
				blockAssertions = true
				otherLinkerFlags = '"-ObjC -all_load"'
				headerSearchPaths = '"\\"$(BUILT_PRODUCTS_DIR)/../../Headers\\""'
			]
			
			createBuildConfiguration("Debug") => [
				alwaysSearchUserPaths = false
				enableArc = true
				warnDuplicateMethods = true
				warnAboutReturnType = true
				warnUninitializedAutos = true
				warnUnusedVariables = true
				validateProduct = true
				SDKRoot = SDKRoot::iPhoneOS
				IOSDeploymentTarget = IOSVersion::iOS_70
				stripDebugSymbolsDuringCopy = true
				codeSigningIdentity = '"iPhone Developer"'
				architectures = '"$(ARCHS_STANDARD_32_BIT)"'
				gccVersion = GCCVersion::LLVM_41
				CLanguageDialect = CLanguageDialect::GNU99
				cxxLanguageDialect = CxxLanguageDialect::CXX_11
				blockAssertions = true
				otherLinkerFlags = '"-ObjC -all_load"'
				headerSearchPaths = '"\\"$(BUILT_PRODUCTS_DIR)/../../Headers\\""'
			]
		]
		
		// build configurations for the app target
		pfsa.appTarget => [
			getBuildConfiguration("Release") => [
				
			]
			getBuildConfiguration("Debug") => [
				// why is this just here? Shouldn't it go into the main target configuration?
				productName = '"$(TARGET_NAME)"'
				wrapperExtension = "app"
			]
		]
		
	}
	
}