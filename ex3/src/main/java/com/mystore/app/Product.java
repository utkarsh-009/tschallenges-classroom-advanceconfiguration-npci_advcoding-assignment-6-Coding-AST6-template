package com.mystore.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {
    private String name;
    private Barcode barcode;

    @Autowired
    public Product(String name, Barcode barcode) {
        this.name = name;
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode.getCode();
    }
}