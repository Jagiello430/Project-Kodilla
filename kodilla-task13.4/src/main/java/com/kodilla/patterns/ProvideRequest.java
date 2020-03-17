package com.kodilla.patterns;

import java.time.LocalDate;

public class ProvideRequest {
    private Provider provider;
    private LocalDate deliveryDate;
    private String typeOfDelivery;

    public ProvideRequest(Provider provider, LocalDate deliveryDate, String typeOfDelivery) {
        this.provider = provider;
        this.deliveryDate = deliveryDate;
        this.typeOfDelivery = typeOfDelivery;
    }

    public Provider getProvider() {
        return provider;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public String getTypeOfDelivery() {
        return typeOfDelivery;
    }

    @Override
    public String toString() {
        return "RentRequest{" +
                "provider=" + provider +
                ", deliveryDate=" + deliveryDate +
                ", typeOfDelivery='" + typeOfDelivery + '\'' +
                '}';
    }
}
