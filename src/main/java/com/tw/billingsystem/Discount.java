package com.tw.billingsystem;

public interface Discount {
    Double calculateDiscount(Double quantity, Double price, SubCategory subCategory);
}
