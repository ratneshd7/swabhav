angular.module('emp-spa',['ngRoute'])
        .config(['$routeProvider',function($routeProvider){
            $routeProvider.when('/login',{
                templateUrl: 'fragments/login.html',
                controller: 'loginController'
                }).when('/home',{
                    templateUrl: 'fragments/home.html',
                    controller: 'homeController'
                }).when('/add',{
                    templateUrl: 'fragments/add.html',
                    controller: 'addController'
                }).when('/edit/:id',{
                    templateUrl: 'fragments/edit.html',
                    controller: 'editController'
                })
            }]).factory('empService',['$rootScope','$log', function ($rootScope,$log) {
                    
                var serviceObj={}
                    $rootScope.user=[{
                        id:"101",
                        username:"ratnesh",
                        password:"12345",
                        employee:[{
                            name: "Ratnesh",
                            date: "12/12/2019",
                            salary: "50000",
                            role: "SE"
                        }]
                    }]

                    // $localStorage.setI

                    serviceObj.authenticate=function(username,password){
                        var check=0;
                        for(var i=0;i<$rootScope.user.length;i++){
                            $log.log($rootScope.user[i].username)
                            if(username==$rootScope.user[i].username && password==$rootScope.user[i].password){
                              
                               check=1
                                break;
                            }
                          }
                          if(check==1)
                          return $rootScope.user[i]
                          else
                          return false;

                    }
                    serviceObj.setStorage=function(name,obj){
                        var data=JSON.parse(localStorage.getItem('empDb'))
                        console.log(data)
                        for(var i=0;i<data.length;i++){
                            
                        if(name==data[i].username){
                            data[i].employee.push(obj);
                            localStorage.setItem('empDb', JSON.stringify(data))
                        }
                    }
                    }
                    serviceObj.getStorage=function(name){
                        var data=JSON.parse(localStorage.getItem('empDb'))
                        
                        for(var i=0;i<data.length;i++){
                            if(name==data[i].username){ 
                                return data[i].employee;
                            }
                    }
                }
                serviceObj.getDataById=function(name,id){
                   var data= serviceObj.getStorage(name)
                   return data[id];
                }

                serviceObj.updateStorage=function(name,obj,id){
                    var data=JSON.parse(localStorage.getItem('empDb'))
                   
                    for(var i=0;i<data.length;i++){
                        if(name==data[i].username){ 
                             data[i].employee[id]=obj;
                             localStorage.setItem('empDb', JSON.stringify(data))
                        }
                }
                }
                serviceObj.delete=function(name,id){
                    var data=JSON.parse(localStorage.getItem('empDb'))
                   
                    for(var i=0;i<data.length;i++){
                        if(name==data[i].username){ 
                             data[i].employee.splice(id,1);
                             localStorage.setItem('empDb', JSON.stringify(data))
                             return true;
                        }
                }
                }
                return serviceObj;
            }]).controller('loginController',['$scope','$location','$rootScope','empService',function($scope,$location,$rootScope,empService){
               $rootScope.keyuser;

               

        //        $window.onload = function() {
        //         alert("Angularjs call function on page load");
        //    };
                
                    $scope.$on('$viewContentLoaded', function() {
                        // $location.path('/login')
                     
                        var localval = window.localStorage.getItem('currentuser');
                                
                        console.log(localval);
                        if(localval != null )
                        { 
                            $rootScope.loggedusers=localval
                            $rootScope.islogged=true;
                            $rootScope.isout=true;
                            $rootScope.keyuser=localval
                        // $rootScope.display();
                        $location.path('/home')
                        }
                    })
                

                $scope.login=function(){
                   var username =$scope.username;
                    var password=$scope.password;
                   
                    $rootScope.resultobj=empService.authenticate(username,password)
                    if($rootScope.resultobj!=false){
                    if($rootScope.resultobj.username==username && $rootScope.resultobj.password==password){
                        $rootScope.islogged=true;
                        $rootScope.isout=true;
                        $rootScope.loggedusers=$rootScope.resultobj.username
                        $rootScope.keyuser=$rootScope.resultobj.username
                        window.localStorage.setItem("currentuser", $rootScope.keyuser);
                        $location.path('/home')
                    }
                    
                  }
                  else
                  alert("Enter Valid Data");
                }
            }]).controller('homeController',['$scope','$location','$rootScope','empService',function($scope,$location,$rootScope,empService){
               
                $rootScope.result=empService.getStorage($rootScope.keyuser)
               
                $rootScope.logout=function(){
                    window.localStorage.removeItem("currentuser", $rootScope.keyuser);
                    $rootScope.isout=false;
                 }
                 $rootScope.deleteData=function(i){
               
                    var status=empService.delete($rootScope.keyuser,i)
                    if(status==true)
                    $rootScope.result=empService.getStorage($rootScope.keyuser)
                 }
                 $rootScope.display=function(){
                    $rootScope.result=empService.getStorage($rootScope.keyuser)
                 }
            }]).controller('addController',['$scope','$location','$rootScope','empService',function($scope,$location,$rootScope,empService){
                   
                $scope.AddData=function(){
                    var addname=$scope.name;
                    var adddate=$scope.date;
                    var addsalary=$scope.salary;
                    var addrole=$scope.role;
                     
                    var employeeObj={
                        name:addname,
                        date:adddate,
                        salary:addsalary,
                        role:addrole
                    }
                    empService.setStorage($rootScope.keyuser,employeeObj)
                    $location.path('/home');
                }
            
            }]).controller('editController',['$scope','$location','$rootScope','empService','$routeParams',function($scope,$location,$rootScope,empService,$routeParams){
                
                $scope.getData=empService.getDataById($rootScope.keyuser,$routeParams.id)
                console.log($scope.getData)
                $scope.name= $scope.getData.name
                $scope.date= new Date( $scope.getData.date);
                $scope.salary= $scope.getData.salary
                $scope.role= $scope.getData.role
                
                $scope.editData=function(){
                    var addname=$scope.name;
                    var adddate=$scope.date;
                    var addsalary=$scope.salary;
                    var addrole=$scope.role;
                     
                    var employeeObj={
                        name:addname,
                        date:adddate,
                        salary:addsalary,
                        role:addrole
                    }
                    empService.updateStorage($rootScope.keyuser,employeeObj,$routeParams.id)
                    $location.path('/home');
                }
                 // console.log(Date.now()) to get timestamp id

             }] )