angular.module('student-spa',['ngRoute']).factory('studentservice', ['$http', function ($http) {
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
}])