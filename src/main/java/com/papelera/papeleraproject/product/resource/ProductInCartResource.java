package com.papelera.papeleraproject.product.resource;

import com.papelera.papeleraproject.product.dto.ProductInCartDTO;
import com.papelera.papeleraproject.product.endpoint.CartEndPoint;
import com.papelera.papeleraproject.product.service.ProductInCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = CartEndPoint.BASE_URL)
public class ProductInCartResource implements CartEndPoint {

    private final Logger logger = Logger.getLogger(ProductInCartResource.class.getName());

    @Autowired
    private ProductInCartService productInCartService;

    @Override
    @GetMapping(value = CartEndPoint.RETRIEVE_ALL_PRODUCTS,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductInCartDTO> retrieveAllProducts(Long userId) throws Exception {
        return productInCartService.retrieveAllProductsInCart(userId);
    }
}
