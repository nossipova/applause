package org.applause.util.xcode.project

import java.util.ArrayList
import org.applause.util.xcode.projectfile.pbxproj.Encoding
import org.applause.util.xcode.projectfile.pbxproj.Group
import org.applause.util.xcode.projectfile.pbxproj.Language
import org.applause.util.xcode.projectfile.pbxproj.PbxprojFactory
import org.applause.util.xcode.projectfile.pbxproj.Project
import org.applause.util.xcode.projectfile.pbxproj.ProjectModel
import org.applause.util.xcode.projectfile.pbxproj.ProjectObject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.serializer.ISerializer

import static org.applause.util.xcode.project.XcodeGroup.*
import static org.applause.util.xcode.project.XcodeProjectUtils.*
import static org.applause.util.xcode.project.XcodeTarget.*

import static extension org.applause.util.xcode.project.XcodeBuildConfigurationList.*

class XcodeProject extends XcodeProjectBase {
	@Property ProjectModel pbx_projectModel
	@Property Project pbx_project
	XcodeBuildConfigurationList buildConfigurationList
	String projectPath
	
	new() {	
	}
	
	def init(String path) {
		projectPath = path
		
		pbx_project = PbxprojFactory::eINSTANCE.createProject
		pbx_project.name = generateUUID
		pbx_project.isa = 'PBXProject';
		pbx_project.lastupgradeCheck = 440
		pbx_project.organisationName = '"Applause"'
		// project.buildConfigurationList
		pbx_project.compatibilityVersion = 'Xcode 3.2'
		pbx_project.developmentRegion = Language::ENGLISH
		pbx_project.hasScannedForEncodings = 0
		pbx_project.knownRegions.add('en')
		pbx_project.projectDirPath = ''
		pbx_project.projectRoot = ''
		
		pbx_projectModel = PbxprojFactory::eINSTANCE.createProjectModel
		pbx_projectModel.archiveVersion = 1
		pbx_projectModel.objectVersion = 42
		pbx_projectModel.encoding = Encoding::UTF8
		pbx_projectModel.objects.add(pbx_project)
		pbx_projectModel.rootObject = pbx_project	
		resource()	
		
		createMainGroup
		createProductsGroup
		
		buildConfigurationList = this.createBuildConfigurationList()
//		buildConfigurationList.createBuildConfiguration('Release')
//		buildConfigurationList.createBuildConfiguration('Debug')
		buildConfigurationList.defaultConfigurationName = 'Release'
		pbx_project.buildConfigurationList = buildConfigurationList.pbx_BuildConfigurationList
	}
	
	def resourceSet() {
		reg.getResourceServiceProvider(URI::createFileURI(pbxProjectFileName)).get(typeof(XtextResourceSet))
	}
	
	Resource resource
	def private resource() {
		if (resource == null) {
			resource = resourceSet.createResource(URI::createFileURI(pbxProjectFileName) );
			resource.contents.add(pbx_projectModel)
		}
		resource		
	}

	def serializer() {
		reg.getResourceServiceProvider(URI::createFileURI(pbxProjectFileName)).get(typeof(ISerializer))
	}
	
	override toString() {
		resource()
		val children = mainGroup().pbx_group.children
		
		// IDEA: use numerical value to compare groups. Frameworks and Products group should have a rather high value, others a low one.
		// make sure the order is SourceGroup > TestsGroup > Frameworks > Products
		val sorted = children.sort[a, b | a.sortValue.compareTo(b.sortValue)]
		
		// kinda circumstancial, but sortInplace yields "No duplicates constraint is violated"
		mainGroup().pbx_group.children.clear
		mainGroup().pbx_group.children.addAll(sorted)
		
		val out = serializer.serialize(pbx_projectModel, SaveOptions::newBuilder.format.noValidation.options)
		out
	}
	
	def sortValue(ProjectObject object) { 
		object.name
	}
	
	def sortValue(Group group) {
		group.groupName
	}
	
	def save() {
		resource().save(null);
	}
	
	def String pbxProjectFileName() {
		projectPath + '/project.pbxproj'
	}
	
	XcodeGroup mainGroup
	
	def createMainGroup() {
		mainGroup = createMainGroup(this)
	}
	
	def mainGroup() {
		if (mainGroup == null) {
			createMainGroup(this)
		}
		mainGroup
	}
	
	XcodeGroup productsGroup
	
	def createProductsGroup() {
		productsGroup = createProductsGroup(this)
	}
	
	def productsGroup() {
		if (productsGroup == null) {
			createProductsGroup
		}
		productsGroup
	}
	
	XcodeGroup frameworksGroup
	
	def createFrameworksGroup() {
		frameworksGroup = createFrameworksGroup(this)
	}
	
	def frameworksGroup() {
		if (frameworksGroup == null) {
			createFrameworksGroup
		}
		frameworksGroup
	}
	
	ArrayList<XcodeFile> files = newArrayList()
	
	def files() {
		files
	}
	
	def createTarget(String name) {
		createTarget(this, name)
	}
	
	ArrayList<XcodeTarget> targets = newArrayList()
	def targets() {
		targets
	}
	
	
	// TODO remove!
	def createApplicationTarget(String name) {
		createApplicationTarget(this, name)
	}
	
	def createApplicationTarget(String name, XcodeFile applicationFile) {
		createApplicationTarget(this, name, applicationFile)
	}
	
	def createBundleTarget(String name) {
		createBundleTarget(this, name)
	}
	
	def createSourceBuildPhase() {
		new XcodeSourceBuildPhase(this)
	}
	
	def createFrameworkBuildPhase() {
		new XcodeFrameworkBuildPhase(this)
	}
	
	def createCopyBundleResourcesBuildPhase() {
		new XcodeCopyBundleResourcesBuildPhase(this)
	}
	
	def createBuildConfiguration(String name) {
		buildConfigurationList.createBuildConfiguration(name)
	}
	
	def getBuildConfiguration(String name) {
		buildConfigurationList.buildConfiguration(name)
	}
	
	def setOrganizationName(String name) {
		pbx_project.organisationName = name
	}
	
	def organizationName() {
		pbx_project.organisationName
	}
	
	def setClassPrefix(String prefix) {
		pbx_project.classPrefix = prefix
	}
	
	def classPrefix() {
		pbx_project.classPrefix
	}
	
	def lastUpgradeCheck() {
		pbx_project.lastupgradeCheck
	}
	
	def compatibilityVersion() {
		pbx_project.compatibilityVersion
	}
	
	def developmentRegion() {
		pbx_project.developmentRegion.toString
	}
	
	def knownRegions() {
		pbx_project.knownRegions
	}
	
	def hasScannedForEncodings() {
		pbx_project.hasScannedForEncodings != 0
	}
	
}