package com.tw.billingsystem;

public class PercentDiscount implements Discount {
    private Double percentage;

    public PercentDiscount(Double percentage) {
        this.percentage = percentage;
    }

    public Double calculateDiscount(Double quantity, Double price, SubCategory subCategory) {
        return quantity * price * Math.max(subCategory.maxDiscount().percentage, percentage) / 100.0;
    }

    public boolean compareTo(PercentDiscount d1) {
        return this.percentage > d1.percentage;
    }
}
