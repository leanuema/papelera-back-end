package service;

import dto.PizzaBoxDto;

import java.util.List;

public interface PizzaBoxService {
    List<PizzaBoxDto> getAllPizaBoxProdcut() throws Exception;
}
