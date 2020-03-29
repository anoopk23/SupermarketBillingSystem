package com.tw.billingsystem;

public class MathUtility {

    private MathUtility() {
    }

    public static double convertToPrimitiveDouble(Double value) {
        return value == null ? 0 : value.doubleValue();
    }

    public static double max(double... values) {
        double maxValue = Double.MIN_VALUE;
        for (int i = 0; i < values.length; i++) {
            maxValue = Math.max(maxValue, values[i]);
        }
        return maxValue;
    }

}
