package com.sandbox.comparable;

public class Orange extends Fruit{

    public Orange(String type, String color, int size) {
        super(type, color, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Orange {");
        sb.append("Type='").append(type).append('\'');
        sb.append(", Color='").append(color).append('\'');
        sb.append(", Size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}