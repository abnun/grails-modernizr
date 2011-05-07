# Modernizr Plugin

Provides the Modernizr Javascript library resource files from [http://www.modernizr.com/](http://www.modernizr.com/).
The resources are declared inside the file `/grails-app/conf/ModernizrPluginResources.groovy`, so you have to use the Resources
Framework ([http://grails.org/plugin/resources](http://grails.org/plugin/resources)) to take advantage of this plugin.

## Installation

Use either the command:

    grails install-plugin modernizr

or add this dependency to `BuildConfig.groovy` (Grails 1.3+ only):

    build ":modernizr:1.7"

Don't forget to specify the version you want in the latter example (1.7 may not be the latest when you read
this).

## History

### 1.7.2
Includes Changes from commit [3300fe033c4b583fa5dd](https://github.com/abnun/grails-modernizr/commit/3300fe033c4b583fa5dd84568f7a9345430351cb) (thanks again to [robfletcher](https://github.com/robfletcher) :) )

### 1.7.1
Includes Changes from commit [8d7120a52850a58ac239](https://github.com/abnun/grails-modernizr/commit/8d7120a52850a58ac239483bb50aff3084e8e675) (thanks to [robfletcher](https://github.com/robfletcher))

### 1.7
Initial Release (Modernizr 1.7).