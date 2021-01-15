package com.papelera.papeleraproject.product.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCT_PIZZA_BOX")
public class  PizzaBoxProductModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID", nullable = false)
    private Long productId;
    @Column(name = "PRODUCT_DESCRIPTION")
    private String productDescription;
    @Column(name = "PRODUCT_UNIT_MEASUREMENT")
    private String productUnityMeasurement;
    @Column(name = "PRODUCT_PRICE")
    private Double productPrice;
    @Column(name = "PRODUCT_BTO")
    private String productBto;

    public PizzaBoxProductModel() {
    }

    public PizzaBoxProductModel(Long productId, String productDescription, String productUnityMeasurement
            , Double productPrice, String productBto) {
        this.productId = productId;
        this.productDescription = productDescription;
        this.productUnityMeasurement = productUnityMeasurement;
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

    public String getProductUnityMeasurement() {
        return productUnityMeasurement;
    }

    public void setProductUnityMeasurement(String productUnityMeasurement) {
        this.productUnityMeasurement = productUnityMeasurement;
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