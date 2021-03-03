package com.papelera.papeleraproject.product.repository;

import com.papelera.papeleraproject.product.model.AluminumProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AluminumProductRepository extends JpaRepository<AluminumProductModel, Long> {

    @Query(value = "SELECT cp.PRODUCT_ID, cp.PRODUCT_NAME, cp.PRODUCT_QUANTITY_PRICE, cp.PRODUCT_UNIT_PRICE, cp.STATUS_ID, cp.FEATURED_ID " +
            "FROM ALUMINUM_PRODUCT cp WHERE cp.STATUS_ID = :statusId", nativeQuery = true)
    List<AluminumProductModel> findProductByStatusId(@Param("statusId") Integer statusId);

    @Query(value = "SELECT cp.PRODUCT_ID, cp.PRODUCT_NAME, cp.PRODUCT_QUANTITY_PRICE, cp.PRODUCT_UNIT_PRICE, cp.STATUS_ID, cp.FEATURED_ID " +
            "FROM ALUMINUM_PRODUCT cp WHERE cp.STATUS_ID = :featuredId", nativeQuery = true)
    List<AluminumProductModel> findProductByFeaturedStatusId(@Param("featuredId") Long statusId);
}
