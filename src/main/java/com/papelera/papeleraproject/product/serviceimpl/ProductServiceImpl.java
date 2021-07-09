package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.configuration.enumerator.FeaturedStatusEnum;
import com.papelera.papeleraproject.configuration.enumerator.ProductStatusEnum;
import com.papelera.papeleraproject.product.dto.ProductDTO;
import com.papelera.papeleraproject.product.model.ProductModel;
import com.papelera.papeleraproject.product.service.ProductService;
import com.papelera.papeleraproject.product.service.model.ProductModelService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final Logger logger = Logger.getLogger(ProductServiceImpl.class.getName());

    private final ProductModelService productModelService;

    @Autowired
    public ProductServiceImpl(ProductModelService productModelService) {
        this.productModelService = productModelService;
    }

    @Override
    public List<ProductDTO> getAllProducts() throws Exception {
        logger.log(Level.INFO, "Find all product");
        return productModelService.getAllProduct().stream().map(productModel ->
                new ModelMapper().map(productModel, ProductDTO.class)).collect(Collectors.toList());
    }

    @Override
    public ProductDTO findByProductId(Long productId) throws Exception {
        logger.log(Level.INFO, "searching product with id = " + productId);
        return new ModelMapper().map(productModelService.findByProductId(productId), ProductDTO.class);
    }

    @Override
    public List<ProductDTO> getStockAvailableProducts(Integer statusId) throws Exception {
        List<ProductDTO> productDTOList;
        logger.log(Level.INFO, "Searching products by status");
        try {
            productDTOList = productModelService.getStockAvailableProducts(statusId)
                    .stream().map(productModel -> new ModelMapper().
                            map(productModel, ProductDTO.class)).collect(Collectors.toList());
            for (ProductDTO productDTO : productDTOList) {
                if (validateIsStatusAvailable(productDTO.getProductStatusId().longValue()).equals(Boolean.FALSE)) {
                    productDTOList = new ArrayList<>();
                }
            }
            logger.log(Level.SEVERE, "There is not stock type available for the product");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Could not retrieve value from database ", e);
            productDTOList = new ArrayList<>();
        }
        return productDTOList;
    }

    private Boolean validateIsStatusAvailable(Long productStatus) {
        if (productStatus != null
                && !productStatus.equals(ProductStatusEnum.STOCK_UNAVAILABLE.getId())
                && !productStatus.equals(ProductStatusEnum.STOCK_AVAILABLE.getId())) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override
    @Transactional
    public void modifyProduct(ProductDTO productDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to modify product");
        try {
            if (productDTO != null) {
                logger.log(Level.INFO, "modify product: " + productDTO);
                productModelService.modifyProduct(new ModelMapper().map(productDTO, ProductModel.class));
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Could not modify product", e);
        }
    }

    @Override
    @Transactional
    public void createProduct(ProductDTO productDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to create product" + productDTO.toString());
        productModelService.createProduct(new ModelMapper().map(productDTO, ProductModel.class));
    }

    @Override
    public List<ProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        logger.log(Level.INFO, "Searching products by featured status = " + featuredId);
        List<ProductDTO> productDTOList;
        try {
            productDTOList = productModelService.findProductByFeaturedStatusId(featuredId).stream().map(productModel ->
                    new ModelMapper().map(productModel, ProductDTO.class)).collect(Collectors.toList());
            for (ProductDTO productDTO : productDTOList) {
                if (validateIsFeaturedStatusAvailable(productDTO.getFeaturedStatusId()).equals(Boolean.FALSE)) {
                    productDTOList = new ArrayList<>();
                }
            }
            logger.log(Level.SEVERE, "There is not featured available for the product");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Could not retrieve value from database ", e);
            productDTOList = new ArrayList<>();
        }
        return productDTOList;
    }

    private Boolean validateIsFeaturedStatusAvailable(Long productFeaturedStatus) {
        if (productFeaturedStatus != null
                && !productFeaturedStatus.equals(FeaturedStatusEnum.FEATURED.getId())
                && !productFeaturedStatus.equals(FeaturedStatusEnum.NOT_FEATURED.getId())) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override
    public List<ProductDTO> searchProduct(String productName) throws Exception {
        logger.log(Level.INFO, "searching product: " + productName);
        return productModelService.searchProduct("%" + productName + "%").
                stream().map(productModel -> new ModelMapper().map(productModel, ProductDTO.class)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> getAllAluminumProduct() throws Exception {
        logger.log(Level.INFO, "Searching aluminum products");
        return productModelService.getAllAluminumProduct().stream().map(productModel ->
                new ModelMapper().map(productModel, ProductDTO.class)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> getAllCardboardProduct() throws Exception {
        logger.log(Level.INFO, "Searching cardboard products");
        return productModelService.getAllCardboardProduct().stream().map(productModel ->
                new ModelMapper().map(productModel, ProductDTO.class)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> getAllOtherProduct() throws Exception {
        logger.log(Level.INFO, "Searching others products");
        return productModelService.getAllOtherProduct().stream().map(productModel ->
                new ModelMapper().map(productModel, ProductDTO.class)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> getAllPaperProduct() throws Exception {
        logger.log(Level.INFO, "Searching paper products");
        return productModelService.getAllPaperProduct().stream().map(productModel ->
                new ModelMapper().map(productModel, ProductDTO.class)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> getAllPlasticProduct() throws Exception {
        logger.log(Level.INFO, "Searching plastic products");
        return productModelService.getAllPlasticProduct().stream().map(productModel ->
                new ModelMapper().map(productModel, ProductDTO.class)).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void changeStatusProduct(Long productId, Integer productStatusId) {
        logger.log(Level.INFO, "change product with id = " + productId + "status to = " + productStatusId);
        try {
            validateProductStatus(productId, productStatusId);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Could not change status from product with id: " + productId, e);
        }
    }

    private void validateProductStatus(Long productId, Integer productStatusId) throws Exception {
        if (productId != null && productStatusId.equals(ProductStatusEnum.STOCK_UNAVAILABLE.getId().intValue())
                || productStatusId.equals(ProductStatusEnum.STOCK_AVAILABLE.getId().intValue())) {
            productModelService.changeStatusProduct(productId, productStatusId);
        }
    }

}