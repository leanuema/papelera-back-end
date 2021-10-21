package com.papelera.papeleraproject.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddToCartDTO implements Serializable {
    private Long cartId;
    private Long userId;
    private Integer quantity;

}
