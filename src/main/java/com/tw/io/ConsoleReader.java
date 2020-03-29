package com.tw.io;

import com.tw.billingsystem.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static com.tw.billingsystem.Constants.*;

public class ConsoleReader implements Reader {

    public Customer read() {

        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String customerName = IOUtil.getCustomerName(line1);
        String line2 = scanner.nextLine();
        List<CartItem> itemsPicked = IOUtil.getPickedItems(line2);
        return new Customer(customerName, itemsPicked);
    }



}
