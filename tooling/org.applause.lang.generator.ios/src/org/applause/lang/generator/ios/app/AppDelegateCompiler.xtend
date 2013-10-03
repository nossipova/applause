package org.applause.lang.generator.ios.app

import com.google.inject.Inject
import org.applause.lang.applauseDsl.Application
import org.applause.lang.base.ImportManager
import org.applause.lang.base.ImportManagerFactory
import org.applause.lang.base.ScreenflowExtensions
import org.applause.lang.generator.ios.BoilerplateExtensions
import org.applause.lang.generator.ios.IosOutputConfigurationProvider
import org.applause.lang.generator.ios.ProjectFileSystemAccess
import org.applause.lang.generator.ios.TypeExtensions
import org.eclipse.emf.ecore.resource.Resource
import org.applause.lang.generator.ios.extensions.ImportManagerExtensions
import org.applause.lang.applauseDsl.DataSource
import org.applause.lang.applauseDsl.Model

class AppDelegateCompiler {
	
	@Inject extension BoilerplateExtensions
	
	@Inject extension ScreenflowExtensions
	
	@Inject extension TypeExtensions
	
	@Inject ImportManagerFactory importManagerFactory
	
	@Inject extension ImportManagerExtensions
	
	// outlet name
	public String APP_OUTPUT = IosOutputConfigurationProvider::OUTPUT_APP
	
	/**
	 * Main entry point for the entity compiler.
	 */
	def compile(Resource resource, ProjectFileSystemAccess pfsa) {
		val appGroup = pfsa.mainSourceGroup
		
		resource.allContents.filter(typeof(Application)).forEach[
			pfsa.createHeaderFile(appGroup, APP_OUTPUT, "AppDelegate.h", it.compileHeader)
			pfsa.createModuleFile(appGroup, APP_OUTPUT, "AppDelegate.m", it.compileModule)
		]
	}
	
	// -- HEADER
	
	/**
	 * Compiles the header file for the app delegate
	 */
	def compileHeader(Application app) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create()»
		«val body = app.compileInterface(importManager)»
		«importManager.headerImports»
		«body»
	'''
	
	def compileInterface(Application app, ImportManager manager) '''		
		@interface AppDelegate : UIResponder <UIApplicationDelegate>
		
		@property (strong, nonatomic) UIWindow *window;
		
		@end
	'''
	
	// -- MODULE	
	
	/** 
	 * Compiles the module file for the app delegate
	 */
	def compileModule(Application it) '''
		«fileHeader»
		
		«val importManager = importManagerFactory.create()»
		«val body = compileImplementation(importManager)»
		«importManager.headerImports»
		«body»
	'''
	
	def compileImplementation(Application it, ImportManager manager) '''
		«manager.addImport('AppDelegate')»
		@interface AppDelegate ()
		
		@property(nonatomic, strong) UINavigationController *navigationController;
		
		@end

		@implementation AppDelegate

		- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions
		{
			self.window = [[UIWindow alloc] initWithFrame:[[UIScreen mainScreen] bounds]];

			[self initRestKit];
			
			«compileRootViewControllerSetup(manager)»

			self.window.backgroundColor = [UIColor whiteColor];
			[self.window makeKeyAndVisible];
			return YES;
		}

		- (void)initRestKit
		{
			NSURL *baseURL = [NSURL URLWithString:@"https://api.github.com"];
			RKObjectManager *objectManager = [RKObjectManager managerWithBaseURL:baseURL];
			objectManager.requestSerializationMIMEType = RKMIMETypeJSON;
«««			// TODO
«««			[objectManager.client setValue:[[[UIDevice currentDevice] identifierForVendor] UUIDString] forHTTPHeaderField:@"X-UDID"];
«««			objectManager.client.authenticationType = RKRequestAuthenticationTypeHTTPBasic;
«««			// for some reason, ETags don't seem to work properly. RK doesn't fetch although the backend clearly has been updated.
«««			objectManager.client.cachePolicy = RKRequestCachePolicyDefault; // RKRequestCachePolicyLoadIfOffline | RKRequestCachePolicyTimeout; // | RKRequestCachePolicyEtag
			[RKObjectManager setSharedManager:objectManager];
			
			[AFNetworkActivityIndicatorManager sharedManager].enabled = YES;
			
			[[RKObjectManager sharedManager].HTTPClient setAuthorizationHeaderWithUsername:@"" password:@""];

		    NSIndexSet *successfulStatusCodes = RKStatusCodeIndexSetForClass(RKStatusCodeClassSuccessful);
		    
		    «val dataSource = (eContainer as Model).elements.filter(DataSource).head»
		    «manager.addImport(dataSource.typeName)»
		    «dataSource.name.toFirstUpper»MappingProvider *mappingProvider = [«dataSource.name.toFirstUpper»MappingProvider new];
		    RKResponseDescriptor *responseDescriptor = [RKResponseDescriptor responseDescriptorWithMapping:[mappingProvider eventRequestMapping] method:RKRequestMethodGET pathPattern:nil keyPath:nil statusCodes:successfulStatusCodes];
		    [objectManager addResponseDescriptor:responseDescriptor];
		}

		@end
	'''
	
	def private startScreenTypeName(Application it) {
		startScreen.typeName
	}
	
	def private startScreenVariableName(Application it) {
		startScreenTypeName.toFirstLower
	}
	
	def compileRootViewControllerSetup(Application it, ImportManager manager) '''
		«manager.addImport(startScreenTypeName)»
		«manager.serialize(startScreenTypeName)» *«startScreenVariableName» = [[«startScreenTypeName» alloc] init];
		self.navigationController =  [[UINavigationController alloc] initWithRootViewController:«startScreenVariableName»];
		self.window.rootViewController = self.navigationController;	
	'''

}