package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class RentRequestRetriever {

    public RentRequest retriever() {
        User user = new User("John", "Smith");

        LocalDateTime from = LocalDateTime.of(2019,2,29,15,25);
        LocalDateTime to = LocalDateTime.of(2019,3,2,12,30);

        return new RentRequest(user,from,to);
    }
}
