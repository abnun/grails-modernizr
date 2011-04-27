// Define the resources for exposure via Resources plugin
modules = {
	'modernizr' {
		resource id: 'js', url: [plugin: 'modernizr', dir: 'js/modernizr', file: 'modernizr-1.7.min.js'],
				disposition:'head', nominify: true
	}
}