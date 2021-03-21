package com.papelera.papeleraproject.product.service.model;

import com.papelera.papeleraproject.product.model.CardboardProductModel;

import java.util.List;
import java.util.Optional;

public interface CardboardProductModelService {

    List<CardboardProductModel> getAllCardboardProduct() throws Exception;

    CardboardProductModel findByProductId(Long productId) throws Exception;

    List<CardboardProductModel> getProductByStatusId(Integer statusId) throws Exception;

    CardboardProductModel modifyProduct(CardboardProductModel cardboardProductModel) throws Exception;

    void createProduct(CardboardProductModel cardboardProductModel) throws Exception;

    List<CardboardProductModel> findProductByFeaturedStatusId(Long featuredId) throws Exception;

}