package com.tw.billingsystem;

import java.util.Objects;

public class InvoiceItem {
    private final String name;
    private final Double quantity;
    private final Double amountToPay;

    public InvoiceItem(String name, Double quantity, Double amountToPay) {
        this.name = name;
        this.quantity = quantity;
        this.amountToPay = amountToPay;
    }

    @Override
    public String toString() {
        return this.name + Constants.tabSpace + this.quantity + Constants.tabSpace + this.amountToPay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof InvoiceItem))
            return false;
        InvoiceItem that = (InvoiceItem) o;
        return Objects.equals(name, that.name) && Objects.equals(quantity, that.quantity) && Objects.equals(amountToPay, that.amountToPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity, amountToPay);
    }
}
