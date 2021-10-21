package com.papelera.papeleraproject.product.service.model;

import com.papelera.papeleraproject.account.model.User;
import com.papelera.papeleraproject.product.dto.CartDTO;
import com.papelera.papeleraproject.product.dto.CartItemDTO;
import com.papelera.papeleraproject.product.model.CartModel;
import com.papelera.papeleraproject.product.model.ProductModel;

import java.util.List;

public interface ProductModelService {

    List<ProductModel> getAllProduct() throws Exception;
    ProductModel findByProductId(Long productId) throws Exception;
    List<ProductModel> getStockAvailableProducts(Integer statusId) throws Exception;
    void modifyProduct(ProductModel productModel) throws Exception;
    void createProduct(ProductModel productModel) throws Exception;
    List<ProductModel> findProductByFeaturedStatusId(Long featuredId) throws Exception;
    List<ProductModel> searchProduct(String productName) throws Exception;
    List<ProductModel> getAllAluminumProduct() throws Exception;
    List<ProductModel> getAllCardboardProduct() throws Exception;
    List<ProductModel> getAllOtherProduct() throws Exception;
    List<ProductModel> getAllPaperProduct() throws Exception;
    List<ProductModel> getAllPlasticProduct() throws Exception;
    void changeStatusProduct(Long productId, Integer productStatusId) throws Exception;
    void addToCart(ProductModel productId,User userId) throws Exception;
    Long findLastCartId() throws Exception;
    CartItemDTO getDtoFromCart(CartModel cart);
    CartDTO listCartItems(Long userId);
    void deleteCartItem(Long cartId);

}
