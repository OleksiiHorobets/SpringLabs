package com.ctp.helloworld;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class HelloWorldApplication {

    public static void main(String[] args) {
        log.info("------------Main started");
        SpringApplication.run(HelloWorldApplication.class, args);
        log.info("------------Main ended");
    }
}
