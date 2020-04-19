package com.kodilla.flightsearch.repository;

import com.kodilla.flightsearch.flight.Airport;
import com.kodilla.flightsearch.user.User;

public interface Repository {
    void createReservation(User user, Airport flight);
}
