package com.tw.billingsystem;

public class ItemDiscount implements Discount {

    private final Integer minItemQuantity;
    private final Integer freeItemQuantity;

    public ItemDiscount(Integer minItemQuantity, Integer freeItemQuantity) {
        this.minItemQuantity = minItemQuantity;
        this.freeItemQuantity = freeItemQuantity;
    }

    public Double calculateDiscount(Double quantity, Double price, SubCategory subCategory) {

        int discountGroup = minItemQuantity + freeItemQuantity;
        int quantityInteger = quantity.intValue();
        int freeItemFactor = (quantityInteger / discountGroup);
        int freeItems = freeItemFactor * freeItemQuantity;
        double lastFreeItems = quantity % discountGroup - minItemQuantity;
        lastFreeItems = (lastFreeItems < 0) ? 0 : lastFreeItems;
        return (freeItems + lastFreeItems) * price;
    }

}
