package com.papelera.papeleraproject.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.papelera.papeleraproject.product.model.PizzaBoxProductModel;

import java.util.List;

public interface PizzaBoxProductRepository extends JpaRepository<PizzaBoxProductModel, Long> {

    @Query(value = "SELECT ppb.PRODUCT_ID, ppb.PRODUCT_DESCRIPTION, ppb.PRODUCT_PRICE, ppb.PRODUCT_UNIT_MEASUREMENT, ppb.PRODUCT_BTO " +
            "FROM PRODUCT_PIZZA_BOX ppb", nativeQuery = true)
    List<PizzaBoxProductModel> findAllPizzaProduct();

}