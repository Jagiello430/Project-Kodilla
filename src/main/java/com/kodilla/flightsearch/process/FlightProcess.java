package com.kodilla.flightsearch.process;

import com.kodilla.flightsearch.engine.FlightSearch;
import com.kodilla.flightsearch.engine.ServiceFlight;
import com.kodilla.flightsearch.mail.InformationService;
import com.kodilla.flightsearch.mail.MailService;
import com.kodilla.flightsearch.repository.Repository;
import com.kodilla.flightsearch.repository.UserRepository;
import com.kodilla.flightsearch.retriever.UserRequest;
import com.kodilla.flightsearch.user.UserDto;

public class FlightProcess {
    private final InformationService informationService;
    private final Repository repository;
    private final ServiceFlight serviceFlight;

    public FlightProcess(final MailService informationService,
                         final UserRepository repository,
                         final FlightSearch serviceFlight) {
        this.informationService = informationService;
        this.repository = repository;
        this.serviceFlight = serviceFlight;
    }

    public UserDto process(final UserRequest userRequest) {
        boolean isFound = serviceFlight.findFlightFromAirport1ToAirport2(userRequest.getUser(),
                userRequest.getDepartureAirportName(), userRequest.getArrivalAirportName());
        if(isFound) {
            informationService.info(userRequest.getUser());
            repository.createReservation(userRequest.getUser(),userRequest.getDepartureAirportName(),
                    userRequest.getArrivalAirportName());
            new UserDto(userRequest.getUser(), true);
        }
        return new UserDto(userRequest.getUser(), false);
    }
}
