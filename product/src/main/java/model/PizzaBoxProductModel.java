package model;

import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCT_PIZZA_BOX")
public class PizzaBoxProductModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID", nullable = false)
    private Long productId;
    @Column(name = "PRODUCT_DESCRIPTION")
    private String productDescription;
    @Column(name = "PRODUCT_UNIT_MEASUREMENT")
    private String productUnity;
    @Column(name = "PRODUCT_PRICE")
    private Integer productPrice;
    @Column(name = "PRODUCT_BTO")
    private String productBto;
    @javax.persistence.Id
    private String id;

    public PizzaBoxProductModel() {
    }

    public PizzaBoxProductModel(Long productId, String productDescription, String productUnity
            , Integer productPrice, String productBto) {
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
    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductBto() {
        return productBto;
    }

    public void setProductBto(String productBto) {
        this.productBto = productBto;
    }
}