package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.configuration.enumerator.ProductStatusEnum;
import com.papelera.papeleraproject.product.dto.OtherProductDTO;
import com.papelera.papeleraproject.product.mapper.OtherProductMapper;
import com.papelera.papeleraproject.product.model.AluminumProductModel;
import com.papelera.papeleraproject.product.model.OtherProductModel;
import com.papelera.papeleraproject.product.service.OtherProductService;
import com.papelera.papeleraproject.product.service.model.OtherProductModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
    public List<OtherProductDTO> getAllOtherProduct() throws Exception {
        logger.log(Level.INFO, "Find all product");
        return otherProductModelService.getAllProduct().stream().map(otherProductModel ->
                otherProductMapper.toDTO(otherProductModel)).collect(Collectors.toList());
    }

    @Override
    public OtherProductDTO findByProductId(Long productId) throws Exception {
        return otherProductMapper.toDTO(otherProductModelService.findByProductId(productId));
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

    @Transactional
    @Override
    public void modifyProduct(OtherProductDTO otherProductDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to save product");
        if (otherProductModelService.findByProductId(otherProductDTO.getProductId()) == null) {
            logger.log(Level.SEVERE, "There is not product with this id: " + otherProductDTO.getProductId());
        } else {
            logger.log(Level.INFO, "modify product to: " + otherProductDTO);
            otherProductModelService.modifyProduct(otherProductMapper.toModel(otherProductDTO));
        }
    }

    @Transactional
    @Override
    public void createProduct(OtherProductDTO otherProductDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to create product");
        otherProductModelService.createProduct(otherProductMapper.toModel(otherProductDTO));
    }

    @Override
    public List<OtherProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        logger.log(Level.INFO, "Searching products by status");
        return otherProductModelService.findProductByFeaturedStatusId(featuredId).stream().map(otherProductModel ->
                otherProductMapper.toDTO(otherProductModel)).collect(Collectors.toList());
    }

    @Override
    public List<OtherProductDTO> searchProduct(OtherProductDTO otherProductDTO, ExampleMatcher exampleMatcher) throws Exception {
        logger.log(Level.INFO, "searching product: " + otherProductDTO);
        Example<OtherProductModel> productModelExample = Example.of(otherProductMapper.toModel(otherProductDTO), exampleMatcher);
        return otherProductModelService.searchProduct(productModelExample)
                .stream().map(otherProductModel ->
                        otherProductMapper.toDTO(otherProductModel)).collect(Collectors.toList());
    }
}
