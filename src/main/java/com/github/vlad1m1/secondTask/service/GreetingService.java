package com.github.vlad1m1.secondTask.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet(String name) {
        return "Hello " + name + "!";
    }
}
