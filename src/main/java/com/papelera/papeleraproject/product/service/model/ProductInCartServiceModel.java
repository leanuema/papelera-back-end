package com.papelera.papeleraproject.product.service.model;

import com.papelera.papeleraproject.product.model.ProductInCartModel;

import java.util.List;

public interface ProductInCartServiceModel {

    List<ProductInCartModel> retrieveAllProductsInCart(Long userId) throws Exception;
    void deleteCart();
    void createCart();
    void addProductToCart(Long id, String productName) throws Exception;
    Double calculateTotalPrice();
    void removeProduct(Long id);
}
