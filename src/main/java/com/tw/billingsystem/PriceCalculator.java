package com.tw.billingsystem;

public class PriceCalculator {

    public static Double calculateDiscountedPrice(CartItem cartItem) {

        Double quantity = cartItem.getQuantity();
        Item item = cartItem.getItem();
        if(item.getDiscount().isItemDiscount()) {
            int discountFactor = quantity.intValue() / item.getDiscount().getMinItemQuantity();
            int nonDiscountedItems = quantity.intValue() % item.getDiscount().getMinItemQuantity();
            return discountFactor * item.getCost ()+ (nonDiscountedItems + quantity - quantity.intValue()) * item.getCost();
        }
        double itemDiscount = MathUtility.convertToPrimitiveDouble(item.getDiscount().getDiscountPercentage());
        double subCategoryDiscount = MathUtility.convertToPrimitiveDouble(item.getSubCategory().getDiscountPercentage());
        double categoryDiscount = MathUtility.convertToPrimitiveDouble(item.getSubCategory().getMainCategory().getDiscountPercentage());
        double maxDiscount = MathUtility.max(itemDiscount, subCategoryDiscount, categoryDiscount);
        return quantity * item.getCost() * (1 - maxDiscount / 100);
    }

    public static Double calculateTotalPrice(CartItem cartItem) {
        return cartItem.getQuantity() * cartItem.getItem().getCost();
    }
}
