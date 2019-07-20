angular.module('student-spa',['ngRoute'])
       .controller('LoginController', ['$scope', 'studentservice','$rootScope','$location', function ($scope, studentservice,$rootScope,$location) {
    $rootScope.leng;
    

    $scope.deleteStudent = function (id) {
         alert(id);
        studentservice.deleteStudent(id).then((r) => {
        //    $location.path('/')
        $rootScope.GetData() 
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
    }])
