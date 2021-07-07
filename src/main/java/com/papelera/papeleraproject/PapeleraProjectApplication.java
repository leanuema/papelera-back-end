package com.papelera.papeleraproject;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PapeleraProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PapeleraProjectApplication.class, args);
    }

    @Bean
    public DozerBeanMapper dozerBeanMapper() {
        return new DozerBeanMapper();
    }
}
