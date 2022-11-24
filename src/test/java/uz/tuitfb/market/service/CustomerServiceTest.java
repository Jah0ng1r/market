package uz.tuitfb.market.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import uz.tuitfb.market.MainTest;
import uz.tuitfb.market.entity.Customer;
import uz.tuitfb.market.repository.CystomerRepository;

import java.util.List;

class CustomerServiceTest implements MainTest {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CystomerRepository cystomerRepository;
    List<Customer> customerList;

    @Test
    void saveAll() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findByCustomerId() {
    }
}