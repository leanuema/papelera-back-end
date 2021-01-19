package com.papelera.papeleraproject.product.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.papelera.papeleraproject.product.model.PizzaBoxProductModel;
import com.papelera.papeleraproject.product.repository.PizzaBoxProductRepository;
import com.papelera.papeleraproject.product.service.PizzaBoxProductModelService;

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
        logger.log(Level.INFO, "searching data from data base.");
        return pizzaBoxProductRepository.findAllPizzaProduct();
    }

}