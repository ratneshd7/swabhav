var flag=0;
angular.module('employee-spa',['ngRoute'])
        .config(['$routeProvider',function($routeProvider){
            $routeProvider.when('/',{
                templateUrl: 'fragments/home.html',
                controller: 'homeController'
                }).when('/add',{
                    templateUrl: 'fragments/add.html',
                    controller: 'addController'
                    }).when('/edit/:id',{
                        templateUrl:'fragments/edit.html',
                        controller:'editController'
                    }).when('/login',{
                        templateUrl:'fragments/login.html',
                        controller:'authentication'
                    }).otherwise({
                        redirecctTo:'/'
                    })
            }]).factory('empServiceSpa',['$rootScope','$log', function ($rootScope,$log) {
                $rootScope.islogged=true;
                var factoryobject = {};
                var count = 1
                 $rootScope.authenticate=[{
                    username:"ratnesh",
                    password:"1234"
                },
                {
                    username:"manish",
                    password:"1234"
                }]
                var employee = [];

                    factoryobject.add=function(obj){
                        employee.push(obj)
                        
                     }
                
                factoryobject.get=function(){
                    return employee;
                }
                factoryobject.getById=function(id){
                return employee[id]
                }
                factoryobject.setDataById=function(obj,id){
                    employee[id]=obj
                    }
                    factoryobject.delete=function(id){
                        employee.splice(id,1)
                    }
                    factoryobject.getAuthenticate=function(obj){
                        var check=0;
                        for(var i=0;i<$rootScope.authenticate.length;i++){
                            $log.log(obj.username,obj.password)
                            if(obj.username==$rootScope.authenticate[i].username && obj.password==$rootScope.authenticate[i].password ){
                                check=1;
                                $log.log(check)
                                break;
                            }
                         
                            else{
                                    check=0;
                            }
                           
                        }
                        if(check==1)
                        return true;
                        else
                        return false;
                        
                    }
                return factoryobject;
            }]).controller('homeController',['$scope','empServiceSpa','$routeParams',function($scope,empServiceSpa,$routeParams){
             $scope.result = empServiceSpa.get();

             $scope.deleteData=function(i){
                empServiceSpa.delete(i)
             }
             
           
             }]).controller('addController',['$scope',"$location",'empServiceSpa',function($scope,$location,empServiceSpa){

               if(flag==0){
                   $location.path('/login')
                  
               }
               else if(flag==1){
                
                $scope.Employee = {
                    name: "",
                    date: "",
                    salary: "",
                    role: ""
                   }
                   
                   $scope.Employee.name=$scope.Employee.name
                   $scope.Employee.date=$scope.Employee.date
                   $scope.Employee.salary=$scope.Employee.salary
                   $scope.Employee.role=$scope.Employee.role
                   console.log($scope.Employee)
                   
                   $scope.AddData = function () {
                   empServiceSpa.add($scope.Employee)    
                   $location.path("/");
               
                }
            }
            }]).controller('editController',['$rootScope','$scope',"$location","$routeParams",'empServiceSpa',function($rootScope,$scope,$location,$routeParams,empServiceSpa){
               
                if(flag==0){
                    $location.path('/login')
                   
                }
                else if(flag==1){
                $scope.Employee = {
                    name: "",
                    date: "",
                    salary: "",
                    role: ""
                   }
                   
                        $scope.getData=empServiceSpa.getById($routeParams.id)
                        console.log($scope.getData);
                        console.log($scope.getData.name);

                        $scope.Employee.name=$scope.getData.name
                        $scope.Employee.date=$scope.getData.date
                        $scope.Employee.salary=$scope.getData.salary
                        $scope.Employee.role=$scope.getData.role
                        $scope.editData=function(){
                   
                       $scope.Employee.name=$scope.Employee.name
                       $scope.Employee.date=$scope.Employee.date
                       $scope.Employee.salary=$scope.Employee.salary
                       $scope.Employee.role=$scope.Employee.role
                       
                       $scope.setData=empServiceSpa.setDataById($scope.Employee, $routeParams.id)
                    

                    $location.path("/");
                }
            }
            }]).controller('authentication',['$scope',"$rootScope",'empServiceSpa','$location',function($scope,$rootScope,empServiceSpa,$location){
                
                    $scope.Authenticate={
                        username:"",
                        password:""
                    }
                    $scope.Authenticate.username=$scope.Authenticate.username
                    $scope.Authenticate.password=$scope.Authenticate.password
                    console.log( $scope.Authenticate)
                $scope.authenticate=function(){
                    var auth= empServiceSpa.getAuthenticate($scope.Authenticate)
                    console.log(auth)
                    if(auth==true)
                  {
                      flag=1;
                      $rootScope.islogged=false;
                      $location.path('/')
                  }
                  else
                  {
                      flag=0;
                      $location.path('/')
                  }
                }

                $rootScope.logout=function(){
                    $rootScope.islogged=true;
                    flag=0
                }
            }])
        