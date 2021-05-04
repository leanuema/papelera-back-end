package com.papelera.papeleraproject.product.endpoint;

import com.papelera.papeleraproject.product.dto.ProductInCartDTO;

import java.util.List;

public interface CartEndPoint {

    String BASE_URL = "/cart";
    String RETRIEVE_ALL_PRODUCTS = "/retrieveAllProducts";

    List<ProductInCartDTO> retrieveAllProducts(Long userId) throws Exception;
}
