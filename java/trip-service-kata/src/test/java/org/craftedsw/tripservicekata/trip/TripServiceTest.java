package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserNotLoggedInException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TripServiceTest {

    TripService service = new TripService(new TripDAO());
    User user = new User();
    User loggedUser = new User();

    @Test
    void getNoTripsForUserWithNoFriends() {
        assertThat(service.getTripsByUser(user, loggedUser)).isEmpty();
    }

    @Test
    void failsWhenUserNotLoggedIn() {
        Assertions.assertThrows(UserNotLoggedInException.class, () -> service.getTripsByUser(user, null));
    }

    @Test
    void getNoTripsWhenFriendIsNotLoggedUser() {
        User aFriend = new User();
        user.addFriend(aFriend);
        assertThat(service.getTripsByUser(user, loggedUser)).isEmpty();
    }

    @Test
    void getTripsWhenFriendIsLoggedUser() {
        TripService testableService = Mockito.spy(service);
        List<Trip> trips = new ArrayList<>();
        trips.add(new Trip());
        trips.add(new Trip());
        trips.add(new Trip());
        Mockito.doReturn(trips).when(testableService).findTripsByUser(user);

        user.addFriend(loggedUser);
        assertThat(testableService.getTripsByUser(user, loggedUser)).isEqualTo(trips);
    }
}
