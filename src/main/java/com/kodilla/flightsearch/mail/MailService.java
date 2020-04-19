package com.kodilla.flightsearch.mail;

import com.kodilla.flightsearch.user.User;

public class MailService implements InformationService{

    @Override
    public void info(User user) {
        System.out.println("Send mail to " + user.getName() + " " + user.getSurname() + " for mail " + user.getMail());
    }
}
