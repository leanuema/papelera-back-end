package com.papelera.papeleraproject.product.restservice;

import org.springframework.stereotype.Component;
import com.papelera.papeleraproject.product.dto.PizzaBoxProductDTO;
import com.papelera.papeleraproject.product.endpoint.PizzaBoxProductEndPoint;

import java.util.List;

@Component
public class PizzaBoxProductRestService implements PizzaBoxProductEndPoint {

    @Override
    public List<PizzaBoxProductDTO> getAllPizzaProduct() throws Exception {
        return null;
    }
}
