package uz.tuitfb.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.tuitfb.market.entity.Customer;

@Repository
public interface CystomerRepository extends JpaRepository<Customer, Integer> {

}
