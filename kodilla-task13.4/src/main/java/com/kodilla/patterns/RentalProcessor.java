package com.kodilla.patterns;

public class RentalProcessor {
    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(final MailService informationService,
                           final RentalService rentalService,
                           final RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getProvider(), rentRequest.getDeliveryDate(),
                rentRequest.getTypeOfDelivery());
        if(isRented) {
            informationService.inform(rentRequest.getProvider());
            rentalRepository.createOrder(rentRequest.getProvider(), rentRequest.getDeliveryDate(), rentRequest.getTypeOfDelivery());
            return new RentalDto(rentRequest.getProvider(), true);
        } else {
            return new RentalDto(rentRequest.getProvider(), false);
        }
    }
}
