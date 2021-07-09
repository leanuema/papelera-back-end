package com.papelera.papeleraproject.product.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO implements Serializable {

    private static final long serialVersionUID = -7063196584296599430L;

    private Long productId;
    private String productName;
    private Double productQuantityPrice;
    private Double productUnitPrice;
    private Integer productStatusId;
    private Long featuredStatusId;
    private Long categoryId;

}
