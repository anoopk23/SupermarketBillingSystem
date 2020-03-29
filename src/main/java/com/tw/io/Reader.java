package com.tw.io;

import com.tw.billingsystem.Customer;

import java.io.IOException;

public interface Reader {

    Customer read() throws IOException;
}
