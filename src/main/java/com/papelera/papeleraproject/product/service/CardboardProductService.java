package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.CardboardProductDTO;
import com.papelera.papeleraproject.product.model.CardboardProductModel;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import java.util.List;

public interface CardboardProductService {

    List<CardboardProductDTO> getAllCardboardProduct() throws Exception;
    CardboardProductDTO findByProductId(Long productId) throws Exception;
    List<CardboardProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;
    void modifyProduct(CardboardProductDTO cardboardProductDTO) throws Exception;
    void createProduct(CardboardProductDTO cardboardProductDTO, Long productId) throws Exception;
    List<CardboardProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
    List<CardboardProductDTO> findByIdAndName(Long id, String productName) throws Exception;
    List<CardboardProductDTO> searchProduct(CardboardProductDTO cardboardProductDTO, ExampleMatcher exampleMatcher) throws Exception;

}
