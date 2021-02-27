package com.papelera.papeleraproject.product.service.model;

import com.papelera.papeleraproject.product.model.PaperProductModel;

import java.util.List;

public interface PaperProductModelService {

    List<PaperProductModel> getAllProduct() throws Exception;

    PaperProductModel findByProductId(Long productId) throws Exception;

    List<PaperProductModel> getStockAvailableProducts(Integer statusId) throws Exception;

    PaperProductModel modifyProduct(PaperProductModel paperProductModel) throws Exception;

    void createProduct(PaperProductModel paperProductModel) throws Exception;

    List<PaperProductModel> findProductByFeaturedStatusId(Long featuredId) throws Exception;
}
