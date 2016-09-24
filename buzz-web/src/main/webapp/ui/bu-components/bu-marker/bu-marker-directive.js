define(["angular",
        "leaflet",
       "bu-marker/bu-marker",
       "bu-marker/bu-marker-controller"], function(angular, L){
    angular.module("bu-marker")
    .directive("buMarker", function(){
        return {
            restrict : "EA",
            controller: "buMarkerController",
            controllerAs: "ctrl",
            scope: {
                marker: "=",
            },
            link: function(scope, element, attrs, ctrl){

            }
        };
    });

});
