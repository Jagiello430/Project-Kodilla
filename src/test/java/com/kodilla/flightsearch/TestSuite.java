package com.kodilla.flightsearch;

import com.kodilla.flightsearch.flight.Airport;
import com.kodilla.flightsearch.flight.FlightDataBase;
import com.kodilla.flightsearch.flight.FlightDateBaseFromCity;
import com.kodilla.flightsearch.flight.FlightList;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestSuite {

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

    @Test
    public void testFindFlightFromWroclaw() {
        Airport wroclaw = new Airport("wroclaw");
        Set<FlightList> test1 = list().getFlightList().stream()
                .flatMap(flightDateBaseFromCity -> flightDateBaseFromCity.getFlightLists().stream())
                .filter(x -> x.getDeparture().equals(wroclaw))
                .collect(Collectors.toSet());

        System.out.println(test1);
        int size = test1.size();
        Assert.assertEquals(size,3);
    }

    @Test
    public void testFindFlightToGdansk() {
        Airport gdansk = new Airport("gdansk");
        Set<FlightList> test2 = list().getFlightList().stream()
                .flatMap(flightDateBaseFromCity -> flightDateBaseFromCity.getFlightLists().stream())
                .filter(x -> x.getArrival().equals(gdansk))
                .collect(Collectors.toSet());

        System.out.println(test2);
        int size = test2.size();
        Assert.assertEquals(size,3);
    }

    @Test
    public void testFindFlightFromWroclawToGdanskByAnotherCity() {
        Airport wroclaw = new Airport("wroclaw");
        Airport gdansk = new Airport("gdansk");
        List<Airport> test1 = list().getFlightList().stream()
                .flatMap(flightDateBaseFromCity -> flightDateBaseFromCity.getFlightLists().stream())
                .filter(flightList -> flightList.getDeparture().equals(wroclaw))
                .map(FlightList::getArrival)
                .collect(Collectors.toList());

        List<Airport> test2 = list().getFlightList().stream()
                .flatMap(flightDateBaseFromCity -> flightDateBaseFromCity.getFlightLists().stream())
                .filter(x -> x.getArrival().equals(gdansk))
                .map(FlightList::getDeparture)
                .collect(Collectors.toList());


        Stream<Airport> test3 = Stream.concat(test1.stream(), test2.stream());
        //List<Airport> test4 = test3.collect(Collectors.toList());

        Airport airport = new Airport("aaa");

        /*List<List> test4 = test3.stream()
                .flatMap()
                .distinct()
                .collect(Collectors.toList());*/


        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(Collections.disjoint(test1,test2));

    }
}
