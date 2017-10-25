'use strict';

angular.module('hotels', [
    'ui.router',
    'ngResource',
    'ui.bootstrap',
    'angular-loading-bar'

]).config(['$stateProvider', '$urlRouterProvider',
        function ($stateProvider, $urlRouterProvider) {

            $urlRouterProvider.otherwise('/main/home');

            $stateProvider

                .state('main', {
                    url: '/main',
                    templateUrl: 'main.html',

                })

                .state('main.home', {
                    controller: 'SearchCtrl',
                    templateUrl: 'home.html',
                    url: '/home'
                })

        }
    ]);


