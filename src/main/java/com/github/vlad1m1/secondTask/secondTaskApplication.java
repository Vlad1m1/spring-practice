package com.github.vlad1m1.secondTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.github.vlad1m1.secondTask")
public class secondTaskApplication {
    public static void main(String[] args) {
        SpringApplication.run(secondTaskApplication.class, args);
    }
}
