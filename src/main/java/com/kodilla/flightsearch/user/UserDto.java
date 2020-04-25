package com.kodilla.flightsearch.user;

public class UserDto {
    private User user;
    private boolean isFound;

    public UserDto(final User user, final boolean isFound) {
        this.user = user;
        this.isFound = isFound;
    }

    public User getUser() {
        return user;
    }

    public boolean isFound() {
        return isFound;
    }
}
