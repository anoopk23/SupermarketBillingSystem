package com.tw.billingsystem;

import java.util.List;

public class SubCategory extends Category {

    private final MainCategory mainCategory;

    public SubCategory(String name, Double discountPercentage, MainCategory mainCategory) {
        super(name, discountPercentage);
        this.mainCategory = mainCategory;
    }

    public MainCategory getMainCategory() {
        return mainCategory;
    }
}
