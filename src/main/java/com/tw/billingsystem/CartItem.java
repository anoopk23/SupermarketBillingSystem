package com.tw.billingsystem;

public class CartItem {
    private Item item;
    private Double quantity;

    public CartItem(Item item, Double quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    Double calculateDiscountedPrice() {
        return this.item.calculateAmountToPay(this.quantity);
    }

    Double calculateTotalPrice() {
        return this.item.calculateTotalAmount(this.quantity);
    }

    InvoiceItem getInvoiceItem() {
        return new InvoiceItem(item.getName(), this.quantity, this.calculateDiscountedPrice());
    }

}
