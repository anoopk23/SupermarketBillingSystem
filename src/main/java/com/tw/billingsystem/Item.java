package com.tw.billingsystem;

public class Item {
    private final SubCategory       subCategory;
    private final String            name;
    private final MeasuringUnitType unitType;
    private final Double            cost; //in Kg or Liter
    private final Discount      discount;

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
        return quantity * this.cost - this.discount.calculateDiscount(quantity, cost, subCategory);
    }

    public Double calculateTotalAmount(Double quantity) {
        return quantity * this.cost;
    }

}
