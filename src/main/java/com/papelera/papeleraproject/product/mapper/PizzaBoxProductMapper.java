package com.papelera.papeleraproject.product.mapper;

import org.springframework.stereotype.Component;
import com.papelera.papeleraproject.product.dto.PizzaBoxProductDTO;
import com.papelera.papeleraproject.product.model.PizzaBoxProductModel;

@Component
public class PizzaBoxProductMapper {

    public PizzaBoxProductModel toModel(PizzaBoxProductDTO pizzaBoxProductDTO) {
        PizzaBoxProductModel pizzaBoxProductModel = new PizzaBoxProductModel();
        pizzaBoxProductModel.setProductId(pizzaBoxProductDTO.getProductId());
        pizzaBoxProductModel.setProductBto(pizzaBoxProductDTO.getProductBto());
        pizzaBoxProductModel.setProductPrice(pizzaBoxProductDTO.getProductPrice());
        pizzaBoxProductModel.setProductUnityMeasurement(pizzaBoxProductDTO.getProductUnity());
        pizzaBoxProductModel.setProductDescription(pizzaBoxProductDTO.getProductDescription());
        return pizzaBoxProductModel;
    }

    public PizzaBoxProductDTO toDTO(PizzaBoxProductModel pizzaBoxProductModel) {
        PizzaBoxProductDTO pizzaBoxProductDTO = new PizzaBoxProductDTO();
        pizzaBoxProductDTO.setProductId(pizzaBoxProductModel.getProductId());
        pizzaBoxProductDTO.setProductBto(pizzaBoxProductModel.getProductBto());
        pizzaBoxProductDTO.setProductPrice(pizzaBoxProductModel.getProductPrice());
        pizzaBoxProductDTO.setProductUnity(pizzaBoxProductModel.getProductUnityMeasurement());
        pizzaBoxProductDTO.setProductDescription(pizzaBoxProductModel.getProductDescription());
        return pizzaBoxProductDTO;
    }
}