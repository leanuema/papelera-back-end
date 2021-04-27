package com.papelera.papeleraproject.product.service.model;

import com.papelera.papeleraproject.product.model.CardboardProductModel;

import java.util.List;
import java.util.Optional;

public interface CardboardProductModelService {

    List<CardboardProductModel> getAllCardboardProduct() throws Exception;
    CardboardProductModel findByProductId(Long productId) throws Exception;
    List<CardboardProductModel> getProductByStatusId(Integer statusId) throws Exception;
    void modifyProduct(CardboardProductModel cardboardProductModel) throws Exception;
    void createProduct(CardboardProductModel cardboardProductModel, Long productId) throws Exception;
    List<CardboardProductModel> findProductByFeaturedStatusId(Long featuredId) throws Exception;
    List<CardboardProductModel> findByIdAndName(Long id, String productName) throws Exception;

}