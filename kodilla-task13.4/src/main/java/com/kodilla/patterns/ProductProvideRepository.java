package com.kodilla.patterns;

import java.time.LocalDate;

public class ProductProvideRepository implements ProvideRepository {
    @Override
    public void createOrder(Provider provider, LocalDate deliveryDate, String typeOfDelivery) {
        System.out.println("Company: " + provider + "\n" + "Date: " + deliveryDate + "\n" + "Type of delivery: " + typeOfDelivery);
    }
}
