package com.kodilla.flightsearch.repository;

import com.kodilla.flightsearch.user.User;

public class UserRepository implements Repository{

    @Override
    public void createReservation(User user, String airportDepartureName, String airportArrivalName) {
        System.out.println("Transaction from " + airportDepartureName + " to " + airportArrivalName +
                " is completed");
    }
}
