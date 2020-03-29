package com.tw.billingsystem;

import java.util.List;

public interface InvoiceGenerator {
    public Invoice generate(Customer customer);
}
