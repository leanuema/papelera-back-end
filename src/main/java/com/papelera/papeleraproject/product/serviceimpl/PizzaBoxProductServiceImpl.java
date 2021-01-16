package com.papelera.papeleraproject.product.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.papelera.papeleraproject.product.dto.PizzaBoxProductDTO;
import com.papelera.papeleraproject.product.mapper.PizzaBoxProductMapper;
import com.papelera.papeleraproject.product.service.PizzaBoxProductModelService;
import com.papelera.papeleraproject.product.service.PizzaBoxProductService;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class PizzaBoxProductServiceImpl implements PizzaBoxProductService {

    private final Logger logger = Logger.getLogger(PizzaBoxProductServiceImpl.class.getName());

    @Autowired
    private PizzaBoxProductModelService pizzaBoxProductModelService;
    @Autowired
    private PizzaBoxProductMapper pizzaBoxProductMapper;

    @Override
    public List<PizzaBoxProductDTO> getAllPizzaProduct() throws Exception {
        logger.log(Level.INFO, "Find all pizza box product");
        return pizzaBoxProductModelService.getAllPizzaProduct().stream().map(pizzaBoxProductModel ->
                pizzaBoxProductMapper.toDTO(pizzaBoxProductModel)).collect(Collectors.toList());
    }

}