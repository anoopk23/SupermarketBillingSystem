package com.tw.billingsystem;

import java.util.LinkedList;
import java.util.List;

public class Customer {
    private final String name;
    private final List<CartItem> items;

    public Customer(String name, List<CartItem> items) {
        this.name = name;
        this.items = items;
    }

    public Invoice generateInvoice() {
        List<InvoiceItem> invoiceItems = new LinkedList<InvoiceItem>();
        double totalPrice = 0.0;
        double amountToPay = 0.0;
        for(CartItem cartItem: this.items) {
            double itemPrice = cartItem.calculateDiscountedPrice();
            invoiceItems.add(cartItem.getInvoiceItem());
            amountToPay += itemPrice;
            totalPrice += cartItem.calculateTotalPrice();
        }
        return new Invoice(this.name, amountToPay, totalPrice, invoiceItems);
    }
}
