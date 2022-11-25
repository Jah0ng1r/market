package uz.tuitfb.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.tuitfb.market.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
}
