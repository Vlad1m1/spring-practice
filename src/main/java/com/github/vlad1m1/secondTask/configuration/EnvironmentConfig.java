package com.github.vlad1m1.secondTask.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

public class EnvironmentConfig {
    @Bean
    @Profile("dev")
    public String devEnv() {
        System.out.println("Загружена development конфигурация.");
        return "Development mode";
    }

    @Bean
    @Profile("prod")
    public String prodEnv() {
        System.out.println("Загружена production конфигурация");
        return "Production mode";
    }
}
