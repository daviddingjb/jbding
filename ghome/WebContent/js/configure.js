(function() {
    'use strict';

    angular
        .module('app', [])
        .factory('PagerService', PagerService)
        .controller('ConfigureController', ConfigureController);

    function ConfigureController(PagerService,$scope) {
        var vm = this;
        $scope.numbers=[5,10,15,20];
        $scope.selectedNumber=$scope.numbers[0];
        $scope.datatypes=["MySQL","Oracle","SQLServer","Sybase","DB2","Teradata","Informix"];
        $scope.screenDatatype=$scope.datatypes[0];
        vm.dummyItems =[
            {name: 'Hege', describe: "Pege",dataType: 'dfcas'},
            {name: 'Kim', describe: "Pim",dataType: 'asfsa'},
            {name: 'Sal', describe: "Smith",dataType: 'fdgsde'},
            {name: 'Jack', describe: "Jones",dataType: 'sfvds'},
            {name: 'Hege', describe: "Pege",dataType: 'dfcas'},
            {name: 'Kim', describe: "Pim",dataType: 'asfsa'},
            {name: 'Hege', describe: "Pege",dataType: 'dfcas'},
            {name: 'Kim', describe: "Pim",dataType: 'asfsa'},
            {name: 'Sal', describe: "Smith",dataType: 'fdgsde'},
            {name: 'Jack', describe: "Jones",dataType: 'sfvds'},
            {name: 'Hege', describe: "Pege",dataType: 'dfcas'},
            {name: 'Kim', describe: "Pim",dataType: 'asfsa'},
            {name: 'Hege', describe: "Pege",dataType: 'dfcas'},
            {name: 'Kim', describe: "Pim",dataType: 'asfsa'},
            {name: 'Sal', describe: "Smith",dataType: 'fdgsde'},
            {name: 'Jack', describe: "Jones",dataType: 'sfvds'},
            {name: 'Hege', describe: "Pege",dataType: 'dfcas'},
            {name: 'Kim', describe: "Pim",dataType: 'asfsa'},
        ]; // dummy array of items to be paged
        vm.pager = {};
        vm.setPage = setPage;
        initController();
        function initController() {
            // initialize to page 1
            vm.setPage(1);
        }
        function setPage(page) {
            if (page < 1 || page > vm.pager.totalPages) {
                return;
            }

            // get pager object from service
            vm.pager = PagerService.GetPager(vm.dummyItems.length, page,$scope.selectedNumber);

            // get current page of items
            vm.items = vm.dummyItems.slice(vm.pager.startIndex, vm.pager.endIndex + 1);
        }
        $scope.changeValue=function(){
            vm.setPage(1);
            var t =setTimeout(function(){
                var needHeight = $(".table").eq(0).css("height");
                var finallyHeight = parseInt(needHeight)+110;
                $(".white-need").css("height", finallyHeight);
                var sliderHeight = parseInt($(".content").eq(0).css("height"));
                $(".slider-left").eq(0).css("height",sliderHeight);
            },500)
        }
    }
    function PagerService() {
        // service definition
        var service = {};

        service.GetPager = GetPager;

        return service;

        // service implementation
        function GetPager(totalItems, currentPage, pageSize) {
            // default to first page
            currentPage = currentPage || 1;
            // default page size is 10
            pageSize = pageSize || 10;

            // calculate total pages
            var totalPages = Math.ceil(totalItems / pageSize);

            var startPage, endPage;
            if (totalPages <= 10) {
                // less than 10 total pages so show all
                startPage = 1;
                endPage = totalPages;
            } else {
                // more than 10 total pages so calculate start and end pages
                if (currentPage <= 6) {
                    startPage = 1;
                    endPage = 10;
                } else if (currentPage + 4 >= totalPages) {
                    startPage = totalPages - 9;
                    endPage = totalPages;
                } else {
                    startPage = currentPage - 5;
                    endPage = currentPage + 4;
                }
            }

            // calculate start and end item indexes
            var startIndex = (currentPage - 1) * pageSize;
            var endIndex = Math.min(startIndex + pageSize - 1, totalItems - 1);

            // create an array of pages to ng-repeat in the pager control
            var pages = _.range(startPage, endPage + 1);

            // return object with all pager properties required by the view
            return {
                totalItems: totalItems,
                currentPage: currentPage,
                pageSize: pageSize,
                totalPages: totalPages,
                startPage: startPage,
                endPage: endPage,
                startIndex: startIndex,
                endIndex: endIndex,
                pages: pages
            };
        }
    }
})();
