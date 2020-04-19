package com.kodilla.flightsearch.flight;

public final class Airport {
    private final String nameAirport;

    public Airport(final String nameAirport) {
        this.nameAirport = nameAirport;
    }

    public String getNameAirport() {
        return nameAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        return getNameAirport() != null ? getNameAirport().equals(airport.getNameAirport()) : airport.getNameAirport() == null;
    }

    @Override
    public int hashCode() {
        return getNameAirport() != null ? getNameAirport().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "nameAirport='" + nameAirport + '\'' +
                '}';
    }

    /*public void flightDatabase() {
        flightList.stream()
                //.map(x -> x.getNameAirport())
                //.filter(flight -> flight.equals("Wroclaw"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }*/
}
