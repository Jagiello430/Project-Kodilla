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

    public ProvideDto process(final ProvideRequest provideRequestRequest) {
        boolean isProvide = rentalService.rent(provideRequestRequest.getProvider(), provideRequestRequest.getDeliveryDate(),
                provideRequestRequest.getTypeOfDelivery());
        if(isProvide) {
            informationService.inform(provideRequestRequest.getProvider());
            rentalRepository.createOrder(provideRequestRequest.getProvider(), provideRequestRequest.getDeliveryDate(), provideRequestRequest.getTypeOfDelivery());
            return new ProvideDto(provideRequestRequest.getProvider(), true);
        } else {
            return new ProvideDto(provideRequestRequest.getProvider(), false);
        }
    }
}
