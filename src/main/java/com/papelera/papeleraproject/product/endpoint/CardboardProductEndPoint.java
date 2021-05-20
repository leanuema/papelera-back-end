package com.papelera.papeleraproject.product.endpoint;

import com.papelera.papeleraproject.product.dto.CardboardProductDTO;
import com.papelera.papeleraproject.product.model.CardboardProductModel;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import java.util.List;

public interface CardboardProductEndPoint {

    String BASE_URL = "/cardboard-product";
    String GET_ALL_CARDBOARD_PRODUCT = "/get-all-cardboard-product";
    String GET_CARDBOARD_PRODUCT_BY_ID = "/get-cardboard-product-by-id";
    String GET_PRODUCT_BY_STATUS = "/get-product-by-status";
    String MODIFY_PRODUCT = "/modify-product";
    String CREATING_PRODUCT = "/create-product";
    String GET_CARDBOARD_PRODUCT_BY_FEATURED_STATUS = "/find_by_featured_status";
    String SEARCH_PRODUCT = "/search-product";

    List<CardboardProductDTO> getAllCardboardProduct() throws Exception;
    List<CardboardProductDTO> getProductByStatusId(Integer statusId) throws Exception;
    void modifyProduct(CardboardProductDTO cardboardProductDTO) throws Exception;
    void createProduct(CardboardProductDTO cardboardProductDTO, Long productId) throws Exception;
    CardboardProductDTO findByProductId(Long productId) throws Exception;
    List<CardboardProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
    List<CardboardProductDTO> searchProduct(CardboardProductDTO cardboardProductDTO, ExampleMatcher exampleMatcher) throws Exception;
}