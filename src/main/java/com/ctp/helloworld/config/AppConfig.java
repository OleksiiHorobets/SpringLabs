package com.ctp.helloworld.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Slf4j
public class AppConfig {
    @Bean
    @Order(1)
    public CommandLineRunner first() {
        return args -> log.info("-------first");
    }

    @Bean
    @Order(2)
    public CommandLineRunner second() {
        return args -> log.info("-------second");
    }
}
