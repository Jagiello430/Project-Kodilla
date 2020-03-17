package com.kodilla.patterns;

public class ProductOrderService {
    public static void main(String[] args) {
        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retriever();

        RentalProcessor orderProcessor = new RentalProcessor(
                new MailService(), new ProductRentalService(), new ProductRentalRepository());
        orderProcessor.process(rentRequest);
    }
}
