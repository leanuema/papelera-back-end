package com.papelera.papeleraproject.product.endpoint;

import com.papelera.papeleraproject.product.dto.CardboardProductDTO;

import java.util.List;

public interface CardboardProductEndPoint {

    String BASE = "/v1";
    String GET_ALL_CARDBOARD_BOX_PRODUCT = "/get-all-cardboard-product";
    String GET_PRODUCT_BY_STATUS = "/get-product-by-status";
    String MODIFY_PRODUCT = "/modify-product";
    String CREATING_PRODUCT = "/create-product";

    List<CardboardProductDTO> getAllCardboardProduct() throws Exception;
    List<CardboardProductDTO> getProductByStatusId(Integer statusId) throws Exception;
    CardboardProductDTO modifyProduct(CardboardProductDTO cardboardProductDTO) throws Exception;
    void createProduct(CardboardProductDTO cardboardProductDTO) throws Exception;

}