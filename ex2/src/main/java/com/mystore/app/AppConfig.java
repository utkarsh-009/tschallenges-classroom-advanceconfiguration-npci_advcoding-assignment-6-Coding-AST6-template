package com.mystore.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Product tumbler() {
        return new Product("Tumbler", "TUM123");
    }

    @Bean
    public Product bucket() {
        return new Product("Bucket", "BUC456");
    }
}