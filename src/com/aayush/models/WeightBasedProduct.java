package com.aayush.models;

public class WeightBasedProduct extends Product{

    private double minQty;
    private int pricePerKg;

    public WeightBasedProduct(String name, double minQty, int pricePerKg) {
        super(name);
        this.minQty = minQty;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        return "WeightBasedProduct{" +
                "name='" + name + '\'' +
                ", minQty=" + minQty +
                ", pricePerKg=" + pricePerKg +
                '}';
    }
}
