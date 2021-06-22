package com.papelera.papeleraproject.product.serviceimpl.model;

import com.papelera.papeleraproject.configuration.enumerator.ProductStatusEnum;
import com.papelera.papeleraproject.product.model.ProductModel;
import com.papelera.papeleraproject.product.repository.ProductRepository;
import com.papelera.papeleraproject.product.service.model.ProductModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ProductModelServiceImpl implements ProductModelService {

    private final Logger logger = Logger.getLogger(ProductModelServiceImpl.class.getName());

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductModel> getAllProduct() throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return productRepository.findAll();
    }

    @Override
    public ProductModel findByProductId(Long productId) throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return productRepository.findById(productId).orElse(null);
    }

    @Override
    public List<ProductModel> getStockAvailableProducts(Integer statusId) throws Exception {
        logger.log(Level.INFO, "searching data by status id from data base.");
        return productRepository.findProductByStatusId(statusId);
    }

    @Override
    public ProductModel modifyProduct(ProductModel productModel) throws Exception {
        logger.log(Level.INFO, "modifying data to data base.");
        return productRepository.save(productModel);
    }

    @Override
    public void createProduct(ProductModel productModel) throws Exception {
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
    public List<ProductModel> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        logger.log(Level.INFO, "searching product from data base by id.");
        return productRepository.findProductByFeaturedStatusId(featuredId);
    }

    @Override
    public List<ProductModel> searchProduct(Example<ProductModel> example) throws Exception {
        logger.log(Level.INFO, "searching product: " + example);
        return productRepository.findAll(example);
    }

    @Override
    public List<ProductModel> getAllAluminumProduct() throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return productRepository.findAllAluminumByCategoryId();
    }

    @Override
    public List<ProductModel> getAllCardboardProduct() throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return productRepository.findAllCardboardByCategoryId();
    }

    @Override
    public List<ProductModel> getAllOtherProduct() throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return productRepository.findAllOtherByCategoryId();
    }

    @Override
    public List<ProductModel> getAllPaperProduct() throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return productRepository.findAllPaperByCategoryId();
    }

    @Override
    public List<ProductModel> getAllPlasticProduct() throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return productRepository.findAllPlasticByCategoryId();
    }

    @Override
    public void changeStatusProduct(Long productId, Integer productStatusId) throws Exception {
        productRepository.findById(productId).ifPresent(productModel ->
                        productModel.setProductStatusId(productStatusId));
    }
}
