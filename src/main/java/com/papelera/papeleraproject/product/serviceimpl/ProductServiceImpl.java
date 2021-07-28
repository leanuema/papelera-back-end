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
import java.util.Optional;
import java.util.OptionalLong;
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
        logger.log(Level.INFO, "Searching products by status= " + statusId);
        List<ProductDTO> productDTOList = new ArrayList<>();
        if (Optional.ofNullable(statusId).isPresent() && validateIsStatusAvailable(statusId.longValue())) {
            productDTOList = productModelService.getStockAvailableProducts(statusId)
                    .stream().map(productModel -> new ModelMapper().
                            map(productModel, ProductDTO.class)).collect(Collectors.toList());
        }
        return productDTOList;
    }

    private Boolean validateIsStatusAvailable(Long productStatus) {
        if (Optional.ofNullable(productStatus).isPresent()
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
        if (Optional.ofNullable(productDTO).isPresent()) {
            logger.log(Level.INFO, "modify product: " + productDTO);
            productModelService.modifyProduct(new ModelMapper().map(productDTO, ProductModel.class));
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
        List<ProductDTO> productDTOList = new ArrayList<>();
        if (Optional.ofNullable(featuredId).isPresent() && validateIsFeaturedStatusAvailable(featuredId)) {
            logger.log(Level.INFO, "Searching products by featured status = " + featuredId);
            productDTOList = productModelService.findProductByFeaturedStatusId(featuredId).stream().map(productModel ->
                    new ModelMapper().map(productModel, ProductDTO.class)).collect(Collectors.toList());
        }
        logger.log(Level.SEVERE, "There is not featured available for the product");
        return productDTOList;
    }

    private Boolean validateIsFeaturedStatusAvailable(Long productFeaturedStatus) {
        if (Optional.ofNullable(productFeaturedStatus).isPresent()
                && !productFeaturedStatus.equals(FeaturedStatusEnum.FEATURED.getId())
                && !productFeaturedStatus.equals(FeaturedStatusEnum.NOT_FEATURED.getId())) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override
    public List<ProductDTO> searchProduct(String productName) throws Exception {
        logger.log(Level.INFO, "searching product: " + productName);
        List<ProductDTO> productDTOList = new ArrayList<>();
        if (Optional.ofNullable(productName).isPresent()) {
            productDTOList = productModelService.searchProduct("%" + productName + "%").
                    stream().map(productModel -> new ModelMapper().map(productModel, ProductDTO.class))
                    .collect(Collectors.toList());
        }
        return productDTOList;
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
    public void changeStatusProduct(Long productId, Integer productStatusId) throws Exception {
        logger.log(Level.INFO, "change product with id = " + productId + "status to = " + productStatusId);
        validateProductStatus(productId, productStatusId);
    }

    private void validateProductStatus(Long productId, Integer productStatusId) throws Exception {
        if (Optional.ofNullable(productId).isPresent() && productStatusId.equals(ProductStatusEnum.STOCK_UNAVAILABLE.getId().intValue())
                || productStatusId.equals(ProductStatusEnum.STOCK_AVAILABLE.getId().intValue())) {
            productModelService.changeStatusProduct(productId, productStatusId);
        }
    }

}