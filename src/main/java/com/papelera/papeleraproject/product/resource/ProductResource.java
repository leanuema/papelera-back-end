package com.papelera.papeleraproject.product.resource;

import com.papelera.papeleraproject.account.model.User;
import com.papelera.papeleraproject.product.dto.CartDTO;
import com.papelera.papeleraproject.product.dto.ProductDTO;
import com.papelera.papeleraproject.product.endpoint.ProductEndPoint;
import com.papelera.papeleraproject.product.model.ProductModel;
import com.papelera.papeleraproject.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


@CrossOrigin(origins = {"http://localhost:4200", "https://papelera-project.herokuapp.com/"})
@RestController
@RequestMapping(value = ProductEndPoint.BASE_URL)
public class ProductResource implements ProductEndPoint {

    private final Logger logger = Logger.getLogger(ProductResource.class.getName());
    private ProductService productService;

    @Autowired
    public ProductResource(ProductService productService) {
        this.productService = productService;
    }

    @Override
    @GetMapping(value = ProductEndPoint.GET_ALL_PRODUCT
            , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDTO> getAllProducts() {
        logger.log(Level.INFO, "Find all product");
        List<ProductDTO> productDTOList = new ArrayList<>();
        try {
            productDTOList = productService.getAllProducts();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error trying to find all products", e);
        }
        return productDTOList;
    }

    @Override
    @GetMapping(value = ProductEndPoint.GET_PRODUCT_BY_ID
            , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ProductDTO findByProductId(@RequestParam("productId") Long productId) {
        logger.log(Level.INFO, "searching product with id = " + productId);
        ProductDTO productDTO = new ProductDTO();
        try {
            productDTO = productService.findByProductId(productId);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error tryin to find product by id = " + productId, e);
        }
        return productDTO;
    }

    @Override
    @GetMapping(value = ProductEndPoint.GET_PRODUCT_BY_STATUS
            , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public List<ProductDTO> getStockAvailableProducts(@RequestParam("statusId") Integer statusId) {
        List<ProductDTO> productDTOList = new ArrayList<>();
        try {
            productDTOList = productService.getStockAvailableProducts(statusId);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Could not retrieve value from database ", e);
            productDTOList = new ArrayList<>();
        }
        return productDTOList;
    }

    @Override
    @PutMapping(value = ProductEndPoint.MODIFY_PRODUCT)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void modifyProduct(@RequestBody ProductDTO productDTO) {
        logger.log(Level.INFO, "begin of method to modify product");
        try {
            if (productDTO != null) {
                logger.log(Level.INFO, "modify product: " + productDTO);
                productService.modifyProduct(productDTO);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Could not modify product", e);
        }
    }

    @Override
    @PostMapping(value = ProductEndPoint.CREATING_PRODUCT
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductDTO productDTO) {
        logger.log(Level.INFO, "begin of method to create product" + productDTO.toString());
        try {
            productService.createProduct(productDTO);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error creating product", e);
        }
    }

    @Override
    @GetMapping(value = ProductEndPoint.FIND_BY_FEATURED_STATUS
            , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.FOUND)
    public List<ProductDTO> findProductByFeaturedStatusId(@RequestParam("featuredId") Long featuredId) {
        List<ProductDTO> productDTOList = new ArrayList<>();
        try {
            productDTOList = productService.findProductByFeaturedStatusId(featuredId);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Could not retrieve value from database ", e);
            productDTOList = new ArrayList<>();
        }
        return productDTOList;
    }

    @Override
    @GetMapping(value = ProductEndPoint.SEARCH_PRODUCT,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDTO> searchProduct(@RequestParam("productName") String productName) {
        logger.log(Level.INFO, "Searching product with name: " + productName);
        List<ProductDTO> productDTOList = new ArrayList<>();
        try {
            productDTOList = productService.searchProduct(productName);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error searching product with name = " + productName, e);
        }
        return productDTOList;
    }

    @Override
    @GetMapping(value = ProductEndPoint.GET_ALL_ALUMINUM_PRODUCT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDTO> getAllAluminumProduct() {
        logger.log(Level.INFO, "Searching aluminum products");
        List<ProductDTO> productDTOList = new ArrayList<>();
        try {
            productDTOList = productService.getAllAluminumProduct();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error searching aluminum product", e);
        }
        return productDTOList;
    }

    @Override
    @GetMapping(value = ProductEndPoint.GET_ALL_CARDBOARD_PRODUCT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDTO> getAllCardboardProduct() {
        logger.log(Level.INFO, "Searching aluminum products");
        List<ProductDTO> productDTOList = new ArrayList<>();
        try {
            productDTOList = productService.getAllCardboardProduct();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error searching cardboard product", e);
        }
        return productDTOList;
    }

    @Override
    @GetMapping(value = ProductEndPoint.GET_ALL_OTHER_PRODUCT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDTO> getAllOtherProduct() {
        logger.log(Level.INFO, "Searching cardboard products");
        List<ProductDTO> productDTOList = new ArrayList<>();
        try {
            productDTOList = productService.getAllOtherProduct();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error searching other product", e);
        }
        return productDTOList;
    }

    @Override
    @GetMapping(value = ProductEndPoint.GET_ALL_PAPER_PRODUCT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDTO> getAllPaperProduct() {
        logger.log(Level.INFO, "Searching others products");
        List<ProductDTO> productDTOList = new ArrayList<>();
        try {
            productDTOList = productService.getAllPaperProduct();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error searching paper product", e);
        }
        return productDTOList;
    }

    @Override
    @GetMapping(value = ProductEndPoint.GET_ALL_PLASTIC_PRODUCT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDTO> getAllPlasticProduct() {
        logger.log(Level.INFO, "Searching plastic products");
        List<ProductDTO> productDTOList = new ArrayList<>();
        try {
            productDTOList = productService.getAllPlasticProduct();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error searching plastic product", e);
        }
        return productDTOList;
    }

    @Override
    @PutMapping(value = ProductEndPoint.CHANGE_STATUS_PRODUCT)
    @ResponseStatus(HttpStatus.OK)
    public void changeStatusProduct(@RequestParam("productId") Long productId,
                                    @RequestParam("productStatusId") Integer productStatusId) {
        logger.log(Level.INFO, "change product with id = " + productId + "status to = " + productStatusId);
        try {
            productService.changeStatusProduct(productId, productStatusId);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Could not change status from product with id: " + productId, e);
        }
    }

    @Override
    @PostMapping(value = ProductEndPoint.ADD_TO_CART
            , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void addToCart(@RequestParam("productId") ProductModel productId,
                          @RequestParam("userId") User userId) {
        logger.log(Level.INFO, "adding product");
        try {
            productService.addToCart(productId,userId);
            logger.log(Level.INFO, "Successfully added" );
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error adding product", e);
        }
    }

    @GetMapping(value = ProductEndPoint.LIST_CART_ITEMS, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @Override
    public CartDTO listCartItems(@RequestParam("userId") Long userId) {
        logger.log(Level.INFO, "Listing Cart of user:" + userId );

        return productService.listCartItems(userId);
    }

    @DeleteMapping(value = ProductEndPoint.DELETE_CART_BY_ID)
    @ResponseStatus(HttpStatus.OK)
    @Override
    public void deleteCartItem(Long cartId) {
        productService.deleteCartItem(cartId);
        logger.log(Level.INFO, "DELETING CART:" + cartId );

    }


}