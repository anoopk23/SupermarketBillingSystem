package com.tw.billingsystem;

public class Item {
    private final SubCategory subCategory;
    private final String name;
    private final MeasuringUnitType unitType;
    private final Double cost; // cost per base unit(g in WEIGHT, ml in VOLUME)
    private final Discount discount;

    public Item(SubCategory subCategory, String name, MeasuringUnitType unitType, Double cost, Discount discount) {
        this.subCategory = subCategory;
        this.name = name;
        this.unitType = unitType;
        this.cost = cost;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public Double calculateAmountToPay(Double quantity) {
        if(this.discount.isItemDiscount()) {
            int discountFactor = quantity.intValue() / this.discount.getMinItemQuantity();
            int nonDiscountedItems = quantity.intValue() % this.discount.getMinItemQuantity();
            return discountFactor * this.cost + (nonDiscountedItems + quantity - quantity.intValue()) * this.cost;
        }
        double itemDiscount = MathUtility.convertToPrimitiveDouble(this.discount.getDiscountPercentage());
        double subCategoryDiscount = MathUtility.convertToPrimitiveDouble(this.subCategory.getDiscountPercentage());
        double categoryDiscount = MathUtility.convertToPrimitiveDouble(this.subCategory.getMainCategory().getDiscountPercentage());
        double maxDiscount = MathUtility.max(itemDiscount, subCategoryDiscount, categoryDiscount);
        return quantity * this.cost * (1 - maxDiscount / 100);
    }

    public Discount getDiscount() {
        return discount;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public MeasuringUnitType getUnitType() {
        return unitType;
    }

    public Double getCost() {
        return cost;
    }
}
