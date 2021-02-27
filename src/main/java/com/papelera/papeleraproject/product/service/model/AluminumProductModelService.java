package com.papelera.papeleraproject.product.service.model;

import com.papelera.papeleraproject.product.model.AluminumProductModel;

import java.util.List;

public interface AluminumProductModelService {

    List<AluminumProductModel> getAllProduct() throws Exception;

    AluminumProductModel findByProductId(Long productId) throws Exception;

    List<AluminumProductModel> getStockAvailableProducts(Integer statusId) throws Exception;

    AluminumProductModel modifyProduct(AluminumProductModel aluminumProductModel) throws Exception;

    void createProduct(AluminumProductModel aluminumProductModel) throws Exception;

    List<AluminumProductModel> findProductByFeaturedStatusId(Long featuredId) throws Exception;
}
