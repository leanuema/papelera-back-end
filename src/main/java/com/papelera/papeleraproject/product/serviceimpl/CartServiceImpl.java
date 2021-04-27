package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.product.dto.ProductCart;
import com.papelera.papeleraproject.product.service.CartService;
import com.papelera.papeleraproject.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class CartServiceImpl implements CartService {

    private final Logger logger = Logger.getLogger(CartServiceImpl.class.getName());

    @Autowired
    private ProductService productService;

    private List<ProductCart> productCartList;

    @Override
    public List<ProductCart> retrieveAllProductsInCart() throws Exception {
        logger.log(Level.INFO, "retrieve all products");
        return null;
    }

    @Override
    public void deleteCart() {
        this.productCartList.clear();
    }

    @Override
    public void createCart() {

    }

    @Override
    public void addProductToCart(Long id, String productName) throws Exception {
        productService.retrieveByIdAndName(id, productName);
    }

    @Override
    public Double calculateTotalPrice() {
        List<ProductCart> productCartList = new ArrayList<>();
        return Double.valueOf(productCartList.stream().count());
    }

    @Override
    public void removeProduct(Long id) {

    }
}
