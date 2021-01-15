package com.papelera.papeleraproject.product.dto;

import java.io.Serializable;

public class PizzaBoxProductDTO implements Serializable {

    private Long productId;
    private String productDescription;
    private String productUnity;
    private Double productPrice;
    private String productBto;

    public PizzaBoxProductDTO() {
    }

    public PizzaBoxProductDTO(Long productId, String productDescription, String productUnity, String productMeasure
            , Double productPrice, String productBto) {
        this.productId = productId;
        this.productDescription = productDescription;
        this.productUnity = productUnity;
        this.productPrice = productPrice;
        this.productBto = productBto;
    }

    /**
     * Getter and Setter
     */
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductUnity() {
        return productUnity;
    }

    public void setProductUnity(String productUnity) {
        this.productUnity = productUnity;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductBto() {
        return productBto;
    }

    public void setProductBto(String productBto) {
        this.productBto = productBto;
    }
}