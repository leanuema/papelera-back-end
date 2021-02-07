package com.papelera.papeleraproject.product.mapper;

import org.springframework.stereotype.Component;
import com.papelera.papeleraproject.product.dto.PizzaBoxProductDTO;
import com.papelera.papeleraproject.product.model.PizzaBoxProductModel;

@Component
public class PizzaBoxProductMapper {

    public PizzaBoxProductModel toModel(PizzaBoxProductDTO pizzaBoxProductDTO) {
        PizzaBoxProductModel pizzaBoxProductModel = new PizzaBoxProductModel();
        pizzaBoxProductModel.setProductId(pizzaBoxProductDTO.getProductId());
        pizzaBoxProductModel.setProductStatusId(pizzaBoxProductDTO.getProductStatusId());
        pizzaBoxProductModel.setProductUnitPrice(pizzaBoxProductDTO.getProductUnitPrice());
        pizzaBoxProductModel.setProductQuantityPrice(pizzaBoxProductDTO.getProductQuantityPrice());
        pizzaBoxProductModel.setProductName(pizzaBoxProductDTO.getProductName());
        return pizzaBoxProductModel;
    }

    public PizzaBoxProductDTO toDTO(PizzaBoxProductModel pizzaBoxProductModel) {
        PizzaBoxProductDTO pizzaBoxProductDTO = new PizzaBoxProductDTO();
        pizzaBoxProductDTO.setProductId(pizzaBoxProductModel.getProductId());
        pizzaBoxProductDTO.setProductStatusId(pizzaBoxProductModel.getProductStatusId());
        pizzaBoxProductDTO.setProductUnitPrice(pizzaBoxProductModel.getProductUnitPrice());
        pizzaBoxProductDTO.setProductQuantityPrice(pizzaBoxProductModel.getProductQuantityPrice());
        pizzaBoxProductDTO.setProductName(pizzaBoxProductModel.getProductName());
        return pizzaBoxProductDTO;
    }
}