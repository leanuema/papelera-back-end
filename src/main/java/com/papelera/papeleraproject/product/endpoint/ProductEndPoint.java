package com.papelera.papeleraproject.product.endpoint;

import com.papelera.papeleraproject.product.dto.ProductDTO;
import org.springframework.data.domain.ExampleMatcher;

import java.util.List;

public interface ProductEndPoint {

    String BASE_URL = "/product";
    String GET_ALL_PRODUCT = "/get-all-product";
    String GET_PRODUCT_BY_ID = "/get-product-by-id";
    String GET_PRODUCT_BY_STATUS = "/get-product-by-status";
    String MODIFY_PRODUCT = "/modify-product";
    String CREATING_PRODUCT = "/create-product";
    String FIND_BY_FEATURED_STATUS = "/find_by_featured_status";
    String SEARCH_PRODUCT = "/search-product";
    String GET_ALL_ALUMINUM_PRODUCT = "/get-all-aluminum-product";
    String GET_ALL_CARDBOARD_PRODUCT = "/get-all-cardboard-product";
    String GET_ALL_OTHER_PRODUCT = "/get-all-other-product";
    String GET_ALL_PAPER_PRODUCT = "/get-all-paper-product";
    String GET_ALL_PLASTIC_PRODUCT = "/get-all-plastic-product";
    String CHANGE_STATUS_PRODUCT = "/change-status-product";

    List<ProductDTO> getAllProducts() throws Exception;
    ProductDTO findByProductId(Long productId) throws Exception;
    List<ProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;
    void modifyProduct(ProductDTO productDTO) throws Exception;
    void createProduct(ProductDTO productDTO) throws Exception;
    List<ProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
    List<ProductDTO> searchProduct(String productName) throws Exception;
    List<ProductDTO> getAllAluminumProduct() throws Exception;
    List<ProductDTO> getAllCardboardProduct() throws Exception;
    List<ProductDTO> getAllOtherProduct() throws Exception;
    List<ProductDTO> getAllPaperProduct() throws Exception;
    List<ProductDTO> getAllPlasticProduct() throws Exception;
    void changeStatusProduct(Long productId, Integer productStatusId) throws Exception;

}
