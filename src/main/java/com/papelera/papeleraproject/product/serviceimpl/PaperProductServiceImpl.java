package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.product.dto.PaperProductDTO;
import com.papelera.papeleraproject.product.mapper.PaperProductMapper;
import com.papelera.papeleraproject.product.model.PaperProductModel;
import com.papelera.papeleraproject.product.service.PaperProductService;
import com.papelera.papeleraproject.product.service.model.PaperProductModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperProductServiceImpl implements PaperProductService {

    @Autowired
    private PaperProductModelService paperProductModelService;
    @Autowired
    private PaperProductMapper paperProductMapper;

    @Override
    public List<PaperProductDTO> getAllCardboardProduct() throws Exception {
        return null;
    }

    @Override
    public PaperProductDTO findByProductId(Long productId) throws Exception {
        return null;
    }

    @Override
    public List<PaperProductDTO> getStockAvailableProducts(Integer statusId) throws Exception {
        return null;
    }

    @Override
    public PaperProductModel modifyProduct(PaperProductModel paperProductDTO) throws Exception {
        return null;
    }

    @Override
    public void createProduct(PaperProductModel paperProductDTO) throws Exception {

    }

    @Override
    public List<PaperProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception {
        return null;
    }
}
