package com.tw.io;

import com.tw.billingsystem.CartItem;
import com.tw.billingsystem.Constants;
import com.tw.billingsystem.Item;
import com.tw.billingsystem.ItemData;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static com.tw.billingsystem.Constants.invalidCustomerInputFormat;

public class IOUtil {
    public static List<CartItem> getPickedItems(String line2) {
        String[] itemStringArray = line2.split(", ");
        List<CartItem> cartItems = new LinkedList<CartItem>();
        for(String itemString: itemStringArray) {
            String[] itemArray = itemString.split(" ");
            Item item = ItemData.itemMap.get(String.join(" ", Arrays.asList(itemArray).subList(0, itemArray.length - 1)));
            Double amount = extractNumber(itemArray[itemArray.length - 1]);

            cartItems.add(new CartItem(item, amount));
        }
        return cartItems;
    }

    private static Double extractNumber(String quantity) {
        StringBuilder numberString = new StringBuilder();
        boolean biggerUnit = false;
        for(int i = 0; i < quantity.length(); i ++) {
            char c = quantity.charAt(i);
            if(('0' < c && c < '9') || c == '.') {
                numberString.append(c);
            } else {
                if(i != 0) {
                    char prevChar = quantity.charAt(i - 1);
                    if ((prevChar == 'K' && c == 'g') || (prevChar == 'L' && c == 't')) {
                        biggerUnit = true;
                    }
                }
            }
        }
        try {
            Double number = Double.parseDouble(numberString.toString());
            return (biggerUnit) ? number : number / 1000.0;
        } catch (NumberFormatException ex) {
            throw new RuntimeException(Constants.invalidItemsInputFormat);
        }
    }

    public static String getCustomerName(String line) {
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
