package com.kodilla.patterns;

public class MailService implements InformationService {
    @Override
    public void inform(Provider provider) {
        System.out.println(provider.getNameCompany() + " NIP: " + provider.getNIP() + " made order in our shop, Thank you. " + "\n" +
                "We send Mail to: " + provider.getEmail());
    }
}
