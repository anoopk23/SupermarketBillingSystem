package com.tw.billingsystem;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class ItemTest extends TestCase {
    private final MainCategory produceMainCategory = new MainCategory("Produce", new PercentDiscount(10.0));
    private final MainCategory dairyMainCategory = new MainCategory("Dairy", new PercentDiscount(10.0));
    private final SubCategory fruitsSubCategory = new SubCategory("Fruits", new PercentDiscount(18.0), produceMainCategory);
    private final SubCategory cheeseSubCategory = new SubCategory("Cheese", new PercentDiscount(20.0), dairyMainCategory);
    private final Item item1 = new Item(fruitsSubCategory, "Apple", MeasuringUnitType.WEIGHT, 50.0, new ItemDiscount(3, 1));
    private final Item item2 = new Item(cheeseSubCategory, "Gouda", MeasuringUnitType.WEIGHT, 80.0, new PercentDiscount(10.0));
    private final double quantity1 = 6;
    private final double quantity2 = 2;

    public void testCalculateAmountToPay() {

        Assertions.assertEquals(item1.calculateAmountToPay(quantity1), 250.0);
        Assertions.assertEquals(item2.calculateAmountToPay(quantity2), 128.0);
    }

    public void testCalculateTotalAmount() {

        Assertions.assertEquals(item1.calculateTotalAmount(quantity1), 300.0);
        Assertions.assertEquals(item2.calculateTotalAmount(quantity2), 160.0);
    }
}