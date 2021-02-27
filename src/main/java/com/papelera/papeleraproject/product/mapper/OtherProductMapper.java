package com.papelera.papeleraproject.product.mapper;

import com.papelera.papeleraproject.product.dto.OtherProductDTO;
import com.papelera.papeleraproject.product.model.OtherProductModel;
import org.springframework.stereotype.Component;

import javax.print.attribute.standard.MediaSize;

@Component
public class OtherProductMapper {

    public OtherProductModel toModel(OtherProductDTO otherProductDTO) {
        OtherProductModel otherProductModel = new OtherProductModel();
        otherProductModel.setProductId(otherProductDTO.getProductId());
        otherProductModel.setProductName(otherProductDTO.getProductName());
        otherProductModel.setProductUnitPrice(otherProductDTO.getProductUnitPrice());
        otherProductModel.setProductStatusId(otherProductDTO.getProductStatusId());
        otherProductModel.setProductQuantityPrice(otherProductDTO.getProductQuantityPrice());
        otherProductModel.setFeaturedStatusId(otherProductDTO.getFeaturedStatusId());
        return otherProductModel;
    }

    public OtherProductDTO toDTO(OtherProductModel otherProductModel) {
        OtherProductDTO otherProductDTO = new OtherProductDTO();
        otherProductDTO.setProductId(otherProductModel.getProductId());
        otherProductDTO.setProductName(otherProductModel.getProductName());
        otherProductDTO.setProductUnitPrice(otherProductModel.getProductUnitPrice());
        otherProductDTO.setProductStatusId(otherProductModel.getProductStatusId());
        otherProductDTO.setProductQuantityPrice(otherProductModel.getProductQuantityPrice());
        otherProductDTO.setFeaturedStatusId(otherProductModel.getFeaturedStatusId());
        return otherProductDTO;
    }
}
