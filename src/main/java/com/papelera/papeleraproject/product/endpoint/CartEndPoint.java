package com.papelera.papeleraproject.product.endpoint;

import com.papelera.papeleraproject.product.dto.ProductCart;

import java.util.List;

public interface CartEndPoint {

    String BASE_URL = "/cart";
    String RETRIEVE_ALL_PRODUCTS = "/retrieveAllProducts";

    List<ProductCart> retrieveAllProducts() throws Exception;
}
