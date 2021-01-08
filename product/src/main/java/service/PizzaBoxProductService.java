package service;

import dto.PizzaBoxProductDTO;

import java.util.List;

public interface PizzaBoxProductService {

    List<PizzaBoxProductDTO> getAllPizzaProduct() throws Exception;
}
