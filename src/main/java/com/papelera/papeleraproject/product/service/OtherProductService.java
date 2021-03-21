package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.OtherProductDTO;
import com.papelera.papeleraproject.product.model.OtherProductModel;

import java.util.List;

public interface OtherProductService {

    List<OtherProductDTO> getAllOtherProduct() throws Exception;

    OtherProductDTO findByProductId(Long productId) throws Exception;

    List<OtherProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;

    OtherProductModel modifyProduct(OtherProductDTO otherProductDTO) throws Exception;

    void createProduct(OtherProductDTO otherProductDTO) throws Exception;

    List<OtherProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
}
