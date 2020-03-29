package com.tw.billingsystem;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Invoice {
    private String customerName;
    private Double amountToPay;
    private Double totalAmount;
    private Double amountSaved;
    private List<InvoiceItem> items;

    public Invoice(String customerName, Double amountToPay, Double totalAmount, List<InvoiceItem> boughtItems) {
        this.customerName = customerName;
        this.amountToPay = amountToPay;
        this.totalAmount = totalAmount;
        this.amountSaved = totalAmount - amountToPay;
        this.items = boughtItems;
    }

    @Override
    public String toString() {
        StringBuilder invoiceBuilder = new StringBuilder();
        invoiceBuilder.append(Constants.customerString).append(this.customerName).append(Constants.newLine).append(Constants.newLine);
        invoiceBuilder.append(Constants.itemString).append(Constants.tabSpace).append(Constants.QtyString).append(Constants.tabSpace).append(Constants.AmountString).append(Constants.newLine);
        for(InvoiceItem item: items) {
            invoiceBuilder.append(item.toString()).append(Constants.newLine);
        }
        invoiceBuilder.append(Constants.newLine);
        invoiceBuilder.append(Constants.dashlineSeparator).append(Constants.newLine);
        invoiceBuilder.append(Constants.totalAmountString).append(Constants.tabSpace).append(Constants.tabSpace).append(amountToPay).append(Constants.newLine);
        invoiceBuilder.append(Constants.youSavedString).append(Constants.tabSpace).append(totalAmount).append(Constants.dash).append(amountToPay).append(Constants.equalString).append(amountSaved);
        return invoiceBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Invoice))
            return false;
        Invoice invoice = (Invoice) o;
        return Objects.equals(customerName, invoice.customerName) && Objects.equals(amountToPay, invoice.amountToPay) && Objects.equals(totalAmount, invoice.totalAmount)
                && Objects.equals(amountSaved, invoice.amountSaved) && Objects.equals(items, invoice.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, amountToPay, totalAmount, amountSaved, items);
    }
}
