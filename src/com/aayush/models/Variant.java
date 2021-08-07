package com.aayush.models;

public class Variant {

    String name;
    int price;

    public Variant(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Variant{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
