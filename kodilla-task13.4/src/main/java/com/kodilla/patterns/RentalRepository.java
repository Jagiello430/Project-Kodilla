package com.kodilla.patterns;

import java.time.LocalDate;

public interface RentalRepository {
    void createOrder(Provider provider, LocalDate deliveryDate, String typeOfDelivery);
}
