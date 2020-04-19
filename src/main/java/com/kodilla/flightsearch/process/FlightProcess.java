package com.kodilla.flightsearch.process;

import com.kodilla.flightsearch.mail.InformationService;
import com.kodilla.flightsearch.mail.MailService;
import com.kodilla.flightsearch.repository.Repository;
import com.kodilla.flightsearch.repository.UserRepository;

public class FlightProcess {
    private final InformationService informationService;
    private final Repository repository;

    public FlightProcess(final MailService informationService,
                         final UserRepository repository) {
        this.informationService = informationService;
        this.repository = repository;
    }
}
