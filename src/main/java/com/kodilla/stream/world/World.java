package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World  {
    private final List<List<Country>> continentList = new ArrayList<>();
    Continents continents = new Continents();

    public List<List<Country>> getContinentList() {
        continentList.add(continents.getEurope());
        continentList.add(continents.getAfrica());
        continentList.add(continents.getAsia());
        continentList.add(continents.getAustralia());
        continentList.add(continents.getNorthAmerica());
        continentList.add(continents.getSouthAmerica());
        return continentList;
    }

    public BigDecimal getPeopleQuantity(){
        return getContinentList().stream()
                .flatMap(country -> country.stream())
                .map(Country::getPopulation)
                .reduce(BigDecimal.ZERO,(sum,current) -> sum = sum.add(current));
    }
}

