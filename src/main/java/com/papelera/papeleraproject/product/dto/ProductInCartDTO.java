package com.papelera.papeleraproject.product.dto;

import java.io.Serializable;

public class ProductInCartDTO implements Serializable {

    private static final long serialVersionUID = -250456501243097773L;

    private Long cartId;
    private Long aluminumProductId;
    private String aluminumProductName;
    private Long cardboardProductId;
    private String cardboardProductName;
    private Long otherProductId;
    private String otherProductName;
    private Long paperProductId;
    private String paperProductName;
    private Long plasticProductId;
    private String plasticProductName;
    private Long userId;

    public ProductInCartDTO() {
    }

    public ProductInCartDTO(Long cartId, Long aluminumProductId, String aluminumProductName, Long cardboardProductId, String cardboardProductName, Long otherProductId, String otherProductName, Long paperProductId, String paperProductName, Long plasticProductId, String plasticProductName, Long userId) {
        this.cartId = cartId;
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

    public void setCartId(Long cartId) {
        this.cartId = cartId;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
