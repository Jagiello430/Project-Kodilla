package com.kodilla.flightsearch;

import com.kodilla.flightsearch.engine.FlightSearch;
import com.kodilla.flightsearch.mail.MailService;
import com.kodilla.flightsearch.process.FlightProcess;
import com.kodilla.flightsearch.repository.UserRepository;
import com.kodilla.flightsearch.retriever.UserRequest;
import com.kodilla.flightsearch.retriever.UserRetrieverRequest;

public class MainService {
    public static void main(java.lang.String[] args) {
        UserRetrieverRequest userRetrieverRequest = new UserRetrieverRequest();
        UserRequest userRequest = userRetrieverRequest.retriever();

        FlightProcess flightProcess = new FlightProcess(new MailService(), new UserRepository(), new FlightSearch());
        flightProcess.process(userRequest);
    }
}
