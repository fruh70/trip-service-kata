package org.craftedsw.tripservicekata.trip;

import java.util.ArrayList;
import java.util.List;

import org.craftedsw.tripservicekata.user.UserNotLoggedInException;
import org.craftedsw.tripservicekata.user.User;


public class TripService {

	TripDAO tripDAO = null;

	public TripService() {
	}

	public TripService(TripDAO tripDAO) {
		this.tripDAO = tripDAO;
	}

	public List<Trip> getTripsByUser(User user, User loggedUser) throws UserNotLoggedInException {
		if (loggedUser == null) {
			throw new UserNotLoggedInException();
		}

		return user.isFriend(loggedUser) ? findTripsByUser(user) : new ArrayList<>();
	}

	public List<Trip> findTripsByUser(User user) {
		return tripDAO.findTripsByUser(user);
	}

}
