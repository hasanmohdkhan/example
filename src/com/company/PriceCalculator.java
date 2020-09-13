package com.company;

public class PriceCalculator {

    private PriceTable table;
    private FreightService freight;

    public PriceCalculator(PriceTable table, FreightService freight) {
        this.table = table;
        this.freight = freight;
    }

    public double calculates(Product product) {
        double discount = table.calculatesDiscount(product.getPrice());
        double freightValue = freight.calculatesFreight(product.getState());
        return product.getPrice() * (1 - discount) + freightValue;
    }
}