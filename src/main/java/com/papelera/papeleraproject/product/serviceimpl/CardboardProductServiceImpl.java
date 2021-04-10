package com.papelera.papeleraproject.product.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.papelera.papeleraproject.configuration.enumerator.ProductStatusEnum;
import com.papelera.papeleraproject.product.dto.CardboardProductDTO;
import com.papelera.papeleraproject.product.mapper.CardboardProductMapper;
import com.papelera.papeleraproject.product.service.model.CardboardProductModelService;
import com.papelera.papeleraproject.product.service.CardboardProductService;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class CardboardProductServiceImpl implements CardboardProductService {

    private final Logger logger = Logger.getLogger(CardboardProductServiceImpl.class.getName());

    @Autowired
    private CardboardProductModelService cardboardProductModelService;
    @Autowired
    private CardboardProductMapper cardboardProductMapper;

    @Override
    public List<CardboardProductDTO> getAllCardboardProduct() throws Exception {
        logger.log(Level.INFO, "Find all product");
        return cardboardProductModelService.getAllCardboardProduct().stream().map(cardboardProductModel ->
                cardboardProductMapper.toDTO(cardboardProductModel)).collect(Collectors.toList());
    }

    @Override
    public CardboardProductDTO findByProductId(Long productId) throws Exception {
        logger.log(Level.INFO, "Find CardBoard product by ID");

        return cardboardProductMapper.toDTO(cardboardProductModelService.findByProductId(productId));
    }

    @Override
    public List<CardboardProductDTO> getStockAvailableProducts(Integer statusId) throws Exception {
        List<CardboardProductDTO> cardboardProductDTOList;
        logger.log(Level.INFO, "Searching products by status");
        try {
            cardboardProductDTOList = cardboardProductModelService.getProductByStatusId(statusId)
                    .stream().map(cardboardProductDTO -> cardboardProductMapper
                            .toDTO(cardboardProductDTO)).collect(Collectors.toList());
            for (CardboardProductDTO cardboardProductDTO : cardboardProductDTOList) {
                if (cardboardProductDTO.getProductStatusId() != null
                        && !cardboardProductDTO.getProductStatusId().equals(ProductStatusEnum.STOCK_UNAVAILABLE.getId())
                && !cardboardProductDTO.getProductStatusId().equals(ProductStatusEnum.STOCK_AVAILABLE.getId())) {
                    cardboardProductDTOList = new ArrayList<>();
                    logger.log(Level.SEVERE, "There is not stock type available for the product");
                }
            }
        } catch (Exception e) {
            throw new Exception("Could not retrieve value from database " + e);
        }
        return cardboardProductDTOList;
    }

    @Transactional
    @Override
    public void modifyProduct(CardboardProductDTO cardboardProductDTO) throws Exception {
        logger.log(Level.INFO, "begin of method to save product");
        if (cardboardProductModelService.findByProductId(cardboardProductDTO.getProductId()) == null) {
            logger.log(Level.SEVERE, "There is not product with this id: " + cardboardProductDTO.getProductId());
        } else {
            logger.log(Level.INFO, "modify product to: " + cardboardProductDTO);
             cardboardProductModelService.modifyProduct(cardboardProductMapper.toModel(cardboardProductDTO));
        }
    }

    @Transactional
    @Override
    public void createProduct(CardboardProductDTO cardboardProductDTO, Long productId) throws Exception {
        logger.log(Level.INFO, "begin of method to create product");
        cardboardProductModelService.createProduct(cardboardProductMapper.toModel(cardboardProductDTO), productId);
    }

    @Override
    public List<CardboardProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        logger.log(Level.INFO, "Searching products by featured status");
        return cardboardProductModelService.findProductByFeaturedStatusId(featuredId).stream().map(cardboardProductModel ->
               cardboardProductMapper.toDTO(cardboardProductModel)).collect(Collectors.toList());

    }

}