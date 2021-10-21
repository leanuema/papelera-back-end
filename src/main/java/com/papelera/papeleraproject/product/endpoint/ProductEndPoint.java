package com.papelera.papeleraproject.product.endpoint;

import com.papelera.papeleraproject.account.model.User;
import com.papelera.papeleraproject.product.dto.CartDTO;
import com.papelera.papeleraproject.product.dto.ProductDTO;
import com.papelera.papeleraproject.product.model.ProductModel;

import java.util.List;

public interface ProductEndPoint {

    String BASE_URL = "/product";
    String ALL_OTHER_END_POINT = "/product/**";
    String GET_ALL_PRODUCT = "/get-all-product";
    String GET_PRODUCT_BY_ID = "/get-product-by-id";
    String GET_PRODUCT_BY_ID_PARAM = "?productId={productId}";
    String GET_PRODUCT_BY_STATUS = "/get-product-by-status";
    String GET_PRODUCT_BY_STATUS_PARAM = "?statusId={statusId}";
    String MODIFY_PRODUCT = "/modify-product";
    String CREATING_PRODUCT = "/create-product";
    String FIND_BY_FEATURED_STATUS = "/find_by_featured_status";
    String FIND_BY_FEATURED_STATUS_PARAM = "?featuredId={featuredId}";
    String SEARCH_PRODUCT = "/search-product";
    String GET_ALL_ALUMINUM_PRODUCT = "/get-all-aluminum-product";
    String GET_ALL_CARDBOARD_PRODUCT = "/get-all-cardboard-product";
    String GET_ALL_OTHER_PRODUCT = "/get-all-other-product";
    String GET_ALL_PAPER_PRODUCT = "/get-all-paper-product";
    String GET_ALL_PLASTIC_PRODUCT = "/get-all-plastic-product";
    String CHANGE_STATUS_PRODUCT = "/change-status-product";
    String CHANGE_STATUS_PRODUCT_PARAM = "?productId={productId}";
    String ADD_TO_CART = "/add-to-cart";
    String LIST_CART_ITEMS = "/list-cart-items";
    String DELETE_CART_BY_ID = "/delete-cart-by-id";

    List<ProductDTO> getAllProducts();
    ProductDTO findByProductId(Long productId);
    List<ProductDTO> getStockAvailableProducts(Integer statusId);
    void modifyProduct(ProductDTO productDTO);
    void createProduct(ProductDTO productDTO);
    List<ProductDTO> findProductByFeaturedStatusId(Long featuredId);
    List<ProductDTO> searchProduct(String productName);
    List<ProductDTO> getAllAluminumProduct();
    List<ProductDTO> getAllCardboardProduct();
    List<ProductDTO> getAllOtherProduct();
    List<ProductDTO> getAllPaperProduct();
    List<ProductDTO> getAllPlasticProduct();
    void changeStatusProduct(Long productId, Integer productStatusId);
    void addToCart(ProductModel productId, User userId);
    CartDTO listCartItems(Long userId);
    void deleteCartItem(Long cartId);

}
