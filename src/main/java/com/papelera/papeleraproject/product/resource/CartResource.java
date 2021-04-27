package com.papelera.papeleraproject.product.resource;

import com.papelera.papeleraproject.product.dto.ProductCart;
import com.papelera.papeleraproject.product.endpoint.CartEndPoint;
import com.papelera.papeleraproject.product.serviceimpl.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = CartEndPoint.BASE_URL)
public class CartResource implements CartEndPoint {

    private final Logger logger = Logger.getLogger(CartResource.class.getName());

    @Autowired
    private CartServiceImpl cartService;

    @Override
    @GetMapping(value = CartEndPoint.RETRIEVE_ALL_PRODUCTS,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductCart> retrieveAllProducts() throws Exception {
        return cartService.retrieveAllProductsInCart();
    }
}
