package com.papelera.papeleraproject.product.dto;

import com.papelera.papeleraproject.configuration.enumerator.CartStatusEnum;

import java.io.Serializable;

public class ProductCore implements Serializable {

    private static final long serialVersionUID = 657233895050150283L;

    private Long productId;
    private String productName;
    private Double productQuantityPrice;
    private Double productUnitPrice;
    private Integer productStatusId;
    private Long featuredStatusId;
    private int cartStatus = CartStatusEnum.STATUS_OUT.getStatus();

    public ProductCore() {
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

    public int getCartStatus() {
        return cartStatus;
    }

    public void setCartStatus(int cartStatus) {
        this.cartStatus = cartStatus;
    }
}
