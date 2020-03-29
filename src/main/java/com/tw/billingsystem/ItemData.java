package com.tw.billingsystem;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ItemData {
    public static List<Item> items = new LinkedList<Item>();
    public static Map<String, Item> itemMap = new HashMap<String, Item>();


    static {
        MainCategory produceMainCategory = new MainCategory("Produce", new PercentDiscount(10.0));
        MainCategory dairyMainCategory = new MainCategory("Dairy", new PercentDiscount(10.0));

        SubCategory fruitsSubCategory = new SubCategory("Fruits", new PercentDiscount(18.0), produceMainCategory);
        SubCategory vegSubCategory = new SubCategory("Veg", new PercentDiscount(5.0), produceMainCategory);
        SubCategory milkSubCategory = new SubCategory("Milk", new PercentDiscount(20.0), dairyMainCategory);
        SubCategory cheeseSubCategory = new SubCategory("Cheese", new PercentDiscount(20.0), dairyMainCategory);

        items.add(new Item(fruitsSubCategory, "Apple", MeasuringUnitType.WEIGHT, 50.0, new ItemDiscount(3, 1)));
        items.add(new Item(fruitsSubCategory, "Orange", MeasuringUnitType.WEIGHT, 80.0, new PercentDiscount(20.0)));
        items.add(new Item(vegSubCategory, "Potato", MeasuringUnitType.WEIGHT, 30.0, new ItemDiscount(5, 2)));
        items.add(new Item(vegSubCategory, "Tomato", MeasuringUnitType.WEIGHT, 70.0, new PercentDiscount(10.0)));
        items.add(new Item(milkSubCategory, "Cow Milk", MeasuringUnitType.WEIGHT, 50.0, new ItemDiscount(3, 1)));
        items.add(new Item(milkSubCategory, "Soy Milk", MeasuringUnitType.VOLUME, 40.0, new PercentDiscount(10.0)));
        items.add(new Item(cheeseSubCategory, "Cheddar", MeasuringUnitType.VOLUME, 50.0, new ItemDiscount(2, 1)));
        items.add(new Item(cheeseSubCategory, "Gouda", MeasuringUnitType.WEIGHT, 80.0, new PercentDiscount(10.0)));

        for (Item item: items) {
            itemMap.put(item.getName(), item);
        }
    }

}
