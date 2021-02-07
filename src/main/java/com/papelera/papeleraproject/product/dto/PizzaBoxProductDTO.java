package com.papelera.papeleraproject.product.dto;

import java.io.Serializable;

public class PizzaBoxProductDTO implements Serializable {

    private Long productId;
    private String productName;
    private Double productQuantityPrice;
    private Double productUnitPrice;
    private Integer productStatusId;

    public PizzaBoxProductDTO() {
    }

    public PizzaBoxProductDTO(Long productId, String productName, Double productQuantityPrice, Double productUnitPrice, Integer productStatusId) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantityPrice = productQuantityPrice;
        this.productUnitPrice = productUnitPrice;
        this.productStatusId = productStatusId;
    }


    /**
     * Getter and Setter
     **/
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductQuantityPrice() {
        return productQuantityPrice;
    }

    public void setProductQuantityPrice(Double productQuantityPrice) {
        this.productQuantityPrice = productQuantityPrice;
    }

    public Double getProductUnitPrice() {
        return productUnitPrice;
    }

    public void setProductUnitPrice(Double productUnitPrice) {
        this.productUnitPrice = productUnitPrice;
    }

    public Integer getProductStatusId() {
        return productStatusId;
    }

    public void setProductStatusId(Integer productStatusId) {
        this.productStatusId = productStatusId;
    }
}

