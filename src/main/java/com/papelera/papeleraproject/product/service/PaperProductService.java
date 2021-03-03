package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.PaperProductDTO;
import com.papelera.papeleraproject.product.model.PaperProductModel;

import java.util.List;

public interface PaperProductService {

    List<PaperProductDTO> getAllCardboardProduct() throws Exception;

    PaperProductDTO findByProductId(Long productId) throws Exception;

    List<PaperProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;

    PaperProductModel modifyProduct(PaperProductModel paperProductModel) throws Exception;

    void createProduct(PaperProductModel paperProductModel) throws Exception;

    List<PaperProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
}
