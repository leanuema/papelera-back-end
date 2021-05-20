package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.configuration.enumerator.ProductStatusEnum;
import com.papelera.papeleraproject.product.dto.CardboardProductDTO;
import com.papelera.papeleraproject.product.dto.PaperProductDTO;
import com.papelera.papeleraproject.product.mapper.PaperProductMapper;
import com.papelera.papeleraproject.product.model.OtherProductModel;
import com.papelera.papeleraproject.product.model.PaperProductModel;
import com.papelera.papeleraproject.product.service.PaperProductService;
import com.papelera.papeleraproject.product.service.model.PaperProductModelService;
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
public class PaperProductServiceImpl implements PaperProductService {

    private final Logger logger = Logger.getLogger(PaperProductServiceImpl.class.getName());

    @Autowired
    private PaperProductModelService paperProductModelService;
    @Autowired
    private PaperProductMapper paperProductMapper;

    @Override
    public List<PaperProductDTO> getAllPaperProduct() throws Exception {
        logger.log(Level.INFO,"Find all product");
        return paperProductModelService.getAllPaperProduct().stream().map(paperProductModel ->
                paperProductMapper.toDTO(paperProductModel)).collect(Collectors.toList());
    }

    @Override
    public PaperProductDTO findByProductId(Long productId) throws Exception {
        logger.log(Level.INFO, "Find Paper product by ID");
        return paperProductMapper.toDTO(paperProductModelService.findByProductId(productId));
    }

    @Override
    public List<PaperProductDTO> getStockAvailableProducts(Integer statusId) throws Exception {
        List<PaperProductDTO> paperProductDTOList;
        logger.log(Level.INFO, "Searching products by status");
        try {
            paperProductDTOList = paperProductModelService.getStockAvailableProducts(statusId)
                    .stream().map(paperProductDTO -> paperProductMapper
                            .toDTO(paperProductDTO)).collect(Collectors.toList());
            for (PaperProductDTO paperProductDTO : paperProductDTOList) {
                if (paperProductDTO.getProductStatusId() != null
                        && !paperProductDTO.getProductStatusId().equals(ProductStatusEnum.STOCK_UNAVAILABLE.getId())
                        && !paperProductDTO.getProductStatusId().equals(ProductStatusEnum.STOCK_AVAILABLE.getId())) {
                    paperProductDTOList = new ArrayList<>();
                    logger.log(Level.SEVERE, "There is not stock type available for the product");
                }
            }
        } catch (Exception e) {
            throw new Exception("Could not retrieve value from database " + e);
        }
        return paperProductDTOList;
    }

    @Transactional
    @Override
    public void modifyProduct(PaperProductDTO paperProductDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to save product");
        if (paperProductModelService.findByProductId(paperProductDTO.getProductId()) == null) {
            logger.log(Level.SEVERE, "There is not product with this id: " + paperProductDTO.getProductId());
        } else {
            logger.log(Level.INFO, "modify product to: " + paperProductDTO);
            paperProductModelService.modifyProduct(paperProductMapper.toModel(paperProductDTO));
        }
    }

    @Override
    public void createProduct(PaperProductDTO paperProductDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to create product");
        paperProductModelService.createProduct(paperProductMapper.toModel(paperProductDTO));

    }

    @Override
    public List<PaperProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        logger.log(Level.INFO, "Searching products by featured status");
        return paperProductModelService.findProductByFeaturedStatusId(featuredId).stream().map(paperProductModel ->
                paperProductMapper.toDTO(paperProductModel)).collect(Collectors.toList());
    }

    @Override
    public List<PaperProductDTO> searchProduct(PaperProductDTO paperProductDTO, ExampleMatcher exampleMatcher) throws Exception {
        logger.log(Level.INFO, "searching product: " + paperProductDTO);
        Example<PaperProductModel> productModelExample = Example.of(paperProductMapper.toModel(paperProductDTO), exampleMatcher);
        return paperProductModelService.searchProduct(productModelExample)
                .stream().map(paperProductModel ->
                        paperProductMapper.toDTO(paperProductModel)).collect(Collectors.toList());
    }
}
