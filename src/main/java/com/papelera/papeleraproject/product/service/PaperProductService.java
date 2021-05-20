package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.product.dto.OtherProductDTO;
import com.papelera.papeleraproject.product.dto.PaperProductDTO;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import java.util.List;

public interface PaperProductService {

    List<PaperProductDTO> getAllPaperProduct() throws Exception;
    PaperProductDTO findByProductId(Long productId) throws Exception;
    List<PaperProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;
    void modifyProduct(PaperProductDTO paperProductDTO) throws Exception;
    void createProduct(PaperProductDTO paperProductDTO) throws Exception;
    List<PaperProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
    List<PaperProductDTO> searchProduct(PaperProductDTO paperProductDTO, ExampleMatcher exampleMatcher) throws Exception;

}
