package com.papelera.papeleraproject.product.service;

import com.papelera.papeleraproject.account.model.User;
import com.papelera.papeleraproject.product.dto.CartDTO;
import com.papelera.papeleraproject.product.dto.CartItemDTO;
import com.papelera.papeleraproject.product.dto.ProductDTO;
import com.papelera.papeleraproject.product.model.CartModel;
import com.papelera.papeleraproject.product.model.ProductModel;

import java.util.List;

public interface ProductService {

    List<ProductDTO> getAllProducts() throws Exception;
    ProductDTO findByProductId(Long productId) throws Exception;
    List<ProductDTO> getStockAvailableProducts(Integer statusId) throws Exception;
    void modifyProduct(ProductDTO productDTO) throws Exception;
    void createProduct(ProductDTO productDTO) throws Exception;
    List<ProductDTO> findProductByFeaturedStatusId(Long featuredId) throws Exception;
    List<ProductDTO> searchProduct(String productName) throws Exception;
    List<ProductDTO> getAllAluminumProduct() throws Exception;
    List<ProductDTO> getAllCardboardProduct() throws Exception;
    List<ProductDTO> getAllOtherProduct() throws Exception;
    List<ProductDTO> getAllPaperProduct() throws Exception;
    List<ProductDTO> getAllPlasticProduct() throws Exception;
    void changeStatusProduct(Long productId, Integer productStatusId) throws Exception;
    void addToCart(ProductModel productId, User userId) throws Exception;
    CartItemDTO getDtoFromCart(CartModel cart);
    CartDTO listCartItems(Long userId);
    void deleteCartItem(Long cartId);

}
