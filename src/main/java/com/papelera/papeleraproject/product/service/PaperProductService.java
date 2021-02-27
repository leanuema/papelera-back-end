package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.model.PaperProductDTO;

import java.util.List;

public interface PaperProductService {

    List<com.papelera.papeleraproject.product.dto.PaperProductDTO> getAllCardboardProduct() throws Exception;

    com.papelera.papeleraproject.product.dto.PaperProductDTO findByProductId(Long productId) throws Exception;

    List<com.papelera.papeleraproject.product.dto.PaperProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;

    PaperProductDTO modifyProduct(PaperProductDTO paperProductDTO) throws Exception;

    void createProduct(PaperProductDTO paperProductDTO) throws Exception;

    List<PaperProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
}
