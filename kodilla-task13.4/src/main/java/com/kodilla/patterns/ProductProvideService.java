package com.kodilla.patterns;

import java.time.LocalDate;

public class ProductProvideService implements ProvideService {
    @Override
    public boolean order(Provider provider, LocalDate deliveryDate, StringBuilder typeOfDelivery) {
        System.out.println("Product arrive from: " + provider + ", data: " + deliveryDate + ", as type: " + typeOfDelivery);
        return true;
    }
}
