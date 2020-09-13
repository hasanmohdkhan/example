package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        PriceTable table = new PriceTableSimplePayment ();
        FreightService freight = new Freight();

        PriceCalculator calculator = new PriceCalculator(table, freight);
        double preco1 = calculator.calculates(new Product("Notebook", 1200.0, "minas gerais"));

        System.out.println("Result: "+preco1);

        PriceTablePaymentInInstallments  table2 = new PriceTablePaymentInInstallments ();
        FreightService freight2 = new Freight();

        PriceCalculator calculadora2 = new PriceCalculator(table2, freight2);
        double preco2 = calculadora2.calculates(new Product("Monitor 21'", 719.0, "sao paulo"));


        System.out.println("Result: "+preco2);

    }
}
