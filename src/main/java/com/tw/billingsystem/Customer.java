package com.tw.billingsystem;

import java.util.List;

public class Customer {
    private final String name;
    private final List<CartItem> items;

    public Customer(String name, List<CartItem> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public List<CartItem> getItems() {
        return items;
    }
}
