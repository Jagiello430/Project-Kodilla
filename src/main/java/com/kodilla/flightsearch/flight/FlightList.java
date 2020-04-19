package com.kodilla.flightsearch.flight;

import java.time.LocalDate;

public final class FlightList {
    private final Airport departure;
    private final Airport arrival;
    private final LocalDate dateDeparture;

    public FlightList(final Airport departure, final Airport arrival,
                      final int year, final int month, final int dayOfMonth) {
        this.departure = departure;
        this.arrival = arrival;
        this.dateDeparture = LocalDate.of(year, month, dayOfMonth);
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    public LocalDate getDateDeparture() {
        return dateDeparture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightList that = (FlightList) o;

        if (getDeparture() != null ? !getDeparture().equals(that.getDeparture()) : that.getDeparture() != null)
            return false;
        if (getArrival() != null ? !getArrival().equals(that.getArrival()) : that.getArrival() != null) return false;
        return getDateDeparture() != null ? getDateDeparture().equals(that.getDateDeparture()) : that.getDateDeparture() == null;
    }

    @Override
    public int hashCode() {
        int result = getDeparture() != null ? getDeparture().hashCode() : 0;
        result = 31 * result + (getArrival() != null ? getArrival().hashCode() : 0);
        result = 31 * result + (getDateDeparture() != null ? getDateDeparture().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FlightList{" +
                "departure=" + departure +
                ", arrival=" + arrival +
                ", dateDeparture=" + dateDeparture +
                '}' + "\n";
    }
}
