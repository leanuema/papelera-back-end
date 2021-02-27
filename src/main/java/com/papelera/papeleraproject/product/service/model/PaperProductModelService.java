package com.papelera.papeleraproject.product.service.model;

import com.papelera.papeleraproject.product.model.PaperProductDTO;

import java.util.List;

public interface PaperProductModelService {

    List<PaperProductDTO> getAllProduct() throws Exception;

    PaperProductDTO findByProductId(Long productId) throws Exception;

    List<PaperProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;

    PaperProductDTO modifyProduct(PaperProductDTO paperProductModel) throws Exception;

    void createProduct(PaperProductDTO paperProductModel) throws Exception;

    List<PaperProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
}
