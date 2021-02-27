package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.CardboardProductDTO;

import java.util.List;

public interface CardboardProductService {

    List<CardboardProductDTO> getAllCardboardProduct() throws Exception;

    List<CardboardProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;

    CardboardProductDTO modifyProduct(CardboardProductDTO cardboardProductDTO) throws Exception;

    void createProduct(CardboardProductDTO cardboardProductDTO) throws Exception;

}
