package com.papelera.papeleraproject.product.resource;

import com.papelera.papeleraproject.product.dto.AluminumProductDTO;
import com.papelera.papeleraproject.product.endpoint.AluminumProductEndPoint;
import com.papelera.papeleraproject.product.model.AluminumProductModel;
import com.papelera.papeleraproject.product.service.AluminumProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = AluminumProductEndPoint.BASE_URL)
public class AluminumProductResource implements AluminumProductEndPoint {

    @Autowired
    private AluminumProductService aluminumProductService;


    @Override
    @GetMapping(value = AluminumProductEndPoint.GET_ALL_ALUMINUM_PRODUCT
            ,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AluminumProductDTO> getAllProducts() throws Exception {
        return aluminumProductService.getAllProducts();
    }

    @Override
    @GetMapping(value = AluminumProductEndPoint.GET_ALUMINUM_PRODUCT_BY_ID
            ,produces = MediaType.APPLICATION_JSON_VALUE)
    public AluminumProductDTO findByProductId(@RequestParam("productId") Long productId) throws Exception {
        return aluminumProductService.findByProductId(productId);
    }

    @Override
    @GetMapping(value = AluminumProductEndPoint.GET_PRODUCT_BY_STATUS
    ,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AluminumProductDTO> getStockAvailableProducts(@RequestParam("statusId") Integer statusId) throws Exception {
        return aluminumProductService.getStockAvailableProducts(statusId);
    }

    @Override
    @PutMapping (value = AluminumProductEndPoint.MODIFY_PRODUCT
    ,produces = MediaType.APPLICATION_JSON_VALUE)
    public void modifyProduct(@RequestBody AluminumProductDTO aluminumProductDTO) throws Exception {
        aluminumProductService.modifyProduct(aluminumProductDTO);
    }

    @Override
    @PostMapping (value = AluminumProductEndPoint.CREATING_PRODUCT
    ,consumes= MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody AluminumProductDTO aluminumProductDTO) throws Exception {
        aluminumProductService.createProduct(aluminumProductDTO);

    }

    @Override
    @GetMapping(value = AluminumProductEndPoint.GET_ALUMINUM_PRODUCT_BY_FEATURED_STATUS
    ,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AluminumProductDTO> findProductByFeaturedStatusId(@RequestParam("featuredId") Long featuredId) throws Exception {
        return aluminumProductService.findProductByFeaturedStatusId(featuredId);
    }
}
