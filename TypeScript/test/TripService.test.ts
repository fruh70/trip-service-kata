import "jest";
import TripService from "../src/trip/TripService";
import User from "../src/user/User"
import * as sinon from "sinon";
import UserNotLoggedInException from "../src/exception/UserNotLoggedInException"


describe("TripServiceShould", () => {

        const tripService = new TripService();
    it("refuses to give trips for guests", () => {


        expect(() => tripService.getTripsByUser2(new User(), null)).toThrow(UserNotLoggedInException);

    });


});
