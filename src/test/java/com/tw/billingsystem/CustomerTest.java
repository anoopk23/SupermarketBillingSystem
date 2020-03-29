package com.tw.billingsystem;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class CustomerTest extends TestCase {

    public void testGenerateInvoice() {
        String customerName = "Test Name";
        Customer customer = new Customer(customerName, Arrays.asList(
                new CartItem(ItemData.itemMap.get("Apple"), 6.0),
                new CartItem(ItemData.itemMap.get("Orange"), 2.0)
        ));

        Invoice invoice = customer.generateInvoice();
        Assertions.assertEquals(invoice, new Invoice(customerName, 378.0, 460.0, Arrays.asList(
                new InvoiceItem("Apple", 6.0, 250.0),
                new InvoiceItem("Orange", 2.0, 128.0)
        )));
    }
}