define(["angular",
       "bu-map-control/bu-map-control",
       "bu-map-control/bu-map-control-controller"], function(angular){
    angular.module("buMapControl")
    .directive("buMapControl", function(){
        return{
            restrict: "E",
            controller: "buMapControlController",
            controllerAs: "ctrl",
            templateUrl : "./bu-components/bu-map-control/bu-map-control-template.html",
            link : function(scope, element, attrs, ctrl){

            }
        };
    });
});
