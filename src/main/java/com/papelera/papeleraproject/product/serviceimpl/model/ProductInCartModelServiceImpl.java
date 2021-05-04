package com.papelera.papeleraproject.product.serviceimpl.model;

import com.papelera.papeleraproject.product.model.ProductInCartModel;
import com.papelera.papeleraproject.product.repository.ProductInCartRepository;
import com.papelera.papeleraproject.product.service.model.ProductInCartServiceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ProductInCartModelServiceImpl implements ProductInCartServiceModel {

    private final Logger logger = Logger.getLogger(ProductInCartModelServiceImpl.class.getName());

    @Autowired
    private ProductInCartRepository productInCartRepository;

    @Override
    public List<ProductInCartModel> retrieveAllProductsInCart(Long userId) throws Exception {
        logger.log(Level.INFO, "search products selected with user id: " + userId);
        return productInCartRepository.findProductByUserId(userId);
    }

    @Override
    public void deleteCart() {

    }

    @Override
    public void createCart() {

    }

    @Override
    public void addProductToCart(Long id, String productName) throws Exception {

    }

    @Override
    public Double calculateTotalPrice() {
        return null;
    }

    @Override
    public void removeProduct(Long id) {

    }
}