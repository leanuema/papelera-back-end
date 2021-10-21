package com.papelera.papeleraproject.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class CartDTO {
    private List<CartItemDTO> cartItems;
    private Double totalCost;

    public CartDTO(List<CartItemDTO> cartItemDTOList, Double totalCost) {
        this.cartItems = cartItemDTOList;
        this.totalCost = totalCost;
    }
}
