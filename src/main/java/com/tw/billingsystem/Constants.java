package com.tw.billingsystem;

public class Constants {

    public static final String emptyString             = "";
    public static String       invalidItemsInputFormat = "Invalid items format, Expected format: <Item Name1> <Quantity1><Unit1>, <Item Name1> <Quantity1><Unit1>";

    private Constants() {
    }

    public static final String enterChoiceMessage = "Enter your choice : 1. File reader 2. Console Reader";
    public static final int fileReaderChoice = 1;
    public static final String invalidCustomerInputFormat = "Invalid input format, Expected format: Customer <NAME> buys following items";
}
