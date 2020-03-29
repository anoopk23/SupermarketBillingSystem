package com.tw.billingsystem;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ItemData {
    public static List<Item> items = new LinkedList<Item>();
    public static Map<String, Item> itemMap = new HashMap<String, Item>();


    static {
        MainCategory produceMainCategory = new MainCategory("Produce", 10.0);
        MainCategory dairyMainCategory = new MainCategory("Dairy", 10.0);

        SubCategory fruitsSubCategory = new SubCategory("Fruits", 18.0, produceMainCategory);
        SubCategory vegSubCategory = new SubCategory("Veg", 5.0, produceMainCategory);
        SubCategory milkSubCategory = new SubCategory("Milk", 20.0, dairyMainCategory);
        SubCategory cheeseSubCategory = new SubCategory("Cheese", 20.0, dairyMainCategory);

        items.add(new Item(fruitsSubCategory, "Apple", MeasuringUnitType.WEIGHT, 50.0, new Discount(3, 1)));
        items.add(new Item(fruitsSubCategory, "Orange", MeasuringUnitType.WEIGHT, 80.0, new Discount(20.0)));
        items.add(new Item(vegSubCategory, "Potato", MeasuringUnitType.WEIGHT, 30.0, new Discount(5, 2)));
        items.add(new Item(vegSubCategory, "Tomato", MeasuringUnitType.WEIGHT, 70.0, new Discount(10.0)));
        items.add(new Item(milkSubCategory, "Cow Milk", MeasuringUnitType.WEIGHT, 50.0, new Discount(3, 1)));
        items.add(new Item(milkSubCategory, "Soy Milk", MeasuringUnitType.VOLUME, 40.0, new Discount(10.0)));
        items.add(new Item(cheeseSubCategory, "Cheddar", MeasuringUnitType.VOLUME, 50.0, new Discount(2, 1)));
        items.add(new Item(cheeseSubCategory, "Gouda", MeasuringUnitType.WEIGHT, 80.0, new Discount(10.0)));

        for (Item item: items) {
            itemMap.put(item.getName(), item);
        }
    }

}
