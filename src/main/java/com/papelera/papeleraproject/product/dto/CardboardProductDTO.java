package com.papelera.papeleraproject.product.dto;

import com.papelera.papeleraproject.configuration.enumerator.CartStatusEnum;

import java.io.Serializable;

public class CardboardProductDTO implements Serializable {

    private static final long serialVersionUID = -6409186427663917035L;

    private Long productId;
    private String productName;
    private Double productQuantityPrice;
    private Double productUnitPrice;
    private Integer productStatusId;
    private Long featuredStatusId;
    private Integer cartStatus = CartStatusEnum.STATUS_OUT.getStatus();

    public CardboardProductDTO() {
    }

    public CardboardProductDTO(Long productId, String productName, Double productQuantityPrice, Double productUnitPrice, Integer productStatusId, Long featuredStatusId, Integer cartStatus) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantityPrice = productQuantityPrice;
        this.productUnitPrice = productUnitPrice;
        this.productStatusId = productStatusId;
        this.featuredStatusId = featuredStatusId;
        this.cartStatus = cartStatus;
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
                ", cartStatus=" + cartStatus +
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

    public Integer getCartStatus() {
        return cartStatus;
    }

    public void setCartStatus(Integer cartStatus) {
        this.cartStatus = cartStatus;
    }
}

