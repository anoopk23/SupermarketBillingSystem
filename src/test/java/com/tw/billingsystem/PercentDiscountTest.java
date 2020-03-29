package com.tw.billingsystem;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class PercentDiscountTest extends TestCase {

    private final PercentDiscount percentDiscount1 = new PercentDiscount(10.0);
    private final PercentDiscount percentDiscount2 = new PercentDiscount(20.0);
    private final MainCategory produceMainCategory = new MainCategory("Produce", percentDiscount1);
    private final SubCategory fruitsSubCategory = new SubCategory("Fruits", percentDiscount2, produceMainCategory);

    public void testCalculateDiscount() {
        Assertions.assertEquals(percentDiscount1.calculateDiscount(10.0, 5.0, fruitsSubCategory), 10.0);
    }

    public void testCompareTo() {
        Assertions.assertFalse(percentDiscount1.compareTo(percentDiscount2));
    }
}