package com.papelera.papeleraproject.product.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.papelera.papeleraproject.product.model.PizzaBoxProductModel;
import com.papelera.papeleraproject.product.repository.PizzaBoxProductRepository;
import com.papelera.papeleraproject.product.service.PizzaBoxProductModelService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class PizzaBoxProductModelServiceImpl implements PizzaBoxProductModelService {

    private final Logger logger = Logger.getLogger(PizzaBoxProductModelServiceImpl.class.getName());

    @Autowired
    private PizzaBoxProductRepository pizzaBoxProductRepository;

    @Override
    public List<PizzaBoxProductModel> getAllPizzaProduct() throws Exception {
        logger.log(Level.INFO, "searching all products from data base.");
        return pizzaBoxProductRepository.findAllPizzaProduct();
    }

    @Override
    public List<PizzaBoxProductModel> getProductByStatusId(Integer statusId) throws Exception {
        logger.log(Level.INFO, "searching data by status id from data base.");
        return pizzaBoxProductRepository.findProductByStatusId(statusId);
    }

    @Transactional
    @Override
    public PizzaBoxProductModel modifyProduct(PizzaBoxProductModel pizzaBoxProductModel) throws Exception {
        logger.log(Level.INFO, "modifying data to data base.");
        return pizzaBoxProductRepository.save(pizzaBoxProductModel);
    }

    @Override
    public void deleteProduct(Long pizzaBoxProductId) throws Exception {
        logger.log(Level.INFO, "deleting data from data base");
        pizzaBoxProductRepository.deleteById(pizzaBoxProductId);
    }

    @Transactional
    @Override
    public void createProduct(PizzaBoxProductModel pizzaBoxProductModel) throws Exception {
        logger.log(Level.INFO, "creating product");
        List<PizzaBoxProductModel> pizzaBoxProductModelList = pizzaBoxProductRepository.findAllPizzaProduct();
        for (PizzaBoxProductModel pizzaProduct : pizzaBoxProductModelList) {
            if (!pizzaBoxProductModel.getProductId().equals(pizzaProduct.getProductId())) {
                pizzaBoxProductRepository.save(pizzaBoxProductModel);
            } else {
                logger.log(Level.SEVERE, "cannot create product, " +
                        "there is a product with the same id: " + pizzaProduct.getProductId());
            }
        }
    }

}