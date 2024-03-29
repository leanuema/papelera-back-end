package com.papelera.papeleraproject.product.repository;

import com.papelera.papeleraproject.product.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {

    @Query(value = "SELECT * " +
            "FROM PRODUCT p WHERE p.STATUS_ID = :statusId", nativeQuery = true)
    List<ProductModel> findProductByStatusId(@Param("statusId") Integer statusId);

    @Query(value = "SELECT * " +
            "FROM PRODUCT p WHERE p.FEATURED_ID = :featuredId", nativeQuery = true)
    List<ProductModel> findProductByFeaturedStatusId(@Param("featuredId") Long statusId);

    @Query(value = "SELECT * " +
            "FROM PRODUCT p WHERE p.CATEGORY_ID = 1", nativeQuery = true)
    List<ProductModel> findAllAluminumByCategoryId();

    @Query(value = "SELECT * " +
            "FROM PRODUCT p WHERE p.CATEGORY_ID = 2", nativeQuery = true)
    List<ProductModel> findAllCardboardByCategoryId();

    @Query(value = "SELECT * " +
            "FROM PRODUCT p WHERE p.CATEGORY_ID = 3", nativeQuery = true)
    List<ProductModel> findAllOtherByCategoryId();

    @Query(value = "SELECT * " +
            "FROM PRODUCT p WHERE p.CATEGORY_ID = 4", nativeQuery = true)
    List<ProductModel> findAllPaperByCategoryId();

    @Query(value = "SELECT * " +
            "FROM PRODUCT p WHERE p.CATEGORY_ID = 5", nativeQuery = true)
    List<ProductModel> findAllPlasticByCategoryId();

    @Query(value = "SELECT * FROM PRODUCT p WHERE p.PRODUCT_NAME LIKE :productName", nativeQuery = true)
    List<ProductModel> findProductByProductName(@Param("productName") String productName) throws Exception;
}
