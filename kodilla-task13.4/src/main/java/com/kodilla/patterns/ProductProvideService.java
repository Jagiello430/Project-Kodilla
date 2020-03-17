package com.kodilla.patterns;

import java.time.LocalDate;

public class ProductProvideService implements RentalService {
    @Override
    public boolean rent(Provider provider, LocalDate deliveryDate, String typeOfDelivery) {
        System.out.println("Product arrive from: " + provider + ", data: " + deliveryDate + ", as type: " + typeOfDelivery);
        return true;
    }
}
