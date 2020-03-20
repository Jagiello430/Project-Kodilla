package com.kodilla.patterns;

import java.time.LocalDate;
import java.util.Scanner;

public class ProvideRequestRetriever {
    public ProvideRequest retriever() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("name company: ");
        String nameCompany = scanner.nextLine();

        System.out.print("nip: ");
        String nip = scanner.nextLine();

        System.out.print("email: ");
        String email = scanner.nextLine();

        System.out.print("arrive date year: ");
        int years = scanner.nextInt();
        System.out.print("month: ");
        int month = scanner.nextInt();
        System.out.print("day: ");
        int day = scanner.nextInt();

        System.out.print("amount of products: ");
        int amountOfProducts = scanner.nextInt();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= amountOfProducts; i++) {
            stringBuilder.append(scanner.nextLine()).append(" ");
            System.out.println("product delivery: ");
        }

        Provider provider = new Provider(nameCompany, nip, email);
        LocalDate deliveryDate = LocalDate.of(years,month,day);
        return new ProvideRequest(provider,deliveryDate,amountOfProducts,stringBuilder);
    }
}

