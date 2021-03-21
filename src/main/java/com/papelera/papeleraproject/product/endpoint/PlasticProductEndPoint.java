package com.papelera.papeleraproject.product.endpoint;

import com.papelera.papeleraproject.product.dto.PlasticProductDTO;
import com.papelera.papeleraproject.product.model.PlasticProductModel;

import java.util.List;

public interface PlasticProductEndPoint {
    String BASE_URL = "/plastic-product";
    String GET_ALL_PLASTIC_BOX_PRODUCT = "/get-all-plastic-product";
    String GET_PLASTIC_PRODUCT_BY_ID = "/get-plastic-product-by-id";
    String GET_PRODUCT_BY_STATUS = "/get-product-by-status";
    String MODIFY_PRODUCT = "/modify-product";
    String CREATING_PRODUCT = "/create-product";
    String GET_PLASTIC_PRODUCT_BY_FEATURED_STATUS = "/find_by_featured_status";

    List<PlasticProductDTO> getAllPlasticProduct() throws Exception;
    PlasticProductDTO findByProductId(Long productId) throws Exception;
    List<PlasticProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;
    PlasticProductModel modifyProduct(PlasticProductDTO plasticProductDTO) throws Exception;
    void createProduct(PlasticProductDTO plasticProductDTO) throws Exception;
    List<PlasticProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
}