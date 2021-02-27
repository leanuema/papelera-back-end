package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.AluminumProductDTO;
import com.papelera.papeleraproject.product.dto.CardboardProductDTO;
import com.papelera.papeleraproject.product.model.AluminumProductModel;

import java.util.List;

public interface AluminumProductService {

    List<AluminumProductDTO> getAllCardboardProduct() throws Exception;

    AluminumProductDTO findByProductId(Long productId) throws Exception;

    List<AluminumProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;

    AluminumProductModel modifyProduct(AluminumProductDTO aluminumProductDTO) throws Exception;

    void createProduct(AluminumProductDTO aluminumProductDTO) throws Exception;

    List<AluminumProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
}
