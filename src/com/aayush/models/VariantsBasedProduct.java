package com.aayush.models;

import java.util.List;

public class VariantsBasedProduct {

    public List<Variant> variants;

    @Override
    public String toString() {
        return "VariantsBasedProduct{" +
                "variants=" + variants +
                '}';
    }

    public VariantsBasedProduct(List<Variant> variants) {
        this.variants = variants;
    }
}
