package com.papelera.papeleraproject.product.mapper;

import org.springframework.stereotype.Component;
import com.papelera.papeleraproject.product.dto.CardboardProductDTO;
import com.papelera.papeleraproject.product.model.CardboardProductModel;

@Component
public class CardboardProductMapper {

    public CardboardProductModel toModel(CardboardProductDTO cardboardProductDTO) {
        CardboardProductModel cardboardProductModel = new CardboardProductModel();
        cardboardProductModel.setProductId(cardboardProductDTO.getProductId());
        cardboardProductModel.setProductStatusId(cardboardProductDTO.getProductStatusId());
        cardboardProductModel.setProductUnitPrice(cardboardProductDTO.getProductUnitPrice());
        cardboardProductModel.setProductQuantityPrice(cardboardProductDTO.getProductQuantityPrice());
        cardboardProductModel.setProductName(cardboardProductDTO.getProductName());
        cardboardProductModel.setFeaturedStatusId(cardboardProductDTO.getFeaturedStatusId());
        return cardboardProductModel;
    }

    public CardboardProductDTO toDTO(CardboardProductModel cardboardProductModel) {
        CardboardProductDTO cardboardProductDTO = new CardboardProductDTO();
        cardboardProductDTO.setProductId(cardboardProductModel.getProductId());
        cardboardProductDTO.setProductStatusId(cardboardProductModel.getProductStatusId());
        cardboardProductDTO.setProductUnitPrice(cardboardProductModel.getProductUnitPrice());
        cardboardProductDTO.setProductQuantityPrice(cardboardProductModel.getProductQuantityPrice());
        cardboardProductDTO.setProductName(cardboardProductModel.getProductName());
        cardboardProductDTO.setFeaturedStatusId(cardboardProductModel.getFeaturedStatusId());
        return cardboardProductDTO;
    }
}