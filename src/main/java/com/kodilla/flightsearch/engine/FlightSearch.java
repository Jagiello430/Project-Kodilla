package com.kodilla.flightsearch.engine;

import com.kodilla.flightsearch.flight.Airport;
import com.kodilla.flightsearch.flight.FlightDataBase;
import com.kodilla.flightsearch.flight.FlightDateBaseFromCity;
import com.kodilla.flightsearch.flight.FlightList;
import com.kodilla.flightsearch.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch implements ServiceFlight{
    public FlightDataBase list() {
        Airport gdansk = new Airport("gdansk");
        Airport wroclaw = new Airport("wroclaw");
        Airport cracow = new Airport("cracow");
        Airport warsaw = new Airport("warsaw");
        Airport katowice = new Airport("katowice");

        FlightList flightFromWroclaw1 = new FlightList(wroclaw, cracow, 2020, 5, 5);
        FlightList flightFromWroclaw2 = new FlightList(wroclaw, warsaw, 2020, 5, 10);
        FlightList flightFromWroclaw3 = new FlightList(wroclaw, gdansk, 2020, 5, 12);

        FlightList flightFromWarsaw1 = new FlightList(warsaw, katowice, 2020, 5, 16);
        FlightList flightFromWarsaw2 = new FlightList(warsaw, gdansk, 2020, 5, 2);
        FlightList flightFromWarsaw3 = new FlightList(warsaw, cracow, 2020, 5, 6);
        FlightList flightFromWarsaw4 = new FlightList(warsaw, wroclaw, 2020, 5, 7);

        FlightList flightFromKatowice1 = new FlightList(katowice, warsaw, 2020, 5, 3);
        FlightList flightFromKatowice2 = new FlightList(katowice, gdansk, 2020, 5, 8);
        FlightList flightFromKatowice3 = new FlightList(katowice, cracow, 2020, 5, 15);

        FlightList flightFromGdansk1 = new FlightList(gdansk, katowice, 2020, 5, 7);
        FlightList flightFromGdansk2 = new FlightList(gdansk, wroclaw, 2020, 5, 16);
        FlightList flightFromGdansk3 = new FlightList(gdansk, warsaw, 2020, 5, 11);

        FlightList flightFromCracow1 = new FlightList(cracow, warsaw, 2020, 5, 4);
        FlightList flightFromCracow2 = new FlightList(cracow, wroclaw, 2020, 5, 15);
        FlightList flightFromCracow3 = new FlightList(cracow, katowice, 2020, 5, 23);

        FlightDateBaseFromCity listFlightFromWroclaw = new FlightDateBaseFromCity("wroclaw");
        listFlightFromWroclaw.add(flightFromWroclaw1);
        listFlightFromWroclaw.add(flightFromWroclaw2);
        listFlightFromWroclaw.add(flightFromWroclaw3);

        FlightDateBaseFromCity listFlightFromWarsaw = new FlightDateBaseFromCity("warsaw");
        listFlightFromWarsaw.add(flightFromWarsaw1);
        listFlightFromWarsaw.add(flightFromWarsaw2);
        listFlightFromWarsaw.add(flightFromWarsaw3);
        listFlightFromWarsaw.add(flightFromWarsaw4);

        FlightDateBaseFromCity listFlightFromKatowice = new FlightDateBaseFromCity("katowice");
        listFlightFromKatowice.add(flightFromKatowice1);
        listFlightFromKatowice.add(flightFromKatowice2);
        listFlightFromKatowice.add(flightFromKatowice3);

        FlightDateBaseFromCity listFlightFromGdansk = new FlightDateBaseFromCity("gdansk");
        listFlightFromGdansk.add(flightFromGdansk1);
        listFlightFromGdansk.add(flightFromGdansk2);
        listFlightFromGdansk.add(flightFromGdansk3);

        FlightDateBaseFromCity listFlightFromCracow = new FlightDateBaseFromCity("cracow");
        listFlightFromCracow.add(flightFromCracow1);
        listFlightFromCracow.add(flightFromCracow2);
        listFlightFromCracow.add(flightFromCracow3);

        FlightDataBase project = new FlightDataBase("All Flight in Poland");
        project.add(listFlightFromCracow);
        project.add(listFlightFromWarsaw);
        project.add(listFlightFromWroclaw);
        project.add(listFlightFromGdansk);
        project.add(listFlightFromKatowice);
        return project;
    }

    @Override
    public boolean findFlightFromAirport1ToAirport2(User user, String departureAirportName, String arrivalAirportName) {
        {
            Airport airport1 = new Airport(departureAirportName);
            Airport airport2 = new Airport(arrivalAirportName);

            List<Airport> listFlightFromAirport1 = list().getFlightList().stream()
                    .flatMap(flightDateBaseFromCity -> flightDateBaseFromCity.getFlightLists().stream())
                    .filter(flightList -> flightList.getDeparture().equals(airport1))
                    .map(FlightList::getArrival)
                    .collect(Collectors.toList());

            List<Airport> listFlightToAirport2 = list().getFlightList().stream()
                    .flatMap(flightDateBaseFromCity -> flightDateBaseFromCity.getFlightLists().stream())
                    .filter(x -> x.getArrival().equals(airport2))
                    .map(FlightList::getDeparture)
                    .collect(Collectors.toList());

            List<FlightList> listFlightFromAirport1ToAirport2 = list().getFlightList().stream()
                    .flatMap(flightDateBaseFromCity -> flightDateBaseFromCity.getFlightLists().stream())
                    .filter(x -> x.getDeparture().equals(airport1) && x.getArrival().equals(airport2))
                    .collect(Collectors.toList());

            List<Airport> testList = new ArrayList<>();
            for (int i = 0; i < listFlightFromAirport1.size(); i++) {
                Airport airport3 = listFlightFromAirport1.get(i);
                for (int j = 0; j < listFlightToAirport2.size(); j++) {
                    Airport airport4 = listFlightToAirport2.get(j);
                    if (airport3.getNameAirport() == airport4.getNameAirport()) {
                        testList.add(airport3);
                    }
                }
            }
            System.out.println("Lista lotów bezpośrednich z " + airport1.getNameAirport() + " do "
                    + airport2.getNameAirport() + "\n" + listFlightFromAirport1ToAirport2);
            System.out.println("Lista miast przez które można dolecieć z " + airport1.getNameAirport() +
                    " do " + airport2.getNameAirport() + "\n" + testList);
        }
        return true;
    }
}
