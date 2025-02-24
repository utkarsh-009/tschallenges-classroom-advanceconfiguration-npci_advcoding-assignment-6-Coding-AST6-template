package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the Spring application context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the Product bean from the Spring context
        Product product = context.getBean(Product.class);

        // Display the product details
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Barcode: " + product.getBarcode());
    }
}