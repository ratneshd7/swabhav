angular.module('student-spa',['ngRoute'])
       .config(['$routeProvider',function($routeProvider){
             $routeProvider.when('/',{
                 templateUrl: 'fragments/home.html',
                 controller: 'LoginController'
             }).when('/add',{
                 templateUrl: 'fragments/add.html',
                 controller: 'addController'
            }).when('/edit/:id',{
                 templateUrl: 'fragments/edit.html',
                controller: 'editController'
        })
    }]).factory('studentservice', ['$http', function ($http) {
        var object = {};


        object.getStudentData = function () {
            return $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students");
        }

        object.getStudentDataByID = function (num) {
            return $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + num);
        }

        object.deleteStudent = function (num) {
            return $http.delete("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + num);
        }
        object.addStudent = function (data) {
            console.log(data);
            return $http.post("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/", data);
        }
        object.updateStudent = function (id, data) {
            console.log(data);
            return $http.put("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + id, data);
        }
        return object;
    }]).controller('LoginController', ['$scope', 'studentservice','$rootScope','$location', function ($scope, studentservice,$rootScope,$location) {
        $rootScope.leng;
        

        $scope.deleteStudent = function (id) {
             alert(id);
            studentservice.deleteStudent(id).then((r) => {
            //    $location.path('/')
            $rootScope.GetData(); 
            });
        }

       
      
            studentservice.getStudentData().then((r) => {
                $scope.student = r.data;
                console.log($scope.student)
                $rootScope.leng = $scope.student.length;
                console.log($rootScope.leng);
            });
        
          $rootScope.GetData = function () {
            studentservice.getStudentData().then((r) => {
                $scope.student = r.data;
                console.log($scope.student)
                $rootScope.leng = $scope.student.length;
                console.log($rootScope.leng);
            });
         }

        // $scope.GetData();
    }]).controller('addController',['$scope', 'studentservice','$rootScope','$location',function($scope, studentservice,$rootScope,$location){
        $scope.displayIdTable = false;
        $scope.studentId;
        $scope.studentByID;
        $scope.student;
        $scope.message;
        $scope.ID;
        $scope.passStudent = {
            name: "",
            rollNo: "",
            age: "",
            date: "",
            email: "",
            isMale: true
        }

        $scope.Student = {
            name: "",
            rollno: "",
            age: "",
            date: "",
            email: "",
            gender: {
                gendervalue: ""
            },
        }
        $scope.gender = {
            name:"male",
        }
        
        $scope.setPassStudent = function () {
            $scope.passStudent.name = $scope.Student.name;
            $scope.passStudent.rollNo = $scope.Student.rollno;
            $scope.passStudent.age = $scope.Student.age;
            $scope.passStudent.email = $scope.Student.email;
            $scope.passStudent.date = $scope.Student.date;
            if ($scope.Student.gender.gendervalue == "male") {
                $scope.passStudent.isMale = true;
            }
            else {
                $scope.passStudent.isMale = false;
            }
        }
        $scope.AddData = function () {
            $scope.setPassStudent();
            studentservice.addStudent($scope.passStudent).then((r) => {
             $location.path('/')
            });
           
        }
   
    }]).controller('editController',['$scope','studentservice','$rootScope','$location','$routeParams',function($scope, studentservice,$rootScope,$location,$routeParams){

        $scope.passStudent = {
            name: "",
            rollNo: "",
            age: "",
            date: "",
            email: "",
            isMale: true
        }
        $scope.Student = {
            
            name: "",
            rollno: "",
            age: "",
            date: "",
            email: "",
            gender: {
                gendervalue: ""
            },
        }
        $scope.gender = {
            name:"male",
        }

        $scope.setPassStudent = function () {
            $scope.passStudent.name = $scope.Student.name;
            $scope.passStudent.rollNo = $scope.Student.rollno;
            $scope.passStudent.age = $scope.Student.age;
            $scope.passStudent.email = $scope.Student.email;
            $scope.passStudent.date = $scope.Student.date;
            if ($scope.Student.gender.gendervalue == "male") {
                $scope.passStudent.isMale = true;
            }
            else {
                $scope.passStudent.isMale = false;
            }
        }

        $scope.UpdateData = function () {
            alert($routeParams.id);
            $scope.setPassStudent();
            console.log("pass student array" + $scope.passStudent);
            studentservice.updateStudent($routeParams.id, $scope.passStudent).then((r) => {
                $location.path('/')
            });
            
        }

        // $scope.setData = function (id) {
            $scope.ID = $routeParams.id;
            studentservice.getStudentDataByID($routeParams.id).then((r) => {
                // $scope.displayIdTable = true;
                $scope.studentByID = r.data;
                
                $scope.Student.id = r.data[0].id;
                $scope.Student.rollno = r.data[0].rollNo;
                $scope.Student.name = r.data[0].name;
                $scope.Student.age = r.data[0].age;
                $scope.Student.email = r.data[0].email;
                $scope.Student.date = r.data[0].date;

                if (r.data[0].isMale == true) {
                    $scope.Student.gender.gendervalue = "male";
                }
                else {
                    $scope.Student.gender.gendervalue = "female";
                }
                $scope.setPassStudent();
            });
        // }


    }]).filter("genderfilter", [function () {
        return function (input) {
            if (input == true) {
                return "Male";
            }
            else {
                return "Female";
            }
        }
    }]);