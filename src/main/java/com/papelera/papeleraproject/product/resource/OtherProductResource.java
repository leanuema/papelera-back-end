package com.papelera.papeleraproject.product.resource;

import com.papelera.papeleraproject.product.dto.OtherProductDTO;
import com.papelera.papeleraproject.product.endpoint.OtherProductEndPoint;
import com.papelera.papeleraproject.product.model.OtherProductModel;
import com.papelera.papeleraproject.product.service.OtherProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = OtherProductEndPoint.BASE_URL)
public class OtherProductResource implements OtherProductEndPoint {

    @Autowired
    private OtherProductService otherProductService;

    @Override
    @GetMapping(value = OtherProductEndPoint.GET_ALL_OTHER_PRODUCT,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OtherProductDTO> getAllOtherProduct() throws Exception {
        return otherProductService.getAllOtherProduct();
    }

    @Override
    @GetMapping(value = OtherProductEndPoint.GET_OTHER_PRODUCT_BY_ID,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public OtherProductDTO findByProductId(@RequestParam("productId") Long productId) throws Exception {
        return otherProductService.findByProductId(productId);
    }

    @Override
    @GetMapping(value = OtherProductEndPoint.GET_PRODUCT_BY_STATUS,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OtherProductDTO> getStockAvailableProducts(@RequestParam("statusId") Integer statusId) throws Exception {
        return otherProductService.getStockAvailableProducts(statusId);
    }

    @Override
    @PutMapping(value = OtherProductEndPoint.MODIFY_PRODUCT,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public void modifyProduct(OtherProductDTO otherProductDTO) throws Exception {
        otherProductService.modifyProduct(otherProductDTO);
    }

    @Override
    @PostMapping(value = OtherProductEndPoint.CREATING_PRODUCT,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody OtherProductDTO otherProductDTO) throws Exception {

        otherProductService.createProduct(otherProductDTO);
    }

    @Override
    @GetMapping(value = OtherProductEndPoint.GET_OTHER_PRODUCT_BY_FEATURED_STATUS,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OtherProductDTO> findProductByFeaturedStatusId(@RequestParam("featuredId") Long featuredId) throws Exception {
        return otherProductService.findProductByFeaturedStatusId(featuredId);
    }
}
