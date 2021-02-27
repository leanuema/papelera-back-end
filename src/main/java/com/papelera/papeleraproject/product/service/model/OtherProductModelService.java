package com.papelera.papeleraproject.product.service.model;

import com.papelera.papeleraproject.product.model.OtherProductModel;

import java.util.List;

public interface OtherProductModelService {

    List<OtherProductModel> getAllProduct() throws Exception;

    OtherProductModel findByProductId(Long productId) throws Exception;

    List<OtherProductModel> getStockAvailableProducts(Integer statusId) throws Exception;

    OtherProductModel modifyProduct(OtherProductModel otherProductModel) throws Exception;

    void createProduct(OtherProductModel otherProductModel) throws Exception;

    List<OtherProductModel> findProductByFeaturedStatusId(Long featuredId) throws Exception;
}
