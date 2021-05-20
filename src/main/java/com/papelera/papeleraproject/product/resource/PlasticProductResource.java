package com.papelera.papeleraproject.product.resource;

import com.papelera.papeleraproject.product.dto.PlasticProductDTO;
import com.papelera.papeleraproject.product.endpoint.PlasticProductEndPoint;
import com.papelera.papeleraproject.product.service.PlasticProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = PlasticProductEndPoint.BASE_URL)
public class PlasticProductResource implements PlasticProductEndPoint {

    @Autowired
    PlasticProductService plasticProductService;

    @Override
    @GetMapping(value = PlasticProductEndPoint.GET_ALL_PLASTIC_BOX_PRODUCT,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PlasticProductDTO> getAllPlasticProduct() throws Exception {
        return plasticProductService.getAllPlasticProduct();
    }

    @Override
    @GetMapping(value = PlasticProductEndPoint.GET_PLASTIC_PRODUCT_BY_ID,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public PlasticProductDTO findByProductId(@RequestParam("productId") Long productId) throws Exception {
        return plasticProductService.findByProductId(productId);
    }

    @Override
    @GetMapping(value = PlasticProductEndPoint.GET_PRODUCT_BY_STATUS,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PlasticProductDTO> getStockAvailableProducts(@RequestParam("statusId") Integer statusId) throws Exception {
        return plasticProductService.getStockAvailableProducts(statusId);
    }

    @Override
    @PutMapping(value = PlasticProductEndPoint.MODIFY_PRODUCT,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public void modifyProduct(@RequestBody PlasticProductDTO plasticProductDTO) throws Exception {
        plasticProductService.modifyProduct(plasticProductDTO);
    }

    @Override
    @PostMapping(value = PlasticProductEndPoint.CREATING_PRODUCT,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public void createProduct(@RequestBody PlasticProductDTO plasticProductDTO) throws Exception {
     plasticProductService.createProduct(plasticProductDTO);
    }

    @Override
    @GetMapping(value = PlasticProductEndPoint.GET_PLASTIC_PRODUCT_BY_FEATURED_STATUS,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PlasticProductDTO> findProductByFeaturedStatusId(@RequestParam("featuredId") Long featuredId) throws Exception {
        return plasticProductService.findProductByFeaturedStatusId(featuredId);
    }

    @Override
    @GetMapping(value = PlasticProductEndPoint.SEARCH_PRODUCT,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public List<PlasticProductDTO> searchProduct(@ModelAttribute("search") PlasticProductDTO plasticProductDTO,
                                                 ExampleMatcher exampleMatcher) throws Exception {
        exampleMatcher = ExampleMatcher.matching().withMatcher("description",
                ExampleMatcher.GenericPropertyMatchers.contains());
        return plasticProductService.searchProduct(plasticProductDTO, exampleMatcher);
    }
}
