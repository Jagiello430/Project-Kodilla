package com.kodilla.patterns;

import java.time.LocalDate;

public class ProvideRequest {
    private Provider provider;
    private LocalDate deliveryDate;
    private int amountOfProducts;
    private StringBuilder productOfDelivery;

    public ProvideRequest(Provider provider, LocalDate deliveryDate, int amountOfProducts, StringBuilder productOfDelivery) {
        this.provider = provider;
        this.deliveryDate = deliveryDate;
        this.amountOfProducts = amountOfProducts;
        this.productOfDelivery = productOfDelivery;
    }

    public Provider getProvider() {
        return provider;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public int getAmountOfProducts() {
        return amountOfProducts;
    }

    public StringBuilder getProductOfDelivery() {
        return productOfDelivery;
    }

    @Override
    public String toString() {
        return "ProvideRequest{" +
                "provider=" + provider +
                ", deliveryDate=" + deliveryDate +
                ", amountOfProducts=" + amountOfProducts +
                ", productOfDelivery='" + productOfDelivery + '\'' +
                '}';
    }
}
