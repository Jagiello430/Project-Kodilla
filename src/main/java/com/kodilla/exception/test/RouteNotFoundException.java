package com.kodilla.exception.test;

import java.io.IOException;

public class RouteNotFoundException extends IOException {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        try{
            Flight flight = new Flight("Warsaw", "Cracow");
            flightSearch.findFlight(flight);
        }catch (IOException e){
            System.out.println("Wrong " + e);
            e.printStackTrace();
        }

    }
}
