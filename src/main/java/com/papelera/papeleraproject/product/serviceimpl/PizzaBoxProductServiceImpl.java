package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.product.model.PizzaBoxProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.papelera.papeleraproject.configuration.enumerator.ProductStatusEnum;
import com.papelera.papeleraproject.product.dto.PizzaBoxProductDTO;
import com.papelera.papeleraproject.product.mapper.PizzaBoxProductMapper;
import com.papelera.papeleraproject.product.service.PizzaBoxProductModelService;
import com.papelera.papeleraproject.product.service.PizzaBoxProductService;

import javax.transaction.Transactional;
import java.util.ArrayList;
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

    @Override
    public List<PizzaBoxProductDTO> getStockAvailableProducts(Integer statusId) throws Exception {
        List<PizzaBoxProductDTO> pizzaBoxProductDTOList;
        logger.log(Level.INFO, "Searching products by status");
        try {
            pizzaBoxProductDTOList = pizzaBoxProductModelService.getProductByStatusId(statusId)
                    .stream().map(pizzaBoxProductModel -> pizzaBoxProductMapper
                            .toDTO(pizzaBoxProductModel)).collect(Collectors.toList());
            for (PizzaBoxProductDTO pizzaBoxProductDTO : pizzaBoxProductDTOList) {
                if (pizzaBoxProductDTO.getProductStatusId() != null
                        && !pizzaBoxProductDTO.getProductStatusId().equals(ProductStatusEnum.STOCK_UNAVAILABLE.getId())
                && !pizzaBoxProductDTO.getProductStatusId().equals(ProductStatusEnum.STOCK_AVAILABLE.getId())) {
                    pizzaBoxProductDTOList = new ArrayList<>();
                    logger.log(Level.SEVERE, "There is not stock type available for the product");
                }
            }
        } catch (Exception e) {
            throw new Exception("Could not retrieve value from database " + e);
        }
        return pizzaBoxProductDTOList;
    }

    @Transactional
    @Override
    public PizzaBoxProductDTO modifyProduct(PizzaBoxProductDTO pizzaBoxProductDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to save product");
        PizzaBoxProductModel pizzaBoxProductModel = pizzaBoxProductModelService
                .modifyProduct(pizzaBoxProductMapper.toModel(pizzaBoxProductDTO));
        return pizzaBoxProductMapper.toDTO(pizzaBoxProductModel);
    }

    @Override
    public void deleteProduct(Long pizzaBoxProductId) throws Exception {
        logger.log(Level.INFO, "begin of method to delete product");
        pizzaBoxProductModelService.deleteProduct(pizzaBoxProductId);
    }

    @Override
    public void createProduct(PizzaBoxProductDTO pizzaBoxProductDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to create product");
        pizzaBoxProductModelService.createProduct(pizzaBoxProductMapper.toModel(pizzaBoxProductDTO));
    }

}