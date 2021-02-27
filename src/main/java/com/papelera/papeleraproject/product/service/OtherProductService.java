package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.OtherProductDTO;

import java.util.List;

public interface OtherProductService {

    List<OtherProductDTO> getAllCardboardProduct() throws Exception;

    OtherProductDTO findByProductId(Long productId) throws Exception;

    List<OtherProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;

    OtherProductDTO modifyProduct(OtherProductDTO otherProductModel) throws Exception;

    void createProduct(OtherProductDTO otherProductModel) throws Exception;

    List<OtherProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
}
