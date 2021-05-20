package com.papelera.papeleraproject.product.serviceimpl.model;

import com.papelera.papeleraproject.product.model.OtherProductModel;
import com.papelera.papeleraproject.product.repository.OtherProductRepository;
import com.papelera.papeleraproject.product.service.model.OtherProductModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class OtherProductModelServiceImpl implements OtherProductModelService {

    private final Logger logger = Logger.getLogger(OtherProductModelServiceImpl.class.getName());

    @Autowired
    private OtherProductRepository otherProductRepository;

    @Override
    public List<OtherProductModel> getAllProduct() throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return otherProductRepository.findAll();
    }

    @Override
    public OtherProductModel findByProductId(Long productId) throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return otherProductRepository.findById(productId).orElse(null);
    }

    @Override
    public List<OtherProductModel> getStockAvailableProducts(Integer statusId) throws Exception {
        logger.log(Level.INFO, "searching data by status id from data base.");
        return otherProductRepository.findProductByStatusId(statusId);
    }

    @Transactional
    @Override
    public OtherProductModel modifyProduct(OtherProductModel otherProductModel) throws Exception {
        logger.log(Level.INFO, "modifying data to data base.");
        return otherProductRepository.save(otherProductModel);
    }

    @Transactional
    @Override
    public void createProduct(OtherProductModel otherProductModel) throws Exception {
        logger.log(Level.INFO, "creating product");
        if (otherProductRepository.existsById(otherProductModel.getProductId())){
            logger.log(Level.SEVERE, "cannot create product, there is a product with the same id: " +
                    otherProductModel.getProductId());
        } else {
            logger.log(Level.INFO, "product created");
            otherProductRepository.save(otherProductModel);
        }
    }

    @Override
    public List<OtherProductModel> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        logger.log(Level.INFO, "searching product from data base by id.");
        return otherProductRepository.findProductByFeaturedStatusId(featuredId);
    }

    @Override
    public List<OtherProductModel> searchProduct(Example<OtherProductModel> example) throws Exception {
        logger.log(Level.INFO, "searching product: " + example);
        return otherProductRepository.findAll(example);
    }
}
