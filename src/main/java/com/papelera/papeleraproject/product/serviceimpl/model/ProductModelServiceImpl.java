package com.papelera.papeleraproject.product.serviceimpl.model;

import com.papelera.papeleraproject.product.model.ProductModel;
import com.papelera.papeleraproject.product.repository.ProductRepository;
import com.papelera.papeleraproject.product.service.model.ProductModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ProductModelServiceImpl implements ProductModelService {

    private final Logger logger = Logger.getLogger(ProductModelServiceImpl.class.getName());
    private final ProductRepository productRepository;

    @Autowired
    public ProductModelServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductModel> getAllProduct() {
        logger.log(Level.INFO, "searching all products from data base.");
        return productRepository.findAll();
    }

    @Override
    public ProductModel findByProductId(Long productId) {
        logger.log(Level.INFO, "searching all products from data base.");
        return productRepository.findById(productId).orElse(null);
    }

    @Override
    public List<ProductModel> getStockAvailableProducts(Integer statusId) {
        logger.log(Level.INFO, "searching data by status id from data base.");
        return productRepository.findProductByStatusId(statusId);
    }

    @Override
    public void modifyProduct(ProductModel productModel) {
        logger.log(Level.INFO, "modifying data to data base.");
        productRepository.save(productModel);
    }

    @Override
    public void createProduct(ProductModel productModel) {
        logger.log(Level.INFO, "creating product");
        if (productRepository.existsById(productModel.getProductId())) {
            logger.log(Level.SEVERE, "cannot create product, there is a product with the same id: " +
                    productModel.getProductId());
        } else {
            logger.log(Level.INFO, "product created");
            productRepository.save(productModel);
        }
    }

    @Override
    public List<ProductModel> findProductByFeaturedStatusId(Long featuredId) {
        logger.log(Level.INFO, "searching product from data base by id.");
        return productRepository.findProductByFeaturedStatusId(featuredId);
    }

    @Override
    public List<ProductModel> searchProduct(String productName) throws Exception {
        logger.log(Level.INFO, "searching product from data base: " + productName);
        return productRepository.findProductByProductName(productName);
    }

    @Override
    public List<ProductModel> getAllAluminumProduct() {
        logger.log(Level.INFO, "searching all products from data base.");
        return productRepository.findAllAluminumByCategoryId();
    }

    @Override
    public List<ProductModel> getAllCardboardProduct() {
        logger.log(Level.INFO, "searching all products from data base.");
        return productRepository.findAllCardboardByCategoryId();
    }

    @Override
    public List<ProductModel> getAllOtherProduct() {
        logger.log(Level.INFO, "searching all products from data base.");
        return productRepository.findAllOtherByCategoryId();
    }

    @Override
    public List<ProductModel> getAllPaperProduct() {
        logger.log(Level.INFO, "searching all products from data base.");
        return productRepository.findAllPaperByCategoryId();
    }

    @Override
    public List<ProductModel> getAllPlasticProduct() {
        logger.log(Level.INFO, "searching all products from data base.");
        return productRepository.findAllPlasticByCategoryId();
    }

    @Override
    public void changeStatusProduct(Long productId, Integer productStatusId) {
        logger.log(Level.INFO, "changing status from product " + productId);
        productRepository.findById(productId).ifPresent(productModel ->
                productModel.setProductStatusId(productStatusId));

    }
}
