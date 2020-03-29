package com.tw.io;

import com.tw.billingsystem.Invoice;

public class ConsoleWriter implements Writer {

    public void write(Invoice invoice) {
        System.out.println(invoice.toString());
    }
}
