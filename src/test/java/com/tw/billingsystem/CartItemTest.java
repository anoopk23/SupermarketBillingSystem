package com.tw.billingsystem;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class CartItemTest extends TestCase {

    private final CartItem cartItem1 = new CartItem(ItemData.itemMap.get("Apple"), 6.0);
    private final CartItem cartItem2 = new CartItem(ItemData.itemMap.get("Orange"), 2.0);

    public void testCalculateDiscountedPrice() {
        Assertions.assertEquals(cartItem1.calculateDiscountedPrice(), 250.0);
        Assertions.assertEquals(cartItem2.calculateDiscountedPrice(), 128.0);
    }

    public void testCalculateTotalPrice() {
        Assertions.assertEquals(cartItem1.calculateTotalPrice(), 300.0);
        Assertions.assertEquals(cartItem2.calculateTotalPrice(), 160.0);
    }
}