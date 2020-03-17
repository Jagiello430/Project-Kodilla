package com.kodilla.patterns;

import java.time.LocalDate;

public interface ProvideService {
    boolean rent(Provider provider, LocalDate deliveryDate, String typeOfDelivery);
}
