package com.papelera.papeleraproject.product.serviceimpl.model;

import com.papelera.papeleraproject.product.model.PlasticProductModel;
import com.papelera.papeleraproject.product.repository.PlasticProductRepository;
import com.papelera.papeleraproject.product.service.model.PlasticProductModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class PlasticProductModelServiceImpl implements PlasticProductModelService {

    private final Logger logger = Logger.getLogger(PlasticProductModelServiceImpl.class.getName());

    @Autowired
    private PlasticProductRepository plasticProductRepository;

    @Override
    public List<PlasticProductModel> getAllProduct() throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return plasticProductRepository.findAll();
    }

    @Override
    public PlasticProductModel findByProductId(Long productId) throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return plasticProductRepository.findById(productId).orElse(null);
    }

    @Override
    public List<PlasticProductModel> getStockAvailableProducts(Integer statusId) throws Exception {
        logger.log(Level.INFO, "searching data by status id from data base.");
        return plasticProductRepository.findProductByStatusId(statusId);
    }

    @Override
    public PlasticProductModel modifyProduct(PlasticProductModel plasticProductModel) throws Exception {
        logger.log(Level.INFO, "modifying data to data base.");
        return plasticProductRepository.save(plasticProductModel);
    }

    @Override
    public void createProduct(PlasticProductModel plasticProductModel) throws Exception {
        logger.log(Level.INFO, "creating product");
        if (plasticProductRepository.existsById(plasticProductModel.getProductId())) {
            logger.log(Level.SEVERE, "cannot create product, there is a product with the same id: " +
                    plasticProductModel.getProductId());
        } else {
            logger.log(Level.INFO, "product created");
            plasticProductRepository.save(plasticProductModel);
        }
    }

    @Override
    public List<PlasticProductModel> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        logger.log(Level.INFO, "searching product from data base by id.");
        return plasticProductRepository.findProductByFeaturedStatusId(featuredId);
    }
}
