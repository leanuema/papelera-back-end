package mapper;

import dto.PizzaBoxProductDTO;
import model.PizzaBoxProductModel;
import org.springframework.stereotype.Component;

@Component
public class PizzaBoxProductMapper {

    public PizzaBoxProductModel toModel(PizzaBoxProductDTO pizzaBoxProductDTO) {
        PizzaBoxProductModel pizzaBoxProductModel = new PizzaBoxProductModel();
        pizzaBoxProductModel.setProductId(pizzaBoxProductDTO.getProductId());
        pizzaBoxProductModel.setProductBto(pizzaBoxProductDTO.getProductBto());
        pizzaBoxProductModel.setProductPrice(pizzaBoxProductDTO.getProductPrice());
        pizzaBoxProductModel.setProductUnity(pizzaBoxProductDTO.getProductUnity());
        pizzaBoxProductModel.setProductDescription(pizzaBoxProductDTO.getProductDescription());
        return pizzaBoxProductModel;
    }

    public PizzaBoxProductDTO toDTO(PizzaBoxProductModel pizzaBoxProductModel) {
        PizzaBoxProductDTO pizzaBoxProductDTO = new PizzaBoxProductDTO();
        pizzaBoxProductDTO.setProductId(pizzaBoxProductModel.getProductId());
        pizzaBoxProductDTO.setProductBto(pizzaBoxProductModel.getProductBto());
        pizzaBoxProductDTO.setProductPrice(pizzaBoxProductModel.getProductPrice());
        pizzaBoxProductDTO.setProductUnity(pizzaBoxProductModel.getProductUnity());
        pizzaBoxProductDTO.setProductDescription(pizzaBoxProductModel.getProductDescription());
        return pizzaBoxProductDTO;
    }

}