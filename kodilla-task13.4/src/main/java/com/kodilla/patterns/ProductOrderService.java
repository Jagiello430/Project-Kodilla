package com.kodilla.patterns;

public class ProductOrderService {
    public static void main(String[] args) {
        ProvideRequestRetriever provideRequestRetriever = new ProvideRequestRetriever();
        ProvideRequest provideRequest = provideRequestRetriever.retriever();

        ProvideProcessor orderProcessor = new ProvideProcessor(
                new MailService(), new ProductProvideService(), new ProductProvideRepository());
        orderProcessor.process(provideRequest);
    }
}
