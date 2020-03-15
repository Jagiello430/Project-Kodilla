package com.kodilla.patterns;

public class MailService implements InformationService {
    @Override
    public void inform(Provider provider) {
        System.out.println("Send Mail to: " + provider.getEmail());
    }
}
