package com.papelera.papeleraproject.product.restservice;

import com.papelera.papeleraproject.product.endpoint.CardboardProductEndPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.papelera.papeleraproject.product.dto.CardboardProductDTO;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class CardboardProductRestService implements CardboardProductEndPoint {

    @Autowired
    private RestTemplate restClient;

    @Override
    public List<CardboardProductDTO> getAllCardboardProduct() throws Exception {
        return null;
    }

    @Override
    public List<CardboardProductDTO> getProductByStatusId(Integer statusId) throws Exception {
        return null;
    }

    @Override
    public CardboardProductDTO modifyProduct(CardboardProductDTO cardboardProductDTO) throws Exception {
        return null;
    }

    @Override
    public void createProduct(CardboardProductDTO cardboardProductDTO) throws Exception {

    }
}
