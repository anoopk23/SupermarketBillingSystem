package com.tw.billingsystem;

public abstract class Category {
    private final String name;
    private final Double discountPercentage;

    public Category(String name, Double discountPercentage) {
        this.name = name;
        this.discountPercentage = discountPercentage;
    }

    public String getName() {
        return name;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }
}
