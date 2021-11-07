package com.papelera.papeleraproject.product.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.papelera.papeleraproject.account.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name ="CART")
public class CartModel implements Serializable {

    @Id
    @Column(name ="CART_ID")
    private Long cartId;
    @ManyToOne
    @JoinColumn(name="CART_PRODUCT_ID" , referencedColumnName="PRODUCT_ID")
    private ProductModel productId;
    @JsonIgnore
    @OneToOne
    @JoinColumn(name="CART_USER_ID" , referencedColumnName="USER_ID")
    private User userId;
    @Column(name = "CART_PRICE")
    private Double cartPrice;
    @Column(name = "CART_PRODUCT_NAME")
    private String cartProductName;
    @Column(name = "CART_PRODUCT_QUANTITY")
    private Integer cartProductQuantity;



}
