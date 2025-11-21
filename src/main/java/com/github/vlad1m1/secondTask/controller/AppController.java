package com.github.vlad1m1.secondTask.controller;

import com.github.vlad1m1.secondTask.component.DependencyInjectionExample;
import com.github.vlad1m1.secondTask.properties.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    private DependencyInjectionExample dependencyInjectionExample;
    private AppProperties appProperties;

    @Autowired
    public AppController(DependencyInjectionExample dependencyInjectionExample, AppProperties appProperties) {
        this.dependencyInjectionExample = dependencyInjectionExample;
        this.appProperties = appProperties;
    }

    @GetMapping("/app")
    public String app() {
        String injections = dependencyInjectionExample.demonstrateInject();
        String appProps = appProperties.toString();

        return String.format(
                "Dependency Injection: %s<br>App properties: %s",
                injections,
                appProps
        );
    }
}
