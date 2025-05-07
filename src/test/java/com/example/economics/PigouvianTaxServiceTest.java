package com.example.economics;

public class PigouvianTaxServiceTest {

    public static void main(String[] args) {
        PigouvianTaxService service = new PigouvianTaxService(100.0, 50.0, 20.0);

        System.out.println("=== Market WITHOUT Tax ===");
        service.getMarketEquilibriumWithoutTax().forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("\n=== Market WITH Tax ===");
        service.getMarketEquilibriumWithTax().forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("\n=== Supply Curves ===");
        service.getSupplyCurves().forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("\n=== Demand Curve ===");
        service.getDemandCurve().forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("\nUpdating tax to 30.0...");
        service.updateTax(30.0);

        System.out.println("\n=== Market WITH NEW Tax ===");
        service.getMarketEquilibriumWithTax().forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
