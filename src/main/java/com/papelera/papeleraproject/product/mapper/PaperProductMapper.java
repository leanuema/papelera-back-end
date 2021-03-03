package com.papelera.papeleraproject.product.mapper;

import com.papelera.papeleraproject.product.dto.PaperProductDTO;
import com.papelera.papeleraproject.product.model.PaperProductModel;
import org.springframework.stereotype.Component;

@Component
public class PaperProductMapper {

    public PaperProductModel toModel(PaperProductDTO paperProductDTO) {
        PaperProductModel paperProductModel = new PaperProductModel();
        paperProductModel.setProductId(paperProductDTO.getProductId());
        paperProductModel.setProductName(paperProductDTO.getProductName());
        paperProductModel.setProductUnitPrice(paperProductDTO.getProductUnitPrice());
        paperProductModel.setProductStatusId(paperProductDTO.getProductStatusId());
        paperProductModel.setProductQuantityPrice(paperProductDTO.getProductQuantityPrice());
        paperProductModel.setFeaturedStatusId(paperProductDTO.getFeaturedStatusId());
        return paperProductModel;
    }

    public PaperProductDTO toDTO(PaperProductModel paperProductModel) {
        PaperProductDTO paperProductDTO = new PaperProductDTO();
        paperProductDTO.setProductId(paperProductModel.getProductId());
        paperProductDTO.setProductName(paperProductModel.getProductName());
        paperProductDTO.setProductUnitPrice(paperProductModel.getProductUnitPrice());
        paperProductDTO.setProductStatusId(paperProductModel.getProductStatusId());
        paperProductDTO.setProductQuantityPrice(paperProductModel.getProductQuantityPrice());
        paperProductDTO.setFeaturedStatusId(paperProductModel.getFeaturedStatusId());
        return paperProductDTO;
    }
}
