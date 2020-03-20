package com.kodilla.patterns;

import java.time.LocalDate;

public interface ProvideService {
    boolean order(Provider provider, LocalDate deliveryDate, StringBuilder typeOfDelivery);
}
