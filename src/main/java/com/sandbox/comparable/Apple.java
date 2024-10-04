package com.sandbox.comparable;

public class Apple extends Fruit implements Comparable<Orange> {


    public Apple(String type, String color, int size) {
        super(type, color, size);
    }

    @Override
    public int compareTo(Orange orange) {
        int typeComparison = this.type.compareTo(orange.getType());
        if (typeComparison != 0) {
            return typeComparison;
        }
        int colorComparison = this.color.compareTo(orange.getColor());
        if (colorComparison != 0) {
            return colorComparison;
        }
        return Integer.compare(this.size, orange.getSize());
    }
}