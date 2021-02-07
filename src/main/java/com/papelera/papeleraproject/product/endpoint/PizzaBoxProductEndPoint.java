package com.papelera.papeleraproject.product.endpoint;

import com.papelera.papeleraproject.product.dto.PizzaBoxProductDTO;

import java.util.List;

public interface PizzaBoxProductEndPoint {

    String BASE = "/pizza-box-product";
    String GET_ALL_PIZZA_BOX_PRODUCT = "/get-all-pizza-box-product";
    String GET_PRODUCT_BY_STATUS = "/get-product-by-status";
    String MODIFY_PRODUCT = "/modify-product";
    String DELETE_PRODUCT = "/delete-product";
    String CREATING_PRODUCT = "/create-product";

    List<PizzaBoxProductDTO> getAllPizzaProduct() throws Exception;
    List<PizzaBoxProductDTO> getProductByStatusId(Integer statusId) throws Exception;
    PizzaBoxProductDTO modifyProduct(PizzaBoxProductDTO pizzaBoxProductDTO) throws Exception;
    void deleteProduct(Long pizzaBoxProductId) throws Exception;
    void createProduct(PizzaBoxProductDTO pizzaBoxProductDTO) throws Exception;

}