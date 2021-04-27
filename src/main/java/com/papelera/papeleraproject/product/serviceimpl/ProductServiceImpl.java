package com.papelera.papeleraproject.product.serviceimpl;

import com.papelera.papeleraproject.configuration.enumerator.FeaturedStatusEnum;
import com.papelera.papeleraproject.product.dto.ProductCart;
import com.papelera.papeleraproject.product.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private AluminumProductService aluminumProductService;
    @Autowired
    private CardboardProductService cardboardProductService;
    @Autowired
    private OtherProductService otherProductService;
    @Autowired
    private PaperProductService paperProductService;
    @Autowired
    private PlasticProductService plasticProductService;

    private List<ProductCart> productCartList = new ArrayList<>();
    private ProductCart productCart = new ProductCart();

    @Override
    public List<ProductCart> getAllProduct() throws Exception {
        try {
            productCart.setAluminumProductDTO(aluminumProductService.getAllProducts());
            productCart.setCardboardProductDTO(cardboardProductService.getAllCardboardProduct());
            productCart.setOtherProductDTO(otherProductService.getAllOtherProduct());
            productCart.setPaperProductDTO(paperProductService.getAllPaperProduct());
            productCart.setPlasticProductDTO(plasticProductService.getAllPlasticProduct());
        } catch (Exception e) {
            throw e;
        }
        productCartList.add(productCart);
        return productCartList;
    }

    @Override
    public List<ProductCart> retrieveAllFeaturedProduct(Long id) throws Exception {
        try {
            if (!id.equals(FeaturedStatusEnum.NOT_FEATURED.getId())) {
                productCart.setAluminumProductDTO(aluminumProductService.findProductByFeaturedStatusId(id));
                productCart.setCardboardProductDTO(cardboardProductService.findProductByFeaturedStatusId(id));
                productCart.setOtherProductDTO(otherProductService.findProductByFeaturedStatusId(id));
                productCart.setPaperProductDTO(paperProductService.findProductByFeaturedStatusId(id));
                productCart.setPlasticProductDTO(plasticProductService.findProductByFeaturedStatusId(id));
            }
        } catch (Exception e) {
            throw e;
        }
        productCartList.add(productCart);
        return productCartList;
    }

    @Override
    public List<ProductCart> retrieveByIdAndName(Long id, String productName) throws Exception {
        //productCart.setAluminumProductDTO();
        productCart.setCardboardProductDTO(cardboardProductService.findByIdAndName(id, productName));
        //productCart.setOtherProductDTO();
        //productCart.setPaperProductDTO();
        //productCart.setPlasticProductDTO();

        productCartList.add(productCart);
        return productCartList;
    }
}
