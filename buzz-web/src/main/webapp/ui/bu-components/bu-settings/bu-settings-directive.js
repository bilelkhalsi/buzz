define(["angular",
       "bu-settings/bu-settings",
       "bu-settings/bu-settings-controller"], function(angular){
    angular.module("buSettings")
    .directive("buSettings", function(){
        return {
            restrict : "E",
            controller : "buSettingsController",
            controllerAs : "ctrl",
            templateUrl : "./bu-components/bu-settings/bu-settings-template.html",
            link : function(scope, element, attrs, ctrl){
                console.log("bu-settings");
            }
        }
    });
});
