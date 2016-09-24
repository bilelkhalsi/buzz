require.config({
    paths: {
        "angular": "../libs/angular/angular",
         "angular-material": "../libs/angular-material/angular-material",
         "angular-animate": "../libs/angular-animate/angular-animate",
         "angular-aria": "../libs/angular-aria/angular-aria",
         "angular-messages": "../libs/angular-messages/angular-messages",
         "leaflet": "../libs/leaflet/dist/leaflet",
         "leaflet-simple-markers": "../static-libs/leaflet.SimpleMarkers/lib/Control.SimpleMarkers"
    },
    shim: {
        "angular": {
            exports: "angular"
        },
        "angular-animate" : {
            deps : ["angular"]
        },
        "angular-aria" : {
            deps : ["angular"]
        },
        "angular-messages" : {
            deps : ["angular"]
        },
        "angular-material": {
            deps : ["angular", "angular-animate", "angular-aria", "angular-messages"]
        },
        "leaflet" : {
            exports : "L"
        },
        "leaflet-simple-markers": {
            deps : ["leaflet"]
        }
    },
    packages: [
        "bu-map",
        "bu-settings",
        "bu-map-control"
    ]
});
require(["angular", "bu-map"], function (angular) {
  angular.bootstrap(document, ["buMap"]);
});
