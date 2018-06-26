'use strict';

angular.module('myApp.view1', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view1', {
    templateUrl: 'view1/view1.html',
    controller: 'TripServiceController'
  });
}])

.controller('TripServiceController', ['$scope', function($scope) {

  $scope.getTripsFor = function($user) {
      let tripList = [];
      let loggedUser = UserSession.getLoggedUser();
      let isFriend = false;
      if (loggedUser != null) {
          let friends = user.getFriends();
          for (let i=0; i < friends.length; i++) {
              let friend = friends[i];
              if (friend == loggedUser) {
                  isFriend = true;
                  break;
              }
          };
          if (isFriend) {
              tripList = TripDAO.findTripsByUser(user);
          }
          return tripList;
      } else {
          throw new Error('User not logged in.');
      }
  }
}]);