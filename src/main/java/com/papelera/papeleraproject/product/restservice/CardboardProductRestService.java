package com.papelera.papeleraproject.product.restservice;

import com.papelera.papeleraproject.product.endpoint.CardboardProductEndPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
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
        return (List<CardboardProductDTO>) restClient.getForObject(
                CardboardProductEndPoint.GET_ALL_CARDBOARD_PRODUCT, CardboardProductDTO.class, HttpMethod.GET);
    }

    @Override
    public List<CardboardProductDTO> getProductByStatusId(Integer statusId) throws Exception {
        return (List<CardboardProductDTO>) restClient.getForObject(
                CardboardProductEndPoint.GET_CARDBOARD_PRODUCT_BY_ID, CardboardProductDTO.class, HttpMethod.GET);
    }

    @Override
    public void modifyProduct(CardboardProductDTO cardboardProductDTO) throws Exception {
        restClient.put(CardboardProductEndPoint.MODIFY_PRODUCT, cardboardProductDTO);
    }

    @Override
    public void createProduct(CardboardProductDTO cardboardProductDTO, Long productId) throws Exception {
    }

    @Override
    public CardboardProductDTO findByProductId(Long productId) throws Exception {
        return null;
    }

    @Override
    public List<CardboardProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        return null;
    }
}
