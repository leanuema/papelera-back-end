package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.PlasticProductDTO;
import org.springframework.data.domain.ExampleMatcher;

import java.util.List;

public interface PlasticProductService {

    List<PlasticProductDTO> getAllPlasticProduct() throws Exception;
    PlasticProductDTO findByProductId(Long productId) throws Exception;
    List<PlasticProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;
    void modifyProduct(PlasticProductDTO plasticProductModel) throws Exception;
    void createProduct(PlasticProductDTO plasticProductModel) throws Exception;
    List<PlasticProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
    List<PlasticProductDTO> searchProduct(PlasticProductDTO plasticProductDTO, ExampleMatcher exampleMatcher) throws Exception;

}
