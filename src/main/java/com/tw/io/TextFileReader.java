package com.tw.io;

import com.tw.billingsystem.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static com.tw.billingsystem.Constants.invalidCustomerInputFormat;

public class TextFileReader implements Reader {
    public Customer read() throws IOException {
        Scanner scanner = new Scanner(System.in);

        String filePath = System.getProperty("user.dir") + "/src/main/resources/CustomerInput.txt";
        BufferedReader fileReader = new BufferedReader(new FileReader(filePath));


        String line1 = fileReader.readLine();
        if(line1 == null) {
            throw new RuntimeException(Constants.invalidCustomerInputFormat);
        }
        String customerName = IOUtil.getCustomerName(line1);
        String line2 = fileReader.readLine();
        if(line2 == null) {
            throw new RuntimeException(Constants.invalidItemsInputFormat);
        }
        List<CartItem> itemsPicked = IOUtil.getPickedItems(line2);
        return new Customer(customerName, itemsPicked);
    }


}
