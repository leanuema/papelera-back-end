package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.AluminumProductDTO;
import org.springframework.data.domain.ExampleMatcher;

import java.util.List;

public interface AluminumProductService {

    List<AluminumProductDTO> getAllProducts() throws Exception;
    AluminumProductDTO findByProductId(Long productId) throws Exception;
    List<AluminumProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;
    void modifyProduct(AluminumProductDTO aluminumProductDTO) throws Exception;
    void createProduct(AluminumProductDTO aluminumProductDTO) throws Exception;
    List<AluminumProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
    List<AluminumProductDTO> searchProduct(AluminumProductDTO aluminumProductDTO, ExampleMatcher exampleMatcher) throws Exception;

}
