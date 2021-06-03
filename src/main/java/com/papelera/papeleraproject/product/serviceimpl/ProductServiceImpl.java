package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.configuration.enumerator.ProductStatusEnum;
import com.papelera.papeleraproject.product.dto.ProductDTO;
import com.papelera.papeleraproject.product.mapper.ProductMapper;
import com.papelera.papeleraproject.product.model.ProductModel;
import com.papelera.papeleraproject.product.service.ProductService;
import com.papelera.papeleraproject.product.service.model.ProductModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final Logger logger = Logger.getLogger(ProductServiceImpl.class.getName());

    @Autowired
    private ProductModelService productModelService;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<ProductDTO> getAllProducts() throws Exception {
        logger.log(Level.INFO, "Find all product");
        return productModelService.getAllProduct().stream().map(productModel ->
                productMapper.toDTO(productModel)).collect(Collectors.toList());
    }

    @Override
    public ProductDTO findByProductId(Long productId) throws Exception {
        return productMapper.toDTO(productModelService.findByProductId(productId));
    }

    @Override
    public List<ProductDTO> getStockAvailableProducts(Integer statusId) throws Exception {
        List<ProductDTO> aluminumProductDTOList;
        logger.log(Level.INFO, "Searching products by status");
        try {
            aluminumProductDTOList = productModelService.getStockAvailableProducts(statusId)
                    .stream().map(productModel -> productMapper
                            .toDTO(productModel)).collect(Collectors.toList());
            for (ProductDTO productDTO : aluminumProductDTOList) {
                if (productDTO.getProductStatusId() != null
                        && !productDTO.getProductStatusId().equals(ProductStatusEnum.STOCK_UNAVAILABLE.getId())
                        && !productDTO.getProductStatusId().equals(ProductStatusEnum.STOCK_AVAILABLE.getId())) {
                    aluminumProductDTOList = new ArrayList<>();
                    logger.log(Level.SEVERE, "There is not stock type available for the product");
                }
            }
        } catch (Exception e) {
            throw new Exception("Could not retrieve value from database " + e);
        }
        return aluminumProductDTOList;
    }

    @Override
    public void modifyProduct(ProductDTO productDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to save product");
        if (productModelService.findByProductId(productDTO.getProductId()) == null) {
            logger.log(Level.SEVERE, "There is not product with this id: " + productDTO.getProductId());
        } else {
            logger.log(Level.INFO, "modify product to: " + productDTO);
            productModelService.modifyProduct(productMapper.toModel(productDTO));
        }
    }

    @Override
    public void createProduct(ProductDTO productDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to create product");
        productModelService.createProduct(productMapper.toModel(productDTO));
    }

    @Override
    public List<ProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        logger.log(Level.INFO, "Searching products by status");
        return productModelService.findProductByFeaturedStatusId(featuredId).stream().map(productModel ->
                productMapper.toDTO(productModel)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> searchProduct(ProductDTO productDTO, ExampleMatcher exampleMatcher) throws Exception {
        logger.log(Level.INFO, "searching product: " + productDTO);
        Example<ProductModel> productModelExample = Example.of(productMapper.toModel(productDTO), exampleMatcher);
        return productModelService.searchProduct(productModelExample)
                .stream().map(productModel ->
                        productMapper.toDTO(productModel)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> getAllAluminumProduct() throws Exception {
        logger.log(Level.INFO, "Searching aluminum products");
        return productModelService.getAllAluminumProduct().stream().map(productModel ->
                productMapper.toDTO(productModel)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> getAllCardboardProduct() throws Exception {
        logger.log(Level.INFO, "Searching cardboard products");
        return productModelService.getAllCardboardProduct().stream().map(productModel ->
                productMapper.toDTO(productModel)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> getAllOtherProduct() throws Exception {
        logger.log(Level.INFO, "Searching others products");
        return productModelService.getAllOtherProduct().stream().map(productModel ->
                productMapper.toDTO(productModel)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> getAllPaperProduct() throws Exception {
        logger.log(Level.INFO, "Searching paper products");
        return productModelService.getAllPaperProduct().stream().map(productModel ->
                productMapper.toDTO(productModel)).collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> getAllPlasticProduct() throws Exception {
        logger.log(Level.INFO, "Searching plastic products");
        return productModelService.getAllPlasticProduct().stream().map(productModel ->
                productMapper.toDTO(productModel)).collect(Collectors.toList());
    }

    @Override
    public void disableProduct(Long productId) throws Exception {
        productModelService.disableProduct(productId);
    }
}
