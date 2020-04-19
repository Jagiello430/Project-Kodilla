package com.kodilla.flightsearch.repository;

import com.kodilla.flightsearch.flight.Airport;
import com.kodilla.flightsearch.user.User;

public class UserRepository implements Repository{

    @Override
    public void createReservation(User user, Airport flight) {
        System.out.println("User " + user.getName() + " " + user.getSurname() + " created reservation for flight from " +
                flight.getNameAirport() + " to "/* + flight.getArrival() +  " on " + flight.getDataDeparture()*/);
    }
}
