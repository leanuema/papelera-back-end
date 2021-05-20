package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.AluminumProductDTO;
import com.papelera.papeleraproject.product.dto.OtherProductDTO;
import com.papelera.papeleraproject.product.model.OtherProductModel;
import org.springframework.data.domain.ExampleMatcher;

import java.util.List;

public interface OtherProductService {

    List<OtherProductDTO> getAllOtherProduct() throws Exception;
    OtherProductDTO findByProductId(Long productId) throws Exception;
    List<OtherProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;
    void modifyProduct(OtherProductDTO otherProductDTO) throws Exception;
    void createProduct(OtherProductDTO otherProductDTO) throws Exception;
    List<OtherProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
    List<OtherProductDTO> searchProduct(OtherProductDTO otherProductDTO, ExampleMatcher exampleMatcher) throws Exception;

}
