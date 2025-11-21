package com.github.vlad1m1.firstTask.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet(String name) {
        return "Hello " + name + "!";
    }
}
