package com.papelera.papeleraproject.product.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ProductRestService {

    @Autowired
    private RestTemplate restClient;


}
