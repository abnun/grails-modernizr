class ModernizrGrailsPlugin {
    // the plugin version
    def version = "1.7.2"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.6 > *"
    // the other plugins this plugin depends on
    //def dependsOn = [resources:'1.0-RC2-SNAPSHOT > *']

	//def loadAfter = ['resources']
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def author = "Markus Mueller"
    def authorEmail = "abnun@gmx.de"
    def title = "Modernizr Javascript Library"
    def description = '''Provides the Modernizr Javascript library resource files from http://www.modernizr.com/'''

	def scm = [ url: "https://github.com/abnun/grails-modernizr/" ]

	// URL to the plugin's documentation
	def documentation = "https://github.com/abnun/grails-modernizr/"

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
