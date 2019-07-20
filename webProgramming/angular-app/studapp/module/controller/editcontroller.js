angular.module('student-spa',['ngRoute'])
.controller('editController',['$scope','studentservice','$rootScope','$location','$routeParams',function($scope, studentservice,$rootScope,$location,$routeParams){

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


}])