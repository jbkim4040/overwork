package com.abacus.overwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OverworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(OverworkApplication.class, args);
    }

}
