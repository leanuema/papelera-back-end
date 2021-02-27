package com.papelera.papeleraproject.product.serviceimpl.model;

import com.papelera.papeleraproject.product.model.PaperProductModel;
import com.papelera.papeleraproject.product.repository.PaperProductRepository;
import com.papelera.papeleraproject.product.service.model.PaperProductModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class PaperProductModelServiceImpl implements PaperProductModelService {

    private final Logger logger = Logger.getLogger(PaperProductModelServiceImpl.class.getName());

    @Autowired
    private PaperProductRepository paperProductRepository;

    @Override
    public List<PaperProductModel> getAllProduct() throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return paperProductRepository.findAll();
    }

    @Override
    public PaperProductModel findByProductId(Long productId) throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return paperProductRepository.findById(productId).orElse(null);
    }

    @Override
    public List<PaperProductModel> getStockAvailableProducts(Integer statusId) throws Exception {
        logger.log(Level.INFO, "searching data by status id from data base.");
        return paperProductRepository.findProductByStatusId(statusId);
    }

    @Override
    public PaperProductModel modifyProduct(PaperProductModel paperProductModel) throws Exception {
        logger.log(Level.INFO, "modifying data to data base.");
        return paperProductRepository.save(paperProductModel);
    }

    @Override
    public void createProduct(PaperProductModel paperProductModel) throws Exception {
        logger.log(Level.INFO, "creating product");
        if (paperProductRepository.existsById(paperProductModel.getProductId())) {
            logger.log(Level.SEVERE, "cannot create product, there is a product with the same id: " +
                    paperProductModel.getProductId());
        } else {
            logger.log(Level.INFO, "product created");
            paperProductRepository.save(paperProductModel);
        }
    }

    @Override
    public List<PaperProductModel> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        logger.log(Level.INFO, "searching product from data base by id.");
        return paperProductRepository.findProductByFeaturedStatusId(featuredId);
    }
}
