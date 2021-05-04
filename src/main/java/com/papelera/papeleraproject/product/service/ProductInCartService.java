package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.ProductInCartDTO;

import java.util.List;

public interface ProductInCartService {

    List<ProductInCartDTO> retrieveAllProductsInCart(Long userId) throws Exception;
    void deleteCart();
    void createCart();
    void addProductToCart(Long id, String productName) throws Exception;
    Double calculateTotalPrice();
    void removeProduct(Long id);
}
