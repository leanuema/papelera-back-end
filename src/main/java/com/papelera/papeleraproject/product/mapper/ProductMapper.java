package com.papelera.papeleraproject.product.mapper;

import com.papelera.papeleraproject.product.dto.ProductDTO;
import com.papelera.papeleraproject.product.model.ProductModel;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductModel toModel(ProductDTO productDTO) {
        ProductModel productModel = new ProductModel();
        productModel.setProductId(productDTO.getProductId());
        productModel.setProductName(productDTO.getProductName());
        productModel.setProductUnitPrice(productDTO.getProductUnitPrice());
        productModel.setProductStatusId(productDTO.getProductStatusId());
        productModel.setProductQuantityPrice(productDTO.getProductQuantityPrice());
        productModel.setFeaturedStatusId(productDTO.getFeaturedStatusId());
        productModel.setCategoryId(productDTO.getCategoryId());
        return productModel;
    }

    public ProductDTO toDTO(ProductModel productModel) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductId(productModel.getProductId());
        productDTO.setProductName(productModel.getProductName());
        productDTO.setProductStatusId(productModel.getProductStatusId());
        productDTO.setProductUnitPrice(productModel.getProductUnitPrice());
        productDTO.setProductQuantityPrice(productModel.getProductQuantityPrice());
        productDTO.setFeaturedStatusId(productModel.getFeaturedStatusId());
        productDTO.setCategoryId(productModel.getCategoryId());
        return productDTO;
    }
}
