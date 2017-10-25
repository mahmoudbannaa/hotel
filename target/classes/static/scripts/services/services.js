'use strict';

angular.module('hotels')
    .constant("baseURL", "/offers/search")
    .service('search', ['$resource', 'baseURL',
        function ($resource, baseURL) {
            this.getResources = function (header) {
                return $resource(baseURL, null, {'query': { method: 'GET' }});
            };
        }
    ]);
