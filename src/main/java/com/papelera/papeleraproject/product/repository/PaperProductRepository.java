package com.papelera.papeleraproject.product.repository;

import com.papelera.papeleraproject.product.model.PaperProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PaperProductRepository extends JpaRepository<PaperProductDTO, Long> {

    @Query(value = "SELECT cp.PRODUCT_ID, cp.PRODUCT_NAME, cp.PRODUCT_QUANTITY_PRICE, cp.PRODUCT_UNIT_PRICE, cp.STATUS_ID, cp.FEATURED_ID " +
            "FROM PAPER_PRODUCT cp WHERE cp.STATUS_ID = :statusId", nativeQuery = true)
    List<PaperProductDTO> findProductByStatusId(@Param("statusId") Integer statusId);

    @Query(value = "SELECT cp.PRODUCT_ID, cp.PRODUCT_NAME, cp.PRODUCT_QUANTITY_PRICE, cp.PRODUCT_UNIT_PRICE, cp.STATUS_ID, cp.FEATURED_ID " +
            "FROM PAPER_PRODUCT cp WHERE cp.STATUS_ID = :featuredId", nativeQuery = true)
    List<PaperProductDTO> findProductByFeaturedStatusId(@Param("featuredId") Long statusId);
}
