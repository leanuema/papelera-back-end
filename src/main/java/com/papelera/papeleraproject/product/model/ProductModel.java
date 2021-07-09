package com.papelera.papeleraproject.product.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "PRODUCT")
public class ProductModel implements Serializable {

    private static final long serialVersionUID = -3825668381843408692L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
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
    @Column(name = "CATEGORY_ID")
    private Long categoryId;

}
