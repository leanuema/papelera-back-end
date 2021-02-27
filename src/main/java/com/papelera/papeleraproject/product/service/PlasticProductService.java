package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.PlasticProductDTO;

import java.util.List;

public interface PlasticProductService {

    List<PlasticProductDTO> getAllCardboardProduct() throws Exception;

    PlasticProductDTO findByProductId(Long productId) throws Exception;

    List<PlasticProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;

    PlasticProductDTO modifyProduct(PlasticProductDTO plasticProductModel) throws Exception;

    void createProduct(PlasticProductDTO plasticProductModel) throws Exception;

    List<PlasticProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
}
