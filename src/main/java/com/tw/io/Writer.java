package com.tw.io;

import com.tw.billingsystem.Invoice;

public interface Writer {
    void write(Invoice invoice);
}
