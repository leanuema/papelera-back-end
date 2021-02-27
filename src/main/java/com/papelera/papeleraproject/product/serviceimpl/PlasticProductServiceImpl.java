package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.product.dto.PlasticProductDTO;
import com.papelera.papeleraproject.product.mapper.PlasticProductMapper;
import com.papelera.papeleraproject.product.model.PlasticProductModel;
import com.papelera.papeleraproject.product.service.PlasticProductService;
import com.papelera.papeleraproject.product.service.model.PlasticProductModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlasticProductServiceImpl implements PlasticProductService {

    @Autowired
    private PlasticProductModelService plasticProductModelService;
    @Autowired
    private PlasticProductMapper plasticProductMapper;

    @Override
    public List<PlasticProductDTO> getAllCardboardProduct() throws Exception {
        return null;
    }

    @Override
    public PlasticProductDTO findByProductId(Long productId) throws Exception {
        return null;
    }

    @Override
    public List<PlasticProductDTO> getStockAvailableProducts(Integer statusId) throws Exception {
        return null;
    }

    @Override
    public PlasticProductModel modifyProduct(PlasticProductDTO plasticProductModel) throws Exception {
        return null;
    }

    @Override
    public void createProduct(PlasticProductDTO plasticProductModel) throws Exception {

    }

    @Override
    public List<PlasticProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        return null;
    }
}
