package com.kodilla.patterns;

public class ProvideDto {
    public Provider provider;
    public boolean isArrivals;

    public ProvideDto(final Provider provider, final boolean isArrivals) {
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
