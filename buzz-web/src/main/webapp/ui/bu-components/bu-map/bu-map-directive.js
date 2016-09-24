define(["angular",
    "leaflet",
    "leaflet-simple-markers",
    "bu-map/bu-map",
    "bu-map/bu-map-controller"], function(angular, L){
        console.log("directive");
        angular.module("buMap")
        .directive("buMap", ["buMapConfig", "$log", function(buMapConfig, $log){
            return {
                restrict : "E",
                controller : "buMapController",
                controllerAs : "ctrl",
                scope : {
                    mode: "=",
                    zoom: "=",
                    lat: "=",
                    long: "="
                },
                templateUrl : "./bu-components/bu-map/bu-map-template.html",
                link : function(scope, element, attrs, ctrl){
                    var  options = {
                         position: 'topleft',
                         add_control: true,
                         delete_control: false,
                         allow_popup: true,
                         marker_icon: undefined,
                         marker_draggable: true,
                         add_marker_callback: undefined,
                         remove_marker_callback: undefined,
                         drag_marker_callback : function(e){console.log(e.target.getLatLng());}
                    };

                    init();
                    var map = L.map('bu-map', { zoomControl:false }).setView([scope.lat, scope.long],scope.zoom);
                    var marker_controls = new L.Control.SimpleMarkers(options);
                    L.tileLayer(buMapConfig.geoServerUrl, {attribution: buMapConfig.mapAttribution}).addTo(map);
                    //map.addControl(marker_controls);

                    scope.map = map;
                    scope.zoomIn = zoomIn;
                    scope.zoomOut = zoomOut;
                    scope.ignore = ignore;
                    /**
                     * WATCHERS
                     */
                    scope.$watch("zoom", function(newValue, oldValue){
                        map.setZoom(newValue);
                    });
                    scope.$watchGroup(["lat", "long"], function(newValues, oldValues){
                        map.setView(newValues, scope.zoom);
                    });

                    function zoomIn($event){
                        scope.map.zoomIn();
                        $event.stopPropagation();
                    }

                    function zoomOut($event){
                        scope.map.zoomOut();
                        $event.stopPropagation();
                    }

                    function ignore($event){
                       $event.stopPropagation();
                    }

                    function init(){
                        scope.lat = scope.lat ? scope.lat : buMapConfig.defaultPosition[0];
                        scope.long = scope.long ? scope.long : buMapConfig.defaultPosition[1];
                        scope.zoom = scope.zoom ? scope.zoom : buMapConfig.defaultZoom;
                    }
                }
            };
        }]);
    });
