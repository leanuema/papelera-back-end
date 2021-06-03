package com.papelera.papeleraproject.product.resource;

import com.papelera.papeleraproject.product.dto.ProductDTO;
import com.papelera.papeleraproject.product.endpoint.ProductEndPoint;
import com.papelera.papeleraproject.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = ProductEndPoint.BASE_URL)
public class ProductResource implements ProductEndPoint {

    private final Logger logger = Logger.getLogger(ProductResource.class.getName());

    @Autowired
    private ProductService productService;

    @Override
    @GetMapping(value = ProductEndPoint.GET_ALL_PRODUCT
            ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDTO> getAllProducts() throws Exception {
        return productService.getAllProducts();
    }

    @Override
    @GetMapping(value = ProductEndPoint.GET_PRODUCT_BY_ID
            ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public ProductDTO findByProductId(@RequestParam("productId") Long productId) throws Exception {
        return productService.findByProductId(productId);
    }

    @Override
    @GetMapping(value = ProductEndPoint.GET_PRODUCT_BY_STATUS
    ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public List<ProductDTO> getStockAvailableProducts(@RequestParam("statusId") Integer statusId) throws Exception {
        return productService.getStockAvailableProducts(statusId);
    }

    @Override
    @PutMapping (value = ProductEndPoint.MODIFY_PRODUCT)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void modifyProduct(@RequestBody ProductDTO productDTO) throws Exception {
        productService.modifyProduct(productDTO);
    }

    @Override
    @PostMapping (value = ProductEndPoint.CREATING_PRODUCT
    ,consumes= MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductDTO productDTO) throws Exception {
        productService.createProduct(productDTO);

    }

    @Override
    @GetMapping(value = ProductEndPoint.FIND_BY_FEATURED_STATUS
    ,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public List<ProductDTO> findProductByFeaturedStatusId(@RequestParam("featuredId") Long featuredId) throws Exception {
        return productService.findProductByFeaturedStatusId(featuredId);
    }

    @Override
    @GetMapping(value = ProductEndPoint.SEARCH_PRODUCT,
    produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public List<ProductDTO> searchProduct(@ModelAttribute("search") ProductDTO productDTO,
                                                  ExampleMatcher exampleMatcher) throws Exception {
        exampleMatcher = ExampleMatcher.matching().withMatcher("description", ExampleMatcher.GenericPropertyMatchers.contains());
        return productService.searchProduct(productDTO, exampleMatcher);
    }

    @Override
    @GetMapping(value = ProductEndPoint.GET_ALL_ALUMINUM_PRODUCT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public List<ProductDTO> getAllAluminumProduct() throws Exception {
        logger.log(Level.INFO, "Searching aluminum products");
        return productService.getAllAluminumProduct();
    }

    @Override
    @GetMapping(value = ProductEndPoint.GET_ALL_CARDBOARD_PRODUCT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public List<ProductDTO> getAllCardboardProduct() throws Exception {
        logger.log(Level.INFO, "Searching cardboard products");
        return productService.getAllCardboardProduct();
    }

    @Override
    @GetMapping(value = ProductEndPoint.GET_ALL_OTHER_PRODUCT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public List<ProductDTO> getAllOtherProduct() throws Exception {
        logger.log(Level.INFO, "Searching others products");
        return productService.getAllOtherProduct();
    }

    @Override
    @GetMapping(value = ProductEndPoint.GET_ALL_PAPER_PRODUCT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public List<ProductDTO> getAllPaperProduct() throws Exception {
        logger.log(Level.INFO, "Searching paper products");
        return productService.getAllPaperProduct();
    }

    @Override
    @GetMapping(value = ProductEndPoint.GET_ALL_PLASTIC_PRODUCT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public List<ProductDTO> getAllPlasticProduct() throws Exception {
        logger.log(Level.INFO, "Searching plastic products");
        return productService.getAllPlasticProduct();
    }

    @Override
    @PutMapping(value = ProductEndPoint.DISABLE_PRODUCT)
    @ResponseStatus(HttpStatus.GONE)
    public void disableProduct(Long productId) throws Exception {
        logger.log(Level.INFO, "Change status to disable product");
        productService.disableProduct(productId);
    }
}