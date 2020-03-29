package com.tw.billingsystem;

import java.util.LinkedList;
import java.util.List;

public class SupermarketInvoiceGenerator implements InvoiceGenerator {

    public Invoice generate(Customer customer) {
        List<InvoiceItem> invoiceItems = new LinkedList<InvoiceItem>();
        double totalPrice = 0.0;
        double amountToPay = 0.0;
        for(CartItem cartItem: customer.getItems()) {
            double itemPrice = PriceCalculator.calculateDiscountedPrice(cartItem);
            invoiceItems.add(new InvoiceItem(cartItem.getItem().getName(), cartItem.getQuantity(), itemPrice));
            amountToPay += itemPrice;
            totalPrice += PriceCalculator.calculateTotalPrice(cartItem);
        }
        return new Invoice(customer.getName(), amountToPay, totalPrice - amountToPay, invoiceItems);
    }

}
