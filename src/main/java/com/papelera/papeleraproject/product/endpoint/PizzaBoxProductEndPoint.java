package com.papelera.papeleraproject.product.endpoint;

import com.papelera.papeleraproject.product.dto.PizzaBoxProductDTO;

import java.util.List;

public interface PizzaBoxProductEndPoint {

    String BASE = "/pizza-box-product";
    String GET_ALL_PIZZA_BOX_PRODUCT = "/get-all-pizza-box-product";

    List<PizzaBoxProductDTO> getAllPizzaProduct() throws Exception;

}