package repository;

import model.PizzaBoxProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PizzaBoxProductRepository extends JpaRepository<PizzaBoxProductModel, Long> {

    List<PizzaBoxProductModel> findAllPizzaProduct();
}
