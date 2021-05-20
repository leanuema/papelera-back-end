package com.papelera.papeleraproject.product.serviceimpl.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import com.papelera.papeleraproject.product.model.CardboardProductModel;
import com.papelera.papeleraproject.product.repository.CardboardProductRepository;
import com.papelera.papeleraproject.product.service.model.CardboardProductModelService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class CardboardProductModelServiceImpl implements CardboardProductModelService {

    private final Logger logger = Logger.getLogger(CardboardProductModelServiceImpl.class.getName());

    @Autowired
    private CardboardProductRepository cardboardProductRepository;

    @Override
    public List<CardboardProductModel> getAllCardboardProduct() throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return cardboardProductRepository.findAll();
    }

    @Override
    public CardboardProductModel findByProductId(Long productId) throws Exception {
        logger.log(Level.INFO, "searching product from data base by id.");
        return cardboardProductRepository.findById(productId).orElse(null);
    }

    @Override
    public List<CardboardProductModel> getProductByStatusId(Integer statusId) throws Exception {
        logger.log(Level.INFO, "searching data by status id from data base.");
        return cardboardProductRepository.findProductByStatusId(statusId);
    }

    @Transactional
    @Override
    public void modifyProduct(CardboardProductModel cardboardProductModel) throws Exception {
        logger.log(Level.INFO, "modifying data to data base.");
        cardboardProductRepository.save(cardboardProductModel);
    }

    @Transactional
    @Override
    public void createProduct(CardboardProductModel cardboardProductModel, Long productId) throws Exception {
        logger.log(Level.INFO, "creating product");
        if (cardboardProductRepository.existsById(productId)) {
            logger.log(Level.SEVERE, "cannot create product, there is a product with the same id: " +
                    cardboardProductModel.getProductId());
        } else {
            logger.log(Level.INFO, "product created");
            cardboardProductRepository.save(cardboardProductModel);
        }
    }

    @Override
    public List<CardboardProductModel> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        logger.log(Level.INFO, "searching product from data base by feature id.");
        return cardboardProductRepository.findProductByFeaturedStatusId(featuredId);
    }

    @Override
    public List<CardboardProductModel> findByIdAndName(Long id, String productName) throws Exception {
        logger.log(Level.INFO, "searching product from data base by id and name.");
        return cardboardProductRepository.findByIdAndName(id, productName);
    }

    @Override
    public List<CardboardProductModel> searchProduct(Example<CardboardProductModel> example) throws Exception {
        logger.log(Level.INFO, "Searching product: " + example);
        return cardboardProductRepository.findAll(example);
    }

}