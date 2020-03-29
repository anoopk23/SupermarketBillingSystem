package com.tw.billingsystem;

public class Constants {

    public static final String emptyString             = "";
    public static String       invalidItemsInputFormat = "Invalid items format, Expected format: <Item Name1> <Quantity1><Unit1>, <Item Name1> <Quantity1><Unit1>";
    public static String newLine = "\n";
    public static String tabSpace = "\t\t\t";
    public static String dashlineSeparator = "--------------------------------------------";
    public static String totalAmountString = "Total Amount";
    public static String youSavedString = "You saved";
    public static String dash = " - ";
    public static String equalString = " = ";
    public static String customerString = "Customer: ";
    public static String itemString = "Item";
    public static String QtyString = "Qty";
    public static String AmountString = "Amount";
    private Constants() {
    }

    public static final String enterChoiceMessage = "Enter your choice : 1. File reader 2. Console Reader";
    public static final int fileReaderChoice = 1;
    public static final String invalidCustomerInputFormat = "Invalid input format, Expected format: Customer <NAME> buys following items";
}
