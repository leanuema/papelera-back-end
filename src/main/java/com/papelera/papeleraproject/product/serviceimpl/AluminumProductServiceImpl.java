package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.configuration.enumerator.ProductStatusEnum;
import com.papelera.papeleraproject.product.dto.AluminumProductDTO;
import com.papelera.papeleraproject.product.mapper.AluminumProductMapper;
import com.papelera.papeleraproject.product.model.AluminumProductModel;
import com.papelera.papeleraproject.product.service.AluminumProductService;
import com.papelera.papeleraproject.product.service.model.AluminumProductModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class AluminumProductServiceImpl implements AluminumProductService {

    private final Logger logger = Logger.getLogger(AluminumProductServiceImpl.class.getName());

    @Autowired
    private AluminumProductModelService aluminumProductModelService;
    @Autowired
    private AluminumProductMapper aluminumProductMapper;

    @Override
    public List<AluminumProductDTO> getAllCardboardProduct() throws Exception {
        logger.log(Level.INFO, "Find all product");
        return aluminumProductModelService.getAllProduct().stream().map(aluminumProductModel ->
                aluminumProductMapper.toDTO(aluminumProductModel)).collect(Collectors.toList());
    }

    @Override
    public AluminumProductDTO findByProductId(Long productId) throws Exception {
        return null;
    }

    @Override
    public List<AluminumProductDTO> getStockAvailableProducts(Integer statusId) throws Exception {
        List<AluminumProductDTO> aluminumProductDTOList;
        logger.log(Level.INFO, "Searching products by status");
        try {
            aluminumProductDTOList = aluminumProductModelService.getStockAvailableProducts(statusId)
                    .stream().map(aluminumProductModel -> aluminumProductMapper
                            .toDTO(aluminumProductModel)).collect(Collectors.toList());
            for (AluminumProductDTO aluminumProduct : aluminumProductDTOList) {
                if (aluminumProduct.getProductStatusId() != null
                        && !aluminumProduct.getProductStatusId().equals(ProductStatusEnum.STOCK_UNAVAILABLE.getId())
                        && !aluminumProduct.getProductStatusId().equals(ProductStatusEnum.STOCK_AVAILABLE.getId())) {
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
    public AluminumProductModel modifyProduct(AluminumProductDTO aluminumProductDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to save product");
        return aluminumProductModelService.modifyProduct(aluminumProductMapper.toModel(aluminumProductDTO));
    }

    @Override
    public void createProduct(AluminumProductDTO aluminumProductDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to create product");
        aluminumProductModelService.createProduct(aluminumProductMapper.toModel(aluminumProductDTO));
    }

    @Override
    public List<AluminumProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        logger.log(Level.INFO, "Searching products by status");
        return null;
    }
}
