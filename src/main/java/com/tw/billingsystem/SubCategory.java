package com.tw.billingsystem;

import java.util.List;

public class SubCategory extends Category {

    private final MainCategory mainCategory;

    public SubCategory(String name, PercentDiscount discount, MainCategory mainCategory) {
        super(name, discount);
        this.mainCategory = mainCategory;
    }

    public PercentDiscount maxDiscount() {
        return super.maxDiscount(mainCategory);
    }
}
