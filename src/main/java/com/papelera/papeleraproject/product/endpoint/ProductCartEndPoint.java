package com.papelera.papeleraproject.product.endpoint;

import com.papelera.papeleraproject.product.dto.ProductInCartDTO;

import java.util.List;

public interface ProductCartEndPoint {

    String BASE_URL = "/product-cart";
    String GET_ALL_PRODUCT = "/get-all-product";
    String RETRIEVE_ALL_FEATURED_PRODUCT = "/retrieve-all-featured-product";
    String RETRIEVE_BY_ID_AND_NAME = "/retrieve-by-id-and-name";

    List<ProductInCartDTO> getAllProduct() throws Exception;
    List<ProductInCartDTO> retrieveAllFeaturedProduct(Long id) throws Exception;
    List<ProductInCartDTO> retrieveByIdAndName(Long id, String productName) throws Exception;
}
