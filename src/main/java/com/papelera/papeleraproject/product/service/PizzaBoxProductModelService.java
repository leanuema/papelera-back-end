package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.model.PizzaBoxProductModel;

import java.util.List;

public interface PizzaBoxProductModelService {

    List<PizzaBoxProductModel> getAllPizzaProduct() throws Exception;

    List<PizzaBoxProductModel> getProductByStatusId(Integer statusId) throws Exception;

    PizzaBoxProductModel modifyProduct(PizzaBoxProductModel pizzaBoxProductModel) throws Exception;

    void deleteProduct(Long pizzaBoxProductId) throws Exception;

    void createProduct(PizzaBoxProductModel pizzaBoxProductModel) throws Exception;

}