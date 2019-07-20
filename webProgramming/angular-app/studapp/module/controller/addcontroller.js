angular.module('student-spa',['ngRoute'])
        .controller('addController',['$scope', 'studentservice','$rootScope','$location',function($scope, studentservice,$rootScope,$location){
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

}])