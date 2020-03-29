package com.tw.billingsystem;

public abstract class Category {
    private final String name;
    private final PercentDiscount discount;

    public Category(String name, PercentDiscount discount) {
        this.name = name;
        this.discount = discount;
    }

    public PercentDiscount maxDiscount(Category parentCategory) {
        if(this.discount.compareTo(parentCategory.discount)) {
            return this.discount;
        }
        return parentCategory.discount;
    }
}
