package com.papelera.papeleraproject.product.endpoint;

import com.papelera.papeleraproject.product.dto.PaperProductDTO;
import com.papelera.papeleraproject.product.model.PaperProductModel;

import java.util.List;

public interface PaperProductEndPoint {

    String BASE_URL = "/paper-product";
    String GET_ALL_PAPER_PRODUCT = "/get-all-paper-product";
    String GET_paper_PRODUCT_BY_ID = "/get-paperproduct-by-id";
    String GET_PRODUCT_BY_STATUS = "/get-product-by-status";
    String MODIFY_PRODUCT = "/modify-product";
    String CREATING_PRODUCT = "/create-product";
    String GET_PAPER_PRODUCT_BY_FEATURED_STATUS = "/find_by_featured_status";

    List<PaperProductDTO> getAllPaperProduct() throws Exception;
    PaperProductDTO findByProductId(Long productId) throws Exception;
    List<PaperProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;
    void modifyProduct(PaperProductDTO paperProductDTO) throws Exception;
    void createProduct(PaperProductDTO paperProductDTO) throws Exception;
    List<PaperProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
}
