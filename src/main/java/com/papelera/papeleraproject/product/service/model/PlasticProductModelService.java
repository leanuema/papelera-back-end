package com.papelera.papeleraproject.product.service.model;

import com.papelera.papeleraproject.product.model.PlasticProductModel;
import org.springframework.data.domain.Example;

import java.util.List;

public interface PlasticProductModelService {

    List<PlasticProductModel> getAllProduct() throws Exception;
    PlasticProductModel findByProductId(Long productId) throws Exception;
    List<PlasticProductModel> getStockAvailableProducts(Integer statusId) throws Exception;
    PlasticProductModel modifyProduct(PlasticProductModel plasticProductModel) throws Exception;
    void createProduct(PlasticProductModel plasticProductModel) throws Exception;
    List<PlasticProductModel> findProductByFeaturedStatusId(Long featuredId) throws Exception;
    List<PlasticProductModel> searchProduct(Example<PlasticProductModel> example) throws Exception;

}
