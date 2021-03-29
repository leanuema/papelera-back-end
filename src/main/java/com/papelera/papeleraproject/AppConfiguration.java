package com.papelera.papeleraproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfiguration {

    @Bean(value = "restClient")
    public RestTemplate registerRestTemplate() {
        return new RestTemplate();
    }
}
