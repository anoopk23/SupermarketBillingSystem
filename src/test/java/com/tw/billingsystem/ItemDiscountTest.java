package com.tw.billingsystem;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class ItemDiscountTest extends TestCase {

    private final MainCategory produceMainCategory = new MainCategory("Produce", new PercentDiscount(10.0));
    private final SubCategory fruitsSubCategory = new SubCategory("Fruits", new PercentDiscount(18.0), produceMainCategory);


    public void testCalculateDiscount() {
        ItemDiscount itemDiscount = new ItemDiscount(3, 1);
        Assertions.assertEquals(itemDiscount.calculateDiscount(6.0, 50.0, fruitsSubCategory), 50);
    }
}