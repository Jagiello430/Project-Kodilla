package com.kodilla.flightsearch.retriever;

import com.kodilla.flightsearch.user.User;

public class UserRequest {
    private User user;
    private String departureAirportName;
    private String arrivalAirportName;

    public UserRequest(final User user, final String departureAirportName, final String arrivalAirportName) {
        this.user = user;
        this.departureAirportName = departureAirportName;
        this.arrivalAirportName = arrivalAirportName;
    }

    public User getUser() {
        return user;
    }

    public String getDepartureAirportName() {
        return departureAirportName;
    }

    public String getArrivalAirportName() {
        return arrivalAirportName;
    }
}
