package com.kodilla.patterns;

import java.time.LocalDate;

public class ProductProvideRepository implements ProvideRepository {
    @Override
    public void createOrder(Provider provider, LocalDate deliveryDate, StringBuilder typeOfDelivery) {
        System.out.println("Company: " + provider.getNameCompany() + "\n" + "Date: " + deliveryDate + "\n" + "Product list: " + typeOfDelivery);
    }
}
