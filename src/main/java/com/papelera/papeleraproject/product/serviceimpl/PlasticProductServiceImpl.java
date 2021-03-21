package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.configuration.enumerator.ProductStatusEnum;
import com.papelera.papeleraproject.product.dto.CardboardProductDTO;
import com.papelera.papeleraproject.product.dto.PlasticProductDTO;
import com.papelera.papeleraproject.product.mapper.PlasticProductMapper;
import com.papelera.papeleraproject.product.model.PlasticProductModel;
import com.papelera.papeleraproject.product.service.PlasticProductService;
import com.papelera.papeleraproject.product.service.model.PlasticProductModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class PlasticProductServiceImpl implements PlasticProductService {

    @Autowired
    private PlasticProductModelService plasticProductModelService;
    @Autowired
    private PlasticProductMapper plasticProductMapper;

    private final Logger logger = Logger.getLogger(CardboardProductServiceImpl.class.getName());

    @Override
    public List<PlasticProductDTO> getAllPlasticProduct() throws Exception {
        logger.log(Level.INFO, "Find all product");
        return plasticProductModelService.getAllProduct().stream().map(plasticProductModel ->
                plasticProductMapper.toDTO(plasticProductModel)).collect(Collectors.toList());
    }

    @Override
    public PlasticProductDTO findByProductId(Long productId) throws Exception {
        logger.log(Level.INFO, "Find CardBoard product by ID");
        return plasticProductMapper.toDTO(plasticProductModelService.findByProductId(productId));
    }

    @Override
    public List<PlasticProductDTO> getStockAvailableProducts(Integer statusId) throws Exception {
        List<PlasticProductDTO> plasticProductDTOList;
        logger.log(Level.INFO, "Searching products by status");
        try {
            plasticProductDTOList = plasticProductModelService.getStockAvailableProducts(statusId)
                    .stream().map(plasticProductDTO -> plasticProductMapper
                            .toDTO(plasticProductDTO)).collect(Collectors.toList());
            for (PlasticProductDTO plasticProductDTO : plasticProductDTOList) {
                if (plasticProductDTO.getProductStatusId() != null
                        && !plasticProductDTO.getProductStatusId().equals(ProductStatusEnum.STOCK_UNAVAILABLE.getId())
                        && !plasticProductDTO.getProductStatusId().equals(ProductStatusEnum.STOCK_AVAILABLE.getId())) {
                    plasticProductDTOList = new ArrayList<>();
                    logger.log(Level.SEVERE, "There is not stock type available for the product");
                }
            }
        } catch (Exception e) {
            throw new Exception("Could not retrieve value from database " + e);
        }
        return plasticProductDTOList;
    }

    @Override
    public PlasticProductModel modifyProduct(PlasticProductDTO plasticProductDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to save product");
        return plasticProductModelService.modifyProduct(plasticProductMapper.toModel(plasticProductDTO));
    }

    @Override
    public void createProduct(PlasticProductDTO plasticProductDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to create product");
        plasticProductModelService.createProduct(plasticProductMapper.toModel(plasticProductDTO));

    }

    @Override
    public List<PlasticProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        logger.log(Level.INFO, "Searching products by featured status");
        return plasticProductModelService.findProductByFeaturedStatusId(featuredId).stream().map(plasticProductModel ->
                plasticProductMapper.toDTO(plasticProductModel)).collect(Collectors.toList());
    }
}
