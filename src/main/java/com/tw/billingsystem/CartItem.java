package com.tw.billingsystem;

public class CartItem {
    private Item item;
    private Double quantity;

    public CartItem(Item item, Double quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public Double getQuantity() {
        return quantity;
    }
}
