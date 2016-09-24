define(["angular",
       "bu-settings/bu-settings"], function(angular){
    angular.module("buSettings")
    .controller("buSettingsController", ["$scope", "$mdBottomSheet", "$log", function($scope, $mdBottomSheet, $log){
          $scope.items = [
            { name: 'Hangout', icon: 'hangout' },
            { name: 'Mail', icon: 'mail' },
            { name: 'Message', icon: 'message' },
            { name: 'Copy', icon: 'copy2' },
            { name: 'Facebook', icon: 'facebook' },
            { name: 'Twitter', icon: 'twitter' },
          ];
          $scope.listItemClick = function($index) {
            var clickedItem = $scope.items[$index];
            $mdBottomSheet.hide(clickedItem);
          };

    }]);
});
