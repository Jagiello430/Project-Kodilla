package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retriever();

        RentalProcessor rentalProcessor = new RentalProcessor(
                new MailService(), new ProductRentalService(), new ProductRentalRepository());
        rentalProcessor.process(rentRequest);
    }
}
