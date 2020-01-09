package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class Country {
    private final String nameCountry;
    private final BigDecimal population;


    public Country(final String nameCountry, final BigDecimal population){
        this.nameCountry = nameCountry;
        this.population = population;
    }

    public String getNameCountry() {
        return nameCountry;
    }
    public BigDecimal getPopulation() {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(population));
        return bigDecimal;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameCountry='" + nameCountry + '\'' +
                ", population=" + population +
                '}';
    }
}
