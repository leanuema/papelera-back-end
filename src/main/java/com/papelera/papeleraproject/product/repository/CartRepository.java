package com.papelera.papeleraproject.product.repository;

import com.papelera.papeleraproject.product.model.CartModel;
import com.papelera.papeleraproject.product.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CartRepository extends JpaRepository<CartModel,Long> {
    @Query(value = "SELECT MAX(CART_ID) FROM CART ", nativeQuery = true)
    Long findLastCartId();

    @Query(value = "SELECT * " +
            "FROM CART p WHERE p.CART_USER_ID = :userId", nativeQuery = true)
    List<CartModel> findCartProductByUserId(@Param("userId") Long productId);

}
