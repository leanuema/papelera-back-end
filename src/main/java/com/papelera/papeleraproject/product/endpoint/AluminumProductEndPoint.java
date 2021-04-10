package com.papelera.papeleraproject.product.endpoint;

import com.papelera.papeleraproject.product.dto.AluminumProductDTO;
import com.papelera.papeleraproject.product.model.AluminumProductModel;

import java.util.List;

public interface AluminumProductEndPoint {

    String BASE_URL = "/aluminum-product";
    String GET_ALL_ALUMINUM_PRODUCT = "/get-all-aluminum-product";
    String GET_ALUMINUM_PRODUCT_BY_ID = "/get-aluminum-product-by-id";
    String GET_PRODUCT_BY_STATUS = "/get-product-by-status";
    String MODIFY_PRODUCT = "/modify-product";
    String CREATING_PRODUCT = "/create-product";
    String GET_ALUMINUM_PRODUCT_BY_FEATURED_STATUS = "/find_by_featured_status";

    List<AluminumProductDTO> getAllProducts() throws Exception;
    AluminumProductDTO findByProductId(Long productId) throws Exception;
    List<AluminumProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;
    void modifyProduct(AluminumProductDTO aluminumProductDTO) throws Exception;
    void createProduct(AluminumProductDTO aluminumProductDTO) throws Exception;
    List<AluminumProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
}
