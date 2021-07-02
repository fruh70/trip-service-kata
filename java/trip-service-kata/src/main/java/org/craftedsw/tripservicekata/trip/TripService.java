package org.craftedsw.tripservicekata.trip;

import java.util.ArrayList;
import java.util.List;

import org.craftedsw.tripservicekata.user.UserNotLoggedInException;
import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserSession;

public class TripService {

	public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
		return getTripsByUser(user, UserSession.getInstance().getLoggedUser());
	}

	public List<Trip> getTripsByUser(User user, User loggedUser) throws UserNotLoggedInException {
		if (loggedUser == null) {
			throw new UserNotLoggedInException();
		}

		return user.isFriend(loggedUser) ? findTripsByUser(user) : new ArrayList<>();
	}

	protected List<Trip> findTripsByUser(User user) {
		return TripDAO.findTripsByUser(user);
	}

}
