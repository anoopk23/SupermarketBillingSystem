package com.tw.billingsystem;

public class Discount {
    private final Double discountPercentage;
    private final Integer minItemQuantity;
    private final Integer freeItemQuantity;

    private Discount(Double discountPercentage, Integer minItemQuantity, Integer freeItemQuantity) {
        this.discountPercentage = discountPercentage;
        this.minItemQuantity = minItemQuantity;
        this.freeItemQuantity = freeItemQuantity;
    }

    public Discount(Double discountPercentage) {
        this(discountPercentage, null, null);
    }

    public Discount(Integer minItemQuantity, Integer freeItemQuantity) {
        this(null, minItemQuantity, freeItemQuantity);
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public Integer getMinItemQuantity() {
        return minItemQuantity;
    }

    public Integer getFreeItemQuantity() {
        return freeItemQuantity;
    }

    public boolean isItemDiscount() {
        return null == discountPercentage;
    }
}
