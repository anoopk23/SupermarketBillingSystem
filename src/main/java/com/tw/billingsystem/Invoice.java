package com.tw.billingsystem;

import java.util.LinkedList;
import java.util.List;

public class Invoice {
    private String customerName;
    private Double amountToPay;
    private Double amountSaved;
    private List<InvoiceItem> items;

    public Invoice(String customerName, Double amountToPay, Double amountSaved, List<InvoiceItem> boughtItems) {
        this.customerName = customerName;
        this.amountToPay = amountToPay;
        this.amountSaved = amountSaved;
        this.items = boughtItems;
    }

}
