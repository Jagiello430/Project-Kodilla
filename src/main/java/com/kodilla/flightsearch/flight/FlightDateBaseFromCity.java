package com.kodilla.flightsearch.flight;

import java.util.HashSet;
import java.util.Set;

public final class FlightDateBaseFromCity {
    private final String name;
    private Set<FlightList> flightLists = new HashSet<>();

    public FlightDateBaseFromCity(final String name) {
        this.name = name;
    }

    public void add(FlightList flightList) {
        flightLists.add(flightList);
    }

    public String getName() {
        return name;
    }

    public Set<FlightList> getFlightLists() {
        return flightLists;
    }

    @Override
    public String toString() {
        return "FlightDateBaseFromCity{" +
                "name='" + name + '\'' +
                ", flightLists=" + flightLists +
                '}';
    }
}
