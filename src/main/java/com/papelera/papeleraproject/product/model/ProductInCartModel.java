package com.papelera.papeleraproject.product.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CART_PRODUCT")
public class ProductInCartModel implements Serializable {

    private static final long serialVersionUID = -250456501243097773L;

    @Column(name = "CART_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long cartId;
    @Column(name = "ALUMINUM_PRODUCT_ID")
    private Long aluminumProductId;
    @Column(name = "ALUMINUM_PRODUCT_NAME")
    private String aluminumProductName;
    @Column(name = "CARDBOARD_PRODUCT_ID")
    private Long cardboardProductId;
    @Column(name = "CARDBOARD_PRODUCT_NAME")
    private String cardboardProductName;
    @Column(name = "OTHER_PRODUCT_ID")
    private Long otherProductId;
    @Column(name = "OTHER_PRODUCT_NAME")
    private String otherProductName;
    @Column(name = "PAPER_PRODUCT_ID")
    private Long paperProductId;
    @Column(name = "PAPER_PRODUCT_NAME")
    private String paperProductName;
    @Column(name = "PLASTIC_PRODUCT_ID")
    private Long plasticProductId;
    @Column(name = "PLASTIC_PRODUCT_NAME")
    private String plasticProductName;
    @Column(name = "USER_ID")
    private Long userId;

    public ProductInCartModel() {
    }

    public ProductInCartModel(Long aluminumProductId, String aluminumProductName, Long cardboardProductId, String cardboardProductName, Long otherProductId, String otherProductName, Long paperProductId, String paperProductName, Long plasticProductId, String plasticProductName, Long userId) {
        this.aluminumProductId = aluminumProductId;
        this.aluminumProductName = aluminumProductName;
        this.cardboardProductId = cardboardProductId;
        this.cardboardProductName = cardboardProductName;
        this.otherProductId = otherProductId;
        this.otherProductName = otherProductName;
        this.paperProductId = paperProductId;
        this.paperProductName = paperProductName;
        this.plasticProductId = plasticProductId;
        this.plasticProductName = plasticProductName;
        this.userId = userId;
    }

    /**
     * Getter and Setter
     */
    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long id) {
        this.cartId = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAluminumProductId() {
        return aluminumProductId;
    }

    public void setAluminumProductId(Long aluminumProductId) {
        this.aluminumProductId = aluminumProductId;
    }

    public String getAluminumProductName() {
        return aluminumProductName;
    }

    public void setAluminumProductName(String aluminumProductName) {
        this.aluminumProductName = aluminumProductName;
    }

    public Long getCardboardProductId() {
        return cardboardProductId;
    }

    public void setCardboardProductId(Long cardboardProductId) {
        this.cardboardProductId = cardboardProductId;
    }

    public String getCardboardProductName() {
        return cardboardProductName;
    }

    public void setCardboardProductName(String cardboardProductName) {
        this.cardboardProductName = cardboardProductName;
    }

    public Long getOtherProductId() {
        return otherProductId;
    }

    public void setOtherProductId(Long otherProductId) {
        this.otherProductId = otherProductId;
    }

    public String getOtherProductName() {
        return otherProductName;
    }

    public void setOtherProductName(String otherProductName) {
        this.otherProductName = otherProductName;
    }

    public Long getPaperProductId() {
        return paperProductId;
    }

    public void setPaperProductId(Long paperProductId) {
        this.paperProductId = paperProductId;
    }

    public String getPaperProductName() {
        return paperProductName;
    }

    public void setPaperProductName(String paperProductName) {
        this.paperProductName = paperProductName;
    }

    public Long getPlasticProductId() {
        return plasticProductId;
    }

    public void setPlasticProductId(Long plasticProductId) {
        this.plasticProductId = plasticProductId;
    }

    public String getPlasticProductName() {
        return plasticProductName;
    }

    public void setPlasticProductName(String plasticProductName) {
        this.plasticProductName = plasticProductName;
    }
}
