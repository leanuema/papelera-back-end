package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.configuration.enumerator.ProductStatusEnum;
import com.papelera.papeleraproject.product.dto.OtherProductDTO;
import com.papelera.papeleraproject.product.mapper.OtherProductMapper;
import com.papelera.papeleraproject.product.model.OtherProductModel;
import com.papelera.papeleraproject.product.service.OtherProductService;
import com.papelera.papeleraproject.product.service.model.OtherProductModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class OtherProductServiceImpl implements OtherProductService {

    private final Logger logger = Logger.getLogger(OtherProductServiceImpl.class.getName());

    @Autowired
    private OtherProductModelService otherProductModelService;
    @Autowired
    private OtherProductMapper otherProductMapper;

    @Override
    public List<OtherProductDTO> getAllCardboardProduct() throws Exception {
        logger.log(Level.INFO, "Find all product");
        return otherProductModelService.getAllProduct().stream().map(otherProductModel ->
                otherProductMapper.toDTO(otherProductModel)).collect(Collectors.toList());
    }

    @Override
    public OtherProductDTO findByProductId(Long productId) throws Exception {
        return null;
    }

    @Override
    public List<OtherProductDTO> getStockAvailableProducts(Integer statusId) throws Exception {
        List<OtherProductDTO> otherProductDTOList;
        logger.log(Level.INFO, "Searching products by status");
        try {
            otherProductDTOList = otherProductModelService.getStockAvailableProducts(statusId)
                    .stream().map(otherProductModel -> otherProductMapper
                            .toDTO(otherProductModel)).collect(Collectors.toList());
            for (OtherProductDTO otherProductDTO : otherProductDTOList) {
                if (otherProductDTO.getProductStatusId() != null
                        && !otherProductDTO.getProductStatusId().equals(ProductStatusEnum.STOCK_UNAVAILABLE.getId())
                        && !otherProductDTO.getProductStatusId().equals(ProductStatusEnum.STOCK_AVAILABLE.getId())) {
                    otherProductDTOList = new ArrayList<>();
                    logger.log(Level.SEVERE, "There is not stock type available for the product");
                }
            }
        } catch (Exception e) {
            throw new Exception("Could not retrieve value from database " + e);
        }
        return otherProductDTOList;
    }

    @Override
    public OtherProductModel modifyProduct(OtherProductDTO otherProductDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to save product");
        return otherProductModelService.modifyProduct(otherProductMapper.toModel(otherProductDTO));
    }

    @Override
    public void createProduct(OtherProductDTO otherProductDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to create product");
        otherProductModelService.createProduct(otherProductMapper.toModel(otherProductDTO));
    }

    @Override
    public List<OtherProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        logger.log(Level.INFO, "Searching products by status");
        return null;
    }
}
