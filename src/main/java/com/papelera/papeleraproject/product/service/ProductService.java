package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.ProductDTO;
import org.springframework.data.domain.ExampleMatcher;

import java.util.List;

public interface ProductService {

    List<ProductDTO> getAllProducts() throws Exception;
    ProductDTO findByProductId(Long productId) throws Exception;
    List<ProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;
    void modifyProduct(ProductDTO productDTO) throws Exception;
    void createProduct(ProductDTO productDTO) throws Exception;
    List<ProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
    List<ProductDTO> searchProduct(ProductDTO productDTO, ExampleMatcher exampleMatcher) throws Exception;
    List<ProductDTO> getAllAluminumProduct() throws Exception;
    List<ProductDTO> getAllCardboardProduct() throws Exception;
    List<ProductDTO> getAllOtherProduct() throws Exception;
    List<ProductDTO> getAllPaperProduct() throws Exception;
    List<ProductDTO> getAllPlasticProduct() throws Exception;
    void changeStatusProduct(Long productId, Integer productStatusId) throws Exception;

}
