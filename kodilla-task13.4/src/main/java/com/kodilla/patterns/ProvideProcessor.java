package com.kodilla.patterns;

public class ProvideProcessor {
    private InformationService informationService;
    private ProvideService provideService;
    private ProvideRepository provideRepository;

    public ProvideProcessor(final MailService informationService,
                           final ProvideService provideService,
                           final ProvideRepository provideRepository) {
        this.informationService = informationService;
        this.provideService = provideService;
        this.provideRepository = provideRepository;
    }

    public ProvideDto process(final ProvideRequest provideRequestRequest) {
        boolean isProvide = provideService.order(provideRequestRequest.getProvider(), provideRequestRequest.getDeliveryDate(),
                provideRequestRequest.getProductOfDelivery());
        if(isProvide) {
            informationService.inform(provideRequestRequest.getProvider());
            provideRepository.createOrder(provideRequestRequest.getProvider(), provideRequestRequest.getDeliveryDate(), provideRequestRequest.getProductOfDelivery());
            return new ProvideDto(provideRequestRequest.getProvider(), true);
        } else {
            return new ProvideDto(provideRequestRequest.getProvider(), false);
        }
    }
}
