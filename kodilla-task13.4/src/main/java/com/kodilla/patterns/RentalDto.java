package com.kodilla.patterns;

public class RentalDto {
    public Provider provider;
    public boolean isArrivals;

    public RentalDto(final Provider provider, final boolean isArrivals) {
        this.provider = provider;
        this.isArrivals = isArrivals;
    }

    public Provider getProvider() {
        return provider;
    }

    public boolean isArrivals() {
        return isArrivals;
    }
}
