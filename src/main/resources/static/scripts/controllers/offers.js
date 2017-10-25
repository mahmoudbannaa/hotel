'use strict';

angular.module('hotels')

    .controller('SearchCtrl', ['$scope','search',

        function( $scope, search )
        {

            $scope.loading = true;
            search.getResources().query(

                function(response) {
                    $scope.loading = false;
                    $scope.hotels = response.offers.Hotel;
                },
                function(response) {
                    $scope.loading = false;
                    console.log(response);

                }
            );

        }
    ]);