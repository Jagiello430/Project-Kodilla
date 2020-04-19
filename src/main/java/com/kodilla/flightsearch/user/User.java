package com.kodilla.flightsearch.user;

public final class User {
    private final String name;
    private final String surname;
    private String mail;

    public User(final String name, final String surname, String mail) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }
}
