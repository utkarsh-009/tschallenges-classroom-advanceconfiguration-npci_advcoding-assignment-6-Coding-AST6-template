package com.mystore.app;

import org.springframework.stereotype.Component;

@Component
public class Barcode {
    private String code;

    public Barcode() {
        this.code = "BAR123"; // Default barcode
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}