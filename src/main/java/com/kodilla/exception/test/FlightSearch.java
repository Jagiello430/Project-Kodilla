package com.kodilla.exception.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    private  Map<String,Boolean> listAirport = new HashMap<>();

    public FlightSearch(){
        listAirport.put("Cracow",true);
        listAirport.put("Warsaw",true);
        listAirport.put("Keflavik",true);
        listAirport.put("Akureyri",false);
    }
    public boolean findFlight(Flight flight) throws IOException {

        String arrivals = flight.getArrivalAirport(listAirport);
        String departure = flight.getDepartureAirport(listAirport);

        boolean airportArrival = listAirport.containsValue(arrivals) && listAirport.get(arrivals) == true;
        boolean airportDeparture = listAirport.containsValue(departure) && listAirport.get(departure) == true;

        return airportArrival && airportDeparture;
    }
}
