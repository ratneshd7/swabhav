angular.module('student-spa',['ngRoute']).filter("genderfilter", [function () {
    return function (input) {
        if (input == true) {
            return "Male";
        }
        else {
            return "Female";
        }
    }
}]);