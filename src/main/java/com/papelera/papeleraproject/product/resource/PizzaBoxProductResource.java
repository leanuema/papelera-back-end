package com.papelera.papeleraproject.product.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.papelera.papeleraproject.product.dto.PizzaBoxProductDTO;
import com.papelera.papeleraproject.product.endpoint.PizzaBoxProductEndPoint;
import com.papelera.papeleraproject.product.service.PizzaBoxProductService;

import java.util.List;

@RestController
@RequestMapping(value = PizzaBoxProductEndPoint.BASE)
public class PizzaBoxProductResource implements PizzaBoxProductEndPoint {

    @Autowired
    private PizzaBoxProductService pizzaBoxProductService;

    @Override
    @GetMapping(value = PizzaBoxProductEndPoint.GET_ALL_PIZZA_BOX_PRODUCT,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<PizzaBoxProductDTO> getAllPizzaProduct() throws Exception {
        return pizzaBoxProductService.getAllPizzaProduct();
    }

    @Override
    @GetMapping(value = PizzaBoxProductEndPoint.GET_PRODUCT_BY_STATUS,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<PizzaBoxProductDTO> getProductByStatusId(@RequestParam("statusId") Integer statusId) throws Exception {
        return pizzaBoxProductService.getStockAvailableProducts(statusId);
    }

    @Override
    @PutMapping(value = PizzaBoxProductEndPoint.MODIFY_PRODUCT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public PizzaBoxProductDTO modifyProduct(@RequestBody PizzaBoxProductDTO pizzaBoxProductDTO) throws Exception {
        return pizzaBoxProductService.modifyProduct(pizzaBoxProductDTO);
    }

    @Override
    @DeleteMapping(value = PizzaBoxProductEndPoint.DELETE_PRODUCT)
    @ResponseStatus(HttpStatus.OK)
    public void deleteProduct(@RequestParam("pizzaBoxProductId") Long pizzaBoxProductId) throws Exception {
        pizzaBoxProductService.deleteProduct(pizzaBoxProductId);
    }

    @Override
    @PostMapping(value = PizzaBoxProductEndPoint.CREATING_PRODUCT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody PizzaBoxProductDTO pizzaBoxProductDTO) throws Exception {
        pizzaBoxProductService.createProduct(pizzaBoxProductDTO);
    }

}