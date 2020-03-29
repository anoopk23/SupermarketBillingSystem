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
        String customerName = getCustomerName(line1);
        String line2 = scanner.nextLine();
        List<CartItem> itemsPicked = getPickedItems(line2);
        return new Customer(customerName, itemsPicked);
    }

    private List<CartItem> getPickedItems(String line2) {
        String[] itemStringArray = line2.split(", ");
        List<CartItem> cartItems = new LinkedList<CartItem>();
        for(String itemString: itemStringArray) {
            String[] itemArray = itemString.split(" ");
            Item item = ItemData.itemMap.get(itemArray[0]);
            Double amount;
            try {
                 amount = Double.parseDouble(itemArray[1]);
            } catch (NumberFormatException ex) {
                throw new RuntimeException(Constants.invalidItemsInputFormat);
            }
            cartItems.add(new CartItem(item, amount));
        }
        return cartItems;
    }

    private String getCustomerName(String line) {
        String[] words = line.split(" ");

        int customerLastNameIndex = -1;
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals("buys") && i != 0) {
                customerLastNameIndex = i - 1;
                break;
            }
        }
        if(customerLastNameIndex == -1) {
            throw new RuntimeException(invalidCustomerInputFormat);
        }
        return String.join(" ", Arrays.asList(words).subList(1, customerLastNameIndex + 1));
    }

}
