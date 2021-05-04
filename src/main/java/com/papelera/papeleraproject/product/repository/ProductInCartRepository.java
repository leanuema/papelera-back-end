package com.papelera.papeleraproject.product.repository;

import com.papelera.papeleraproject.product.model.ProductInCartModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductInCartRepository extends JpaRepository<ProductInCartModel, Long> {

    @Query(value = "SELECT cp.ALUMINUM_PRODUCT_ID, " +
            "cp.ALUMINUM_PRODUCT_NAME, " +
            "cp.CARDBOARD_PRODUCT_ID, " +
            "cp.CARDBOARD_PRODUCT_NAME, " +
            "cp.OTHER_PRODUCT_ID, " +
            "cp.OTHER_PRODUCT_NAME, " +
            "cp.PAPER_PRODUCT_ID, " +
            "cp.PAPER_PRODUCT_NAME, " +
            "cp.PLASTIC_PRODUCT_ID, " +
            "cp.PLASTIC_PRODUCT_NAME " +
            "FROM CART_PRODUCT cp WHERE cp.USER_ID = :userId", nativeQuery = true)
    List<ProductInCartModel> findProductByUserId(@Param("userId") Long userId);

}