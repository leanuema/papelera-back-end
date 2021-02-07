package com.papelera.papeleraproject.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.papelera.papeleraproject.product.model.PizzaBoxProductModel;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface PizzaBoxProductRepository extends JpaRepository<PizzaBoxProductModel, Long> {

    @Query(value = "SELECT ppb.PRODUCT_ID, ppb.PRODUCT_NAME, ppb.PRODUCT_QUANTITY_PRICE, ppb.PRODUCT_UNIT_PRICE, ppb.STATUS_ID " +
            "FROM PRODUCT_PIZZA_BOX ppb", nativeQuery = true)
    List<PizzaBoxProductModel> findAllPizzaProduct();

    @Query(value = "SELECT ppb.PRODUCT_ID, ppb.PRODUCT_NAME, ppb.PRODUCT_QUANTITY_PRICE, ppb.PRODUCT_UNIT_PRICE, ppb.STATUS_ID " +
            "FROM PRODUCT_PIZZA_BOX ppb WHERE ppb.STATUS_ID = :statusId", nativeQuery = true)
    List<PizzaBoxProductModel> findProductByStatusId(@Param("statusId") Integer statusId);
}