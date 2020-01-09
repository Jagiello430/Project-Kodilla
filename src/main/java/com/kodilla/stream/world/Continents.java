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

    private final List<Country> continentList = new ArrayList<>();


    public Continents(){
        europe.add(new Country("Poland", new BigDecimal("38025684")));
        europe.add(new Country("German", new BigDecimal("86265414")));
        europe.add(new Country("England", new BigDecimal("65565414")));
        europe.add(new Country("Portugal", new BigDecimal("20565414")));
        europe.add(new Country("Spain", new BigDecimal("50236589")));
        europe.add(new Country("Russia", new BigDecimal("119256368")));
        australia.add(new Country("Australia", new BigDecimal("152898569")));
        asia.add(new Country("Japan", new BigDecimal("40288956")));
        asia.add(new Country("North Korea", new BigDecimal("14025698")));
        northAmerica.add(new Country("USA", new BigDecimal("325698584")));
        northAmerica.add(new Country("Canada", new BigDecimal("18262589")));
        southAmerica.add(new Country("Argentina", new BigDecimal("42565414")));
        southAmerica.add(new Country("Columbia", new BigDecimal("36565414")));
        africa.add(new Country("Nigeria", new BigDecimal("182565414")));
        africa.add(new Country("Senegal", new BigDecimal("52565414")));
    }
    public List<Country> getAllCountry(){

        continentList.addAll(southAmerica);
        continentList.addAll(africa);
        continentList.addAll(europe);
        continentList.addAll(australia);
        continentList.addAll(northAmerica);
        continentList.addAll(asia);
        return  continentList;
    }

    public BigDecimal getPeopleQuantity() {
        return getAllCountry().stream()
                .map(country -> country.getPopulation())
                .reduce(BigDecimal.ZERO,(sum,current) -> sum = sum.add(current));
    }
    public static void main(String[] args) {
        Continents continent = new Continents();
        System.out.println(continent.getPeopleQuantity());

    }
}
