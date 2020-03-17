package com.kodilla.patterns;

import java.time.LocalDate;

public interface RentalService {
    boolean rent(Provider provider, LocalDate deliveryDate, String typeOfDelivery);
}
