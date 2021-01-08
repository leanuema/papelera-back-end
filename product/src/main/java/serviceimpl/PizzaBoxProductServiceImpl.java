package serviceimpl;

import dto.PizzaBoxProductDTO;
import mapper.PizzaBoxProductMapper;
import model.PizzaBoxProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import service.PizzaBoxProductModelService;
import service.PizzaBoxProductService;

import java.util.List;

public class PizzaBoxProductServiceImpl implements PizzaBoxProductService {

    @Autowired
    PizzaBoxProductModelService pizzaBoxProductModelService;
    @Autowired
    PizzaBoxProductMapper pizzaBoxProductMapper;

    @Override
    public List<PizzaBoxProductDTO> getAllPizzaProduct() throws Exception {
        return null;
    }
}
