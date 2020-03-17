package com.kodilla.patterns;

import java.time.LocalDate;

public interface ProvideRepository {
    void createOrder(Provider provider, LocalDate deliveryDate, String typeOfDelivery);
}
