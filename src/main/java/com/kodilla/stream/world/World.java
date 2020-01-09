package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World  {
    Continents continents = new Continents();
    private final List<Country> continentList = new ArrayList<Country>();

   /* public BigDecimal getPeopleQuantity(){
        return continents.getAllCountry().stream()
                .flatMap(country -> country.getPopulation().stream())
                .map(Country::getPopulation)
                .reduce(BigDecimal.ZERO,(sum,current) -> sum = sum.add(current));

    }*/
}

