package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.model.PizzaBoxProductModel;

import java.util.List;

public interface PizzaBoxProductModelService {

    List<PizzaBoxProductModel> getAllPizzaProduct() throws Exception;

}