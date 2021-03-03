package com.papelera.papeleraproject.product.serviceimpl.model;

import com.papelera.papeleraproject.product.model.AluminumProductModel;
import com.papelera.papeleraproject.product.repository.AluminumProductRepository;
import com.papelera.papeleraproject.product.service.model.AluminumProductModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class AluminumProductModelServiceImpl implements AluminumProductModelService {

    private final Logger logger = Logger.getLogger(AluminumProductModelServiceImpl.class.getName());

    @Autowired
    private AluminumProductRepository aluminumProductRepository;

    @Override
    public List<AluminumProductModel> getAllProduct() throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return aluminumProductRepository.findAll();
    }

    @Override
    public AluminumProductModel findByProductId(Long productId) throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return aluminumProductRepository.findById(productId).orElse(null);
    }

    @Override
    public List<AluminumProductModel> getStockAvailableProducts(Integer statusId) throws Exception {
        logger.log(Level.INFO, "searching data by status id from data base.");
        return aluminumProductRepository.findProductByStatusId(statusId);
    }

    @Override
    public AluminumProductModel modifyProduct(AluminumProductModel aluminumProductModel) throws Exception {
        logger.log(Level.INFO, "modifying data to data base.");
        return aluminumProductRepository.save(aluminumProductModel);
    }

    @Override
    public void createProduct(AluminumProductModel aluminumProductModel) throws Exception {
        logger.log(Level.INFO, "creating product");
        if (aluminumProductRepository.existsById(aluminumProductModel.getProductId())) {
            logger.log(Level.SEVERE, "cannot create product, there is a product with the same id: " +
                    aluminumProductModel.getProductId());
        } else {
            logger.log(Level.INFO, "product created");
            aluminumProductRepository.save(aluminumProductModel);
        }
    }

    @Override
    public List<AluminumProductModel> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        logger.log(Level.INFO, "searching product from data base by id.");
        return aluminumProductRepository.findProductByFeaturedStatusId(featuredId);
    }
}
