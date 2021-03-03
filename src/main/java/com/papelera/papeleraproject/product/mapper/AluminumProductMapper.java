package com.papelera.papeleraproject.product.mapper;

import com.papelera.papeleraproject.product.dto.AluminumProductDTO;
import com.papelera.papeleraproject.product.model.AluminumProductModel;
import org.springframework.stereotype.Component;

@Component
public class AluminumProductMapper {

    public AluminumProductModel toModel(AluminumProductDTO aluminumProductDTO) {
        AluminumProductModel aluminumProductModel = new AluminumProductModel();
        aluminumProductModel.setProductId(aluminumProductDTO.getProductId());
        aluminumProductModel.setProductName(aluminumProductDTO.getProductName());
        aluminumProductModel.setProductUnitPrice(aluminumProductDTO.getProductUnitPrice());
        aluminumProductModel.setProductStatusId(aluminumProductDTO.getProductStatusId());
        aluminumProductModel.setProductQuantityPrice(aluminumProductDTO.getProductQuantityPrice());
        aluminumProductModel.setFeaturedStatusId(aluminumProductDTO.getFeaturedStatusId());
        return aluminumProductModel;
    }

    public AluminumProductDTO toDTO(AluminumProductModel aluminumProductModel) {
        AluminumProductDTO aluminumProductDTO = new AluminumProductDTO();
        aluminumProductDTO.setProductId(aluminumProductModel.getProductId());
        aluminumProductDTO.setProductName(aluminumProductModel.getProductName());
        aluminumProductDTO.setProductStatusId(aluminumProductModel.getProductStatusId());
        aluminumProductDTO.setProductUnitPrice(aluminumProductModel.getProductUnitPrice());
        aluminumProductDTO.setProductQuantityPrice(aluminumProductModel.getProductQuantityPrice());
        aluminumProductDTO.setFeaturedStatusId(aluminumProductModel.getFeaturedStatusId());
        return aluminumProductDTO;
    }
}
