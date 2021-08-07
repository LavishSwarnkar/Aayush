package com.aayush;

import com.aayush.models.Product;
import com.aayush.models.Variant;
import com.aayush.models.VariantsBasedProduct;
import com.aayush.models.WeightBasedProduct;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("Apple");
        WeightBasedProduct wbp = new WeightBasedProduct(product.name,2.5,100);
        System.out.println(wbp);

        VariantsBasedProduct vbp = new VariantsBasedProduct(
                Arrays.asList(
                        new Variant("500g", 50),
                        new Variant("1kg", 100)
                )
        );
        System.out.println(vbp);
    }
}
