package com.papelera.papeleraproject.product.dto;

import com.papelera.papeleraproject.account.model.User;
import com.papelera.papeleraproject.product.model.CartModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartItemDTO {
    private Long cartId;
    private Long productId;
    private Long userId;
    private Double cartPrice;

    public CartItemDTO(CartModel cart) {
        this.setCartId(cart.getCartId());
        this.setUserId(cart.getUserId().getUserId());
        this.setProductId(cart.getProductId().getProductId());
        this.setCartPrice(cart.getCartPrice());
    }
}
