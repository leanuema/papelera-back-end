package com.papelera.papeleraproject.product.service.model;

import com.papelera.papeleraproject.product.model.ProductModel;
import org.springframework.data.domain.Example;

import java.util.List;

public interface ProductModelService {

    List<ProductModel> getAllProduct() throws Exception;
    ProductModel findByProductId(Long productId) throws Exception;
    List<ProductModel> getStockAvailableProducts(Integer statusId) throws Exception;
    ProductModel modifyProduct(ProductModel productModel) throws Exception;
    void createProduct(ProductModel productModel) throws Exception;
    List<ProductModel> findProductByFeaturedStatusId(Long featuredId) throws Exception;
    List<ProductModel> searchProduct(Example<ProductModel> example) throws Exception;
    List<ProductModel> getAllAluminumProduct() throws Exception;
    List<ProductModel> getAllCardboardProduct() throws Exception;
    List<ProductModel> getAllOtherProduct() throws Exception;
    List<ProductModel> getAllPaperProduct() throws Exception;
    List<ProductModel> getAllPlasticProduct() throws Exception;
    void changeStatusProduct(Long productId, Integer productStatusId) throws Exception;
}
