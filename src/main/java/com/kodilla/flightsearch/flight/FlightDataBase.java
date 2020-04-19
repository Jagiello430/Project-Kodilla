package com.kodilla.flightsearch.flight;

import java.util.HashSet;
import java.util.Set;

public final class FlightDataBase {
    private final String  name;
    private Set<FlightDateBaseFromCity> flightList = new HashSet<>();

    public FlightDataBase(final String  name) {
        this.name = name;
    }

    public void add(FlightDateBaseFromCity flightDateBaseFromCity) {
        flightList.add(flightDateBaseFromCity);
    }

    public String getName() {
        return name;
    }

    public Set<FlightDateBaseFromCity> getFlightList() {
        return flightList;
    }

    @Override
    public String toString() {
        return "FlightDataBase{" +
                "name='" + name + '\'' +
                ", flightList=" + flightList +
                '}';
    }
}
