angular.module('acme-spa',['ngRoute','ngSanitize'])
       .config(['$routeProvider',function($routeProvider){
             $routeProvider.when('/',{
                 templateUrl: 'home.html'
             }).when('/productlist',{
                templateUrl: 'productlist.html',
                controller: 'listController'
            }).when('/productdescription/:name',{
                templateUrl: 'productdescription.html',
                controller: 'detailController'
            })
            }]).factory('productdataservice', ['$rootScope','$http', function ($rootScope,$http) {
                var productService = {};
                productService.getData=function(){
                    // return $http.get('https://api.myjson.com/bins/1aeq5r/')
                    return $http.get('products.json')
                }
                return productService;
            }]).controller('listController',['$scope', 'productdataservice','$rootScope','$location','$routeParams',function($scope, productdataservice,$rootScope,$location,$routeParams){
                $scope.isfilter=false;
                $scope.getkeys=function(){
                    $scope.isfilter=true;
                }
                productdataservice.getData().then((r)=>{
                    console.log(r.data)
                    $scope.result=r.data;

                })
                $rootScope.buttonstatus="Hide Image";
                $rootScope.isVisible=true
                $rootScope.toggleButton=function(){
                    if(  $rootScope.isVisible){
                        $rootScope.buttonstatus="show Image";
                        $rootScope.isVisible=false
                    }
                    else{
                        $rootScope.buttonstatus="Hide Image";
                        $rootScope.isVisible=true
                    }
                }
          
            }]).controller('detailController',['$scope', 'productdataservice','$routeParams','$location',function( $scope,productdataservice,$routeParams,$location){
                productdataservice.getData().then((r)=>{
                    console.log(r.data)
                    for(var i=0;i<r.data.length;i++){
                       
                        if(r.data[i].productName==$routeParams.name){
                            console.log(r.data[i].productName)
                            $scope.result=r.data[i]
                            
                        }
                    }
                 })
                $scope.back=function(){
                    $location.path('/productlist')
                }
            }]).directive('star', function () {
                var directive = {
                    template: '<i class="fa fa-star" aria-hidden="true"></i>',
                    restrict: 'E'
                };
                return directive;
            })
        .filter('Starfilter', function () {
                return function (input) {
                    let images="";
                    let index;
                    for(index=1;index<input;index++)
                    {
                        images=images+"<i class='fa fa-star' aria-hidden='true'></i>";
                    }
                    index--;
                    console.log("index"+index);
                    let temp=input-index;
                    console.log("temp"+temp);
                    if(temp>0)
                    {
                        index++;
                        images=images+"<i class='fa fa-star-half' aria-hidden='true'></i>";
                    }
                    return images;
                }
            });
        