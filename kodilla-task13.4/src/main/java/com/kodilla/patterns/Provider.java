package com.kodilla.patterns;

public final class Provider {
    private final String nameCompany;
    private final String NIP;
    private final String email;

    public Provider(final String nameCompany, final String NIP, String email) {
        this.nameCompany = nameCompany;
        this.NIP = NIP;
        this.email = email;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public String getNIP() {
        return NIP;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "nameCompany='" + nameCompany + '\'' +
                ", NIP='" + NIP + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
