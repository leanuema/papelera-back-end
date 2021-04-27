package com.papelera.papeleraproject.product.resource;

import com.papelera.papeleraproject.product.dto.ProductCart;
import com.papelera.papeleraproject.product.endpoint.ProductCartEndPoint;
import com.papelera.papeleraproject.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(ProductCartEndPoint.BASE_URL)
public class ProductCartResource implements ProductCartEndPoint {

    @Autowired
    private ProductService productService;

    @GetMapping(value = ProductCartEndPoint.GET_ALL_PRODUCT,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public List<ProductCart> getAllProduct() throws Exception {
        return productService.getAllProduct();
    }

    @GetMapping(value = ProductCartEndPoint.RETRIEVE_ALL_FEATURED_PRODUCT,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public List<ProductCart> retrieveAllFeaturedProduct(@RequestParam Long id) throws Exception {
        return productService.retrieveAllFeaturedProduct(id);
    }

    @GetMapping(value = ProductCartEndPoint.RETRIEVE_BY_ID_AND_NAME,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public List<ProductCart> retrieveByIdAndName(@RequestParam Long id,
                                                 @RequestParam String productName) throws Exception {
        return productService.retrieveByIdAndName(id, productName);
    }
}
