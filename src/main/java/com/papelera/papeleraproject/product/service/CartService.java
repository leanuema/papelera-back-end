package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.Product;

import java.util.List;

public interface CartService {

    List<Product> retrieveAllProducts();
    void deleteCart();
    void createCart();
    void addProducts(Product product);
}
