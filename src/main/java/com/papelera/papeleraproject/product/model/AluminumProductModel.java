package com.papelera.papeleraproject.product.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ALUMINUM_PRODUCT")
public class AluminumProductModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID", nullable = false)
    private Long productId;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "PRODUCT_QUANTITY_PRICE")
    private Double productQuantityPrice;
    @Column(name = "PRODUCT_UNIT_PRICE")
    private Double productUnitPrice;
    @Column(name = "STATUS_ID")
    private Integer productStatusId;
    @Column(name = "FEATURED_ID")
    private Long featuredStatusId;

    public AluminumProductModel() {
    }

    public AluminumProductModel(Long productId,
                                String productName,
                                Double productQuantityPrice,
                                Double productUnitPrice,
                                Integer productStatusId,
                                Long featuredStatusId) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantityPrice = productQuantityPrice;
        this.productUnitPrice = productUnitPrice;
        this.productStatusId = productStatusId;
        this.featuredStatusId = featuredStatusId;
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
}
