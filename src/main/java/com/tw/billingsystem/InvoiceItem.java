package com.tw.billingsystem;

public class InvoiceItem {
    private final String name;
    private final Double quantity;
    private final Double amountToPay;

    public InvoiceItem(String name, Double quantity, Double amountToPay) {
        this.name = name;
        this.quantity = quantity;
        this.amountToPay = amountToPay;
    }

    public String getName() {
        return name;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getAmountToPay() {
        return amountToPay;
    }
}
