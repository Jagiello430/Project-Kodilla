package com.kodilla.flightsearch.engine;

import com.kodilla.flightsearch.user.User;

public interface ServiceFlight {
    boolean findFlightFromAirport1ToAirport2(User user, String departureAirportName, String arrivalAirportName);
}
