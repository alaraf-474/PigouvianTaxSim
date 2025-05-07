package com.example.economics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Pigouvian Tax Simulator ===");

        System.out.print("Enter base price of aluminum: ");
        double price = sc.nextDouble();

        System.out.print("Enter base quantity of aluminum: ");
        double quantity = sc.nextDouble();

        System.out.print("Enter tax amount per unit: ");
        double tax = sc.nextDouble();

        PigouvianTaxService service = new PigouvianTaxService(price, quantity, tax);

        System.out.println("\n[Market Equilibrium WITHOUT Tax]");
        service.getMarketEquilibriumWithoutTax().forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("\n[Market Equilibrium WITH Tax]");
        service.getMarketEquilibriumWithTax().forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("\n[Supply Curves]");
        service.getSupplyCurves().forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("\n[Demand Curve]");
        service.getDemandCurve().forEach((k, v) -> System.out.println(k + ": " + v));

        sc.close();
    }
}
