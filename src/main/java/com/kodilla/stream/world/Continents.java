package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public final class Continents {

    private final List<Country> northAmerica = new ArrayList<>();
    private final List<Country> europe = new ArrayList<>();
    private final List<Country> southAmerica = new ArrayList<>();
    private final List<Country> asia = new ArrayList<>();
    private final List<Country> africa = new ArrayList<>();
    private final List<Country> australia = new ArrayList<>();

    Country country = new Country("Poland", new BigDecimal("38025684"));
    Country country1 = new Country("German", new BigDecimal("86265414"));
    Country country2 = new Country("England", new BigDecimal("65565414"));
    Country country3 = new Country("Portugal", new BigDecimal("20565414"));
    Country country4 = new Country("Spain", new BigDecimal("50236589"));
    Country country5 = new Country("Russia", new BigDecimal("119256368"));
    Country country6 = new Country("Australia", new BigDecimal("152898569"));
    Country country7 = new Country("Japan", new BigDecimal("40288956"));
    Country country8 = new Country("North Korea", new BigDecimal("14025696"));
    Country country9 = new Country("USA", new BigDecimal("325698584"));
    Country country10 = new Country("Canada", new BigDecimal("18262589"));
    Country country11 = new Country("Argentina", new BigDecimal("42565414"));
    Country country12 = new Country("Columbia", new BigDecimal("36565414"));
    Country country13 = new Country("Nigeria", new BigDecimal("182565414"));
    Country country14 = new Country("Senegal", new BigDecimal("52565414"));

    public List<Country> getNorthAmerica() {
        northAmerica.add(country9);
        northAmerica.add(country10);
        return northAmerica;
    }
    public List<Country> getAfrica() {
        africa.add(country13);
        africa.add(country14);
        return africa;
    }
    public List<Country> getAsia() {
        asia.add(country7);
        asia.add(country8);
        return asia;
    }
    public List<Country> getAustralia() {
        australia.add(country6);
        return australia;
    }
    public List<Country> getEurope() {
        europe.add(country);
        europe.add(country1);
        europe.add(country2);
        europe.add(country3);
        europe.add(country4);
        europe.add(country5);
        return europe;
    }
    public List<Country> getSouthAmerica() {
        southAmerica.add(country11);
        southAmerica.add(country12);
        return southAmerica;
    }

    public BigDecimal getPeopleQuantity() {
        return getEurope().stream()
                .map(Country::getPopulation)
                .reduce(BigDecimal.ZERO,(sum,current) -> sum = sum.add(current));
    }
    public static void main(String[] args) {
        Continents continent = new Continents();
        World world = new World();
        System.out.println("Populacja europy: " + continent.getPeopleQuantity());
        System.out.println("Populacja świata: " + world.getPeopleQuantity());

    }
}
