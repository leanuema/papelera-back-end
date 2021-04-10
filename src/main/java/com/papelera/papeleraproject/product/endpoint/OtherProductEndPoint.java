package com.papelera.papeleraproject.product.endpoint;

import com.papelera.papeleraproject.product.dto.OtherProductDTO;
import com.papelera.papeleraproject.product.model.OtherProductModel;

import java.util.List;

public interface OtherProductEndPoint {

    String BASE_URL = "/other-product";
    String GET_ALL_OTHER_PRODUCT = "/get-all-other-product";
    String GET_OTHER_PRODUCT_BY_ID = "/get-other-product-by-id";
    String GET_PRODUCT_BY_STATUS = "/get-product-by-status";
    String MODIFY_PRODUCT = "/modify-product";
    String CREATING_PRODUCT = "/create-product";
    String GET_OTHER_PRODUCT_BY_FEATURED_STATUS = "/find_by_featured_status";

    List<OtherProductDTO> getAllOtherProduct() throws Exception;
    OtherProductDTO findByProductId(Long productId) throws Exception;
    List<OtherProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;
    void modifyProduct(OtherProductDTO otherProductDTO) throws Exception;
    void createProduct(OtherProductDTO otherProductDTO) throws Exception;
    List<OtherProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
}
