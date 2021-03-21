package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.PlasticProductDTO;
import com.papelera.papeleraproject.product.model.PlasticProductModel;

import java.util.List;

public interface PlasticProductService {

    List<PlasticProductDTO> getAllPlasticProduct() throws Exception;

    PlasticProductDTO findByProductId(Long productId) throws Exception;

    List<PlasticProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;

    PlasticProductModel modifyProduct(PlasticProductDTO plasticProductModel) throws Exception;

    void createProduct(PlasticProductDTO plasticProductModel) throws Exception;

    List<PlasticProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
}
