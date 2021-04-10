package com.papelera.papeleraproject.product.dto;

import java.io.Serializable;

public class CardboardProductDTO implements Serializable {

    private static final long serialVersionUID = -6409186427663917035L;

    private Long productId;
    private String productName;
    private Double productQuantityPrice;
    private Double productUnitPrice;
    private Integer productStatusId;
    private Long featuredStatusId;

    public CardboardProductDTO() {
    }

    public CardboardProductDTO(Long productId, String productName, Double productQuantityPrice, Double productUnitPrice, Integer productStatusId, Long featuredStatusId) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantityPrice = productQuantityPrice;
        this.productUnitPrice = productUnitPrice;
        this.productStatusId = productStatusId;
        this.featuredStatusId = featuredStatusId;
    }

    @Override
    public String toString() {
        return "CardboardProductDTO{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productQuantityPrice=" + productQuantityPrice +
                ", productUnitPrice=" + productUnitPrice +
                ", productStatusId=" + productStatusId +
                ", featuredStatusId=" + featuredStatusId +
                '}';
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

    public Long getFeaturedStatusId() {
        return featuredStatusId;
    }

    public void setFeaturedStatusId(Long featuredStatusId) {
        this.featuredStatusId = featuredStatusId;
    }
}

