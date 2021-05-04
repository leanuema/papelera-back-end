package com.papelera.papeleraproject.product.mapper;

import com.papelera.papeleraproject.product.dto.ProductInCartDTO;
import com.papelera.papeleraproject.product.model.ProductInCartModel;
import org.springframework.stereotype.Component;

@Component
public class ProductInCartMapper {

    public ProductInCartModel toModel(ProductInCartDTO productInCartDTO) {
        ProductInCartModel productInCartModel = new ProductInCartModel();
        productInCartModel.setCartId(productInCartDTO.getCartId());
        productInCartModel.setAluminumProductId(productInCartDTO.getAluminumProductId());
        productInCartModel.setAluminumProductName(productInCartDTO.getAluminumProductName());
        productInCartModel.setCardboardProductId(productInCartDTO.getCardboardProductId());
        productInCartModel.setCardboardProductName(productInCartDTO.getCardboardProductName());
        productInCartModel.setOtherProductId(productInCartDTO.getOtherProductId());
        productInCartModel.setOtherProductName(productInCartDTO.getOtherProductName());
        productInCartModel.setPaperProductId(productInCartDTO.getPaperProductId());
        productInCartModel.setPaperProductName(productInCartDTO.getPaperProductName());
        productInCartModel.setPlasticProductId(productInCartDTO.getPlasticProductId());
        productInCartModel.setPlasticProductName(productInCartDTO.getPlasticProductName());
        return productInCartModel;
    }

    public ProductInCartDTO toDTO(ProductInCartModel productInCartModel) {
        ProductInCartDTO productInCartDTO = new ProductInCartDTO();
        productInCartDTO.setCartId(productInCartModel.getCartId());
        productInCartDTO.setAluminumProductId(productInCartModel.getAluminumProductId());
        productInCartDTO.setAluminumProductName(productInCartModel.getAluminumProductName());
        productInCartDTO.setCardboardProductId(productInCartModel.getCardboardProductId());
        productInCartDTO.setCardboardProductName(productInCartModel.getCardboardProductName());
        productInCartDTO.setOtherProductId(productInCartModel.getOtherProductId());
        productInCartDTO.setOtherProductName(productInCartModel.getOtherProductName());
        productInCartDTO.setPaperProductId(productInCartModel.getPaperProductId());
        productInCartDTO.setPaperProductName(productInCartModel.getPaperProductName());
        productInCartDTO.setPlasticProductId(productInCartModel.getPlasticProductId());
        productInCartDTO.setPlasticProductName(productInCartModel.getPlasticProductName());
        return productInCartDTO;
    }
}
