package org.craftedsw.tripservicekata;

import org.craftedsw.tripservicekata.trip.TripDAO;
import org.craftedsw.tripservicekata.user.UserNotLoggedInException;
import org.craftedsw.tripservicekata.trip.TripService;
import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserSession;

public class Main {

    public static void main(String[] args)  {
        User loggedUser = UserSession.getInstance().getLoggedUser();
        TripService tripService = new TripService(new TripDAO());
        try {
            tripService.getTripsByUser(new User(), loggedUser);
        } catch (UserNotLoggedInException e) {
            throw new RuntimeException(e);
        }
    }
}
