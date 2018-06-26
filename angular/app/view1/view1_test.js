'use strict';

describe('myApp.view1 module', function () {

    beforeEach(module('myApp.view1'));

    describe('view controller', function () {

        it('should ....', inject(function ($controller, $rootScope) {
            var myScope = $rootScope.$new()
            var view1Ctrl = $controller('TripServiceController', {$scope: myScope});
            expect(myScope.getTripsFor).toBeDefined();
            myScope.getTripsFor({})
        }));

    });
});