
angular.module('mini-spa',['ngRoute'])
        .config(['$routeProvider',function($routeProvider){
            $routeProvider.when('/',{
                                        templateUrl: 'fragments/home.html',
                                        controller: 'homeController'
            }).when('/contact',{
                templateUrl: 'fragments/contact.html',
                controller: 'contactController'
            }).when('/about',{
                templateUrl: 'fragments/about.html',
                controller: 'aboutController'
            })
        
        }]).controller('homeController',['$scope',function($scope){
            $scope.data="Inside Home Controller"
        }]).controller('contactController',['$scope',function($scope){
            $scope.data="Inside contact Controller"
        }]).controller('aboutController',['$scope',function($scope){
            $scope.data="Inside about Controller"
        }])