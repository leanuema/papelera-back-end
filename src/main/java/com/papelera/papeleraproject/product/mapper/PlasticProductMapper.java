package com.papelera.papeleraproject.product.mapper;

import com.papelera.papeleraproject.product.dto.PlasticProductDTO;
import com.papelera.papeleraproject.product.model.PlasticProductModel;
import org.springframework.stereotype.Component;

@Component
public class PlasticProductMapper {

    public PlasticProductModel toModel(PlasticProductDTO plasticProductDTO) {
        PlasticProductModel plasticProductModel = new PlasticProductModel();
        plasticProductModel.setProductId(plasticProductDTO.getProductId());
        plasticProductModel.setProductName(plasticProductDTO.getProductName());
        plasticProductModel.setProductUnitPrice(plasticProductDTO.getProductUnitPrice());
        plasticProductModel.setProductStatusId(plasticProductDTO.getProductStatusId());
        plasticProductModel.setProductQuantityPrice(plasticProductDTO.getProductQuantityPrice());
        plasticProductModel.setFeaturedStatusId(plasticProductDTO.getFeaturedStatusId());
        return plasticProductModel;
    }

    public PlasticProductDTO toDTO(PlasticProductModel plasticProductModel) {
        PlasticProductDTO plasticProductDTO = new PlasticProductDTO();
        plasticProductDTO.setProductId(plasticProductModel.getProductId());
        plasticProductDTO.setProductName(plasticProductModel.getProductName());
        plasticProductDTO.setProductUnitPrice(plasticProductModel.getProductUnitPrice());
        plasticProductDTO.setProductStatusId(plasticProductModel.getProductStatusId());
        plasticProductDTO.setProductQuantityPrice(plasticProductModel.getProductQuantityPrice());
        plasticProductDTO.setFeaturedStatusId(plasticProductModel.getFeaturedStatusId());
        return plasticProductDTO;
    }
}
