package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the Spring application context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve Product beans from the Spring context
        Product tumbler = context.getBean("tumbler", Product.class);
        Product bucket = context.getBean("bucket", Product.class);

        // Display the products
        System.out.println("Product 1: " + tumbler.getName() + " - " + tumbler.getBarcode());
        System.out.println("Product 2: " + bucket.getName() + " - " + bucket.getBarcode());
    }
}