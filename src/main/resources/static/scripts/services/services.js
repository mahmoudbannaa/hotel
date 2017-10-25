'use strict';

angular.module('hotels')
    .constant("baseURL", "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel")
    .service('search', ['$resource', 'baseURL',
        function ($resource, baseURL) {
            this.getResources = function (header) {
                return $resource(baseURL, null, {'query': { method: 'GET' }});
            };
        }
    ]);
