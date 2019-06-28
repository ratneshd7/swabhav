angular.module('module-app', ['module-A','module-B'])
.controller('maincontroller',['$rootScope', '$scope', function ($rootScope, $scope) {
    $rootScope.company = "Aurionpro Solution";
    $scope.msg = "inside main controller";
    console.log("main Controller Created")
}])
angular.module('module-A',[]);
angular.module('module-A')
       .controller('controller-A',['$rootScope', '$scope',function($rootScope, $scope){
    console.log($rootScope.company)
    $scope.msg = "inside controller-A"; 
    console.log("contrller A created")
}])

angular.module('module-B',[]);
angular.module('module-B')
       .controller('controller-B',['$rootScope', '$scope',function($rootScope, $scope){
    console.log($rootScope.company)
    $scope.msg = "inside controller-B"; 
    console.log("contrller B created")
}])