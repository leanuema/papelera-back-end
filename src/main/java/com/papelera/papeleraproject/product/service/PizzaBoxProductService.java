package com.papelera.papeleraproject.product.service;


import com.papelera.papeleraproject.product.dto.PizzaBoxProductDTO;

import java.util.List;

public interface PizzaBoxProductService {

    List<PizzaBoxProductDTO> getAllPizzaProduct() throws Exception;
}
