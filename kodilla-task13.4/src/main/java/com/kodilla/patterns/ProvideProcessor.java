package com.kodilla.patterns;

public class ProvideProcessor {
    private InformationService informationService;
    private ProvideService rentalService;
    private ProvideRepository rentalRepository;

    public ProvideProcessor(final MailService informationService,
                           final ProvideService rentalService,
                           final ProvideRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public ProvideDto process(final ProvideRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getProvider(), rentRequest.getDeliveryDate(),
                rentRequest.getTypeOfDelivery());
        if(isRented) {
            informationService.inform(rentRequest.getProvider());
            rentalRepository.createOrder(rentRequest.getProvider(), rentRequest.getDeliveryDate(), rentRequest.getTypeOfDelivery());
            return new ProvideDto(rentRequest.getProvider(), true);
        } else {
            return new ProvideDto(rentRequest.getProvider(), false);
        }
    }
}
