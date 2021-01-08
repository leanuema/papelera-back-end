package serviceimpl;

import model.PizzaBoxProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import repository.PizzaBoxProductRepository;
import service.PizzaBoxProductModelService;

import java.util.List;

public class PizzaBoxProductModelServiceImpl implements PizzaBoxProductModelService {

    @Autowired
    PizzaBoxProductRepository pizzaBoxProductRepository;

    @Override
    public List<PizzaBoxProductModel> getAllPizzaProduct() throws Exception {
        return pizzaBoxProductRepository.findAllPizzaProduct();
    }

}