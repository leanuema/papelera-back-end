package com.papelera.papeleraproject.product.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
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
    @GetMapping(value = {PizzaBoxProductEndPoint.GET_ALL_PIZZA_BOX_PRODUCT},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.OK)
    public List<PizzaBoxProductDTO> getAllPizzaProduct() throws Exception {
        return pizzaBoxProductService.getAllPizzaProduct();
    }

}