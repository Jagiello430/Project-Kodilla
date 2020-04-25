package com.kodilla.flightsearch.retriever;

import com.kodilla.flightsearch.user.User;

public class UserRetrieverRequest {

    public UserRequest retriever() {
        User user = new User("Jacek", "Kowalski", "janusz123@gmail.com");
        String departure = "wroclaw";
        String arrival = "gdansk";
        return new UserRequest(user, departure, arrival);
    }
}
