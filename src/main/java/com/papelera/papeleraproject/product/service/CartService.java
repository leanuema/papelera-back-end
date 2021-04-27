package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.ProductCart;

import java.util.List;

public interface CartService {

    List<ProductCart> retrieveAllProductsInCart() throws Exception;
    void deleteCart();
    void createCart();
    void addProductToCart(Long id, String productName) throws Exception;
    Double calculateTotalPrice();
    void removeProduct(Long id);
}
