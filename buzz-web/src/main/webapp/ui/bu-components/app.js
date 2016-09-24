require(["angular", "bu-map"], function(angular){
	var app = {};
	app.init = function() {
		angular.bootstrap(document, ["buMap"]);
	};
	return  app;
});