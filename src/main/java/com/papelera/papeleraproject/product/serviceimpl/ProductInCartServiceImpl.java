package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.product.dto.ProductInCartDTO;
import com.papelera.papeleraproject.product.mapper.ProductInCartMapper;
import com.papelera.papeleraproject.product.service.ProductInCartService;
import com.papelera.papeleraproject.product.service.model.ProductInCartServiceModel;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class ProductInCartServiceImpl implements ProductInCartService {

    private final Logger logger = Logger.getLogger(ProductInCartServiceImpl.class.getName());

    @Autowired
    private ProductInCartServiceModel productInCartServiceModel;
    @Autowired
    private ProductInCartMapper productInCartMapper;

    private List<ProductInCartDTO> productInCartDTOList;

    @Override
    public List<ProductInCartDTO> retrieveAllProductsInCart(Long userId) throws Exception {
        logger.log(Level.INFO, "retrieve all products");
        return productInCartServiceModel.retrieveAllProductsInCart(userId)
                .stream().map(productInCartModel -> productInCartMapper.toDTO(productInCartModel))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteCart() {
        this.productInCartDTOList.clear();
    }

    @Override
    public void createCart() {

    }

    @Override
    public void addProductToCart(Long id, String productName) throws Exception {
    }

    @Override
    public Double calculateTotalPrice() {
        List<ProductInCartDTO> productInCartDTOList = new ArrayList<>();
        return Double.valueOf(productInCartDTOList.stream().count());
    }

    @Override
    public void removeProduct(Long id) {

    }
}
