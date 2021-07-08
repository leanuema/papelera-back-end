package com.papelera.papeleraproject.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO implements Serializable {

    private static final long serialVersionUID = -7063196584296599430L;

    private Long productId;
    private String productName;
    private Double productQuantityPrice;
    private Double productUnitPrice;
    private Integer productStatusId;
    private Long featuredStatusId;
    private Long categoryId;

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productQuantityPrice=" + productQuantityPrice +
                ", productUnitPrice=" + productUnitPrice +
                ", productStatusId=" + productStatusId +
                ", featuredStatusId=" + featuredStatusId +
                ", categoryId=" + categoryId +
                '}';
    }

}
