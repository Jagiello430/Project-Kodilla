package com.kodilla.exception.test;

import java.util.Map;

public class Flight {
    String departureAirport;
    String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport){
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport(Map<String, Boolean> listAirport) {
        return departureAirport;
    }

    public String getArrivalAirport(Map<String, Boolean> listAirport) {
        return arrivalAirport;
    }
}
