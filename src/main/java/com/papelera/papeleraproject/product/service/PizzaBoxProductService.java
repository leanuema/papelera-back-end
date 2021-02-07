package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.PizzaBoxProductDTO;

import java.util.List;

public interface PizzaBoxProductService {

    List<PizzaBoxProductDTO> getAllPizzaProduct() throws Exception;

    List<PizzaBoxProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;

    PizzaBoxProductDTO modifyProduct(PizzaBoxProductDTO pizzaBoxProductDTO) throws Exception;

    void deleteProduct(Long pizzaBoxProductId) throws Exception;

    void createProduct(PizzaBoxProductDTO pizzaBoxProductDTO) throws Exception;

}
