package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.ProductCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<ProductCart> getAllProduct() throws Exception;
    List<ProductCart> retrieveAllFeaturedProduct(Long id) throws Exception;
    List<ProductCart> retrieveByIdAndName(Long id, String productName) throws Exception;
}
