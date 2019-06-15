angular.module('myApp', []).controller('ConfigureNewController', function($scope) {
    $scope.datatypes=["MySQL","Oracle","SQLServer","Sybase","DB2","Teradata","Informix"];
    $scope.newDatatype=$scope.datatypes[0];
})
