package com.papelera.papeleraproject.product.resource;

import com.papelera.papeleraproject.product.model.CardboardProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.papelera.papeleraproject.product.dto.CardboardProductDTO;
import com.papelera.papeleraproject.product.endpoint.CardboardProductEndPoint;
import com.papelera.papeleraproject.product.service.CardboardProductService;

import java.util.List;

@RestController
@RequestMapping(value = CardboardProductEndPoint.BASE_URL)
public class CardboardProductResource implements CardboardProductEndPoint {

    @Autowired
    private CardboardProductService cardboardProductService;

    @Override
    @GetMapping(value = CardboardProductEndPoint.GET_ALL_CARDBOARD_BOX_PRODUCT,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<CardboardProductDTO> getAllCardboardProduct() throws Exception {
        return cardboardProductService.getAllCardboardProduct();
    }



    @Override
    @GetMapping(value = CardboardProductEndPoint.GET_PRODUCT_BY_STATUS,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<CardboardProductDTO> getProductByStatusId(@RequestParam("statusId") Integer statusId) throws Exception {
        return cardboardProductService.getStockAvailableProducts(statusId);
    }

    @Override
    @PutMapping(value = CardboardProductEndPoint.MODIFY_PRODUCT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public CardboardProductDTO modifyProduct(@RequestBody CardboardProductDTO cardboardProductDTO) throws Exception {
        return /*cardboardProductService.modifyProduct(cardboardProductDTO)*/null;
    }

    @Override
    @PostMapping(value = CardboardProductEndPoint.CREATING_PRODUCT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody CardboardProductDTO cardboardProductDTO) throws Exception {
        cardboardProductService.createProduct(cardboardProductDTO);
    }

    @Override
    @GetMapping(value = CardboardProductEndPoint.GET_CARDBOARD_PRODUCT_BY_ID,
                 produces = MediaType.APPLICATION_JSON_VALUE)

    public CardboardProductDTO findByProductId(@RequestParam("productId")Long productId) throws Exception {
        return cardboardProductService.findByProductId(productId);
    }

    @Override
    @GetMapping(value = CardboardProductEndPoint.GET_CARDBOARD_PRODUCT_BY_FEATURED_STATUS,
                 produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CardboardProductDTO> findProductByFeaturedStatusId(@RequestParam("featuredId")Long featuredId) throws Exception {
        return cardboardProductService.findProductByFeaturedStatusId(featuredId);
    }

}