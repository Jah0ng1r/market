package uz.tuitfb.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.tuitfb.market.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
