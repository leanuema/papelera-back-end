package com.papelera.papeleraproject.product.repository;

import com.papelera.papeleraproject.product.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {

    @Query(value = "SELECT p.PRODUCT_ID, p.PRODUCT_NAME, p.PRODUCT_QUANTITY_PRICE, p.PRODUCT_UNIT_PRICE, p.STATUS_ID, p.FEATURED_ID " +
            "FROM PRODUCT p WHERE p.STATUS_ID = :statusId", nativeQuery = true)
    List<ProductModel> findProductByStatusId(@Param("statusId") Integer statusId);

    @Query(value = "SELECT p.PRODUCT_ID, p.PRODUCT_NAME, p.PRODUCT_QUANTITY_PRICE, p.PRODUCT_UNIT_PRICE, p.STATUS_ID, p.FEATURED_ID " +
            "FROM PRODUCT p WHERE p.FEATURED_ID = :featuredId", nativeQuery = true)
    List<ProductModel> findProductByFeaturedStatusId(@Param("featuredId") Long statusId);

    @Query(value = "SELECT p.PRODUCT_ID, p.PRODUCT_NAME, p.PRODUCT_QUANTITY_PRICE, p.PRODUCT_UNIT_PRICE, p.STATUS_ID, p.FEATURED_ID " +
            "FROM PRODUCT p WHERE p.CATEGORY_ID = 1", nativeQuery = true)
    List<ProductModel> findAllAluminumByCategoryId();

    @Query(value = "SELECT p.PRODUCT_ID, p.PRODUCT_NAME, p.PRODUCT_QUANTITY_PRICE, p.PRODUCT_UNIT_PRICE, p.STATUS_ID, p.FEATURED_ID " +
            "FROM PRODUCT p WHERE p.CATEGORY_ID = 2", nativeQuery = true)
    List<ProductModel> findAllCardboardByCategoryId();

    @Query(value = "SELECT p.PRODUCT_ID, p.PRODUCT_NAME, p.PRODUCT_QUANTITY_PRICE, p.PRODUCT_UNIT_PRICE, p.STATUS_ID, p.FEATURED_ID " +
            "FROM PRODUCT p WHERE p.CATEGORY_ID = 3", nativeQuery = true)
    List<ProductModel> findAllOtherByCategoryId();

    @Query(value = "SELECT p.PRODUCT_ID, p.PRODUCT_NAME, p.PRODUCT_QUANTITY_PRICE, p.PRODUCT_UNIT_PRICE, p.STATUS_ID, p.FEATURED_ID " +
            "FROM PRODUCT p WHERE p.CATEGORY_ID = 4", nativeQuery = true)
    List<ProductModel> findAllPaperByCategoryId();

    @Query(value = "SELECT p.PRODUCT_ID, p.PRODUCT_NAME, p.PRODUCT_QUANTITY_PRICE, p.PRODUCT_UNIT_PRICE, p.STATUS_ID, p.FEATURED_ID " +
            "FROM PRODUCT p WHERE p.CATEGORY_ID = 5", nativeQuery = true)
    List<ProductModel> findAllPlasticByCategoryId();
}
