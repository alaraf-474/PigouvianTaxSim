package com.example.economics;

import java.util.Map;

public class PigouvianTaxService {

    private double taxAmount;
    private final double basePrice;
    private final double baseQuantity;
    private final double supplyElasticity;
    private final double demandElasticity;

    public PigouvianTaxService(double basePrice, double baseQuantity, double taxAmount) {
        this.basePrice = basePrice;
        this.baseQuantity = baseQuantity;
        this.taxAmount = taxAmount;
        this.supplyElasticity = 0.5;
        this.demandElasticity = -0.7;
    }

    public Map<String, Double> getMarketEquilibriumWithoutTax() {
        return Map.of("price", basePrice, "quantity", baseQuantity);
    }

    public Map<String, Double> getMarketEquilibriumWithTax() {
        double newPrice = basePrice + taxAmount;
        double newQuantity = baseQuantity + (taxAmount * demandElasticity);
        return Map.of("price", round(newPrice), "quantity", round(newQuantity));
    }

    public Map<String, Double> getSupplyCurves() {
        return Map.of("privateMC", supplyElasticity, "socialMC", supplyElasticity + taxAmount);
    }

    public Map<String, Double> getDemandCurve() {
        return Map.of("elasticity", demandElasticity);
    }

    public void updateTax(double newTax) {
        this.taxAmount = newTax;
    }

    private double round(double val) {
        return Math.round(val * 100.0) / 100.0;
    }
}
