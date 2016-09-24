define(["angular",
        "bu-settings",
        "bu-map-control",
        "angular-material"], function(angular){
    var buMap = angular.module("buMap", ["ngMaterial", "buSettings", "buMapControl"]);
    buMap.factory('buMapConfig', [function(){
        return {
            geoServerUrl : "http://{s}.tile.osm.org/{z}/{x}/{y}.png",
            mapAttribution : "&copy; <a href=\"http://osm.org/copyright\">OpenStreetMap</a> contributors",
            defaultZoom :  13,
            defaultPosition : [51.505, -0.09]
        };
    }]);
});
