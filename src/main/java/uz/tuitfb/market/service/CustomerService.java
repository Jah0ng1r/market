package uz.tuitfb.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.tuitfb.market.entity.Customer;
import uz.tuitfb.market.repository.CystomerRepository;

import java.util.List;

@Service
public class CustomerService {
    private final CystomerRepository cystomerRepository;

    @Autowired
    public CustomerService(CystomerRepository cystomerRepository) {
        this.cystomerRepository = cystomerRepository;
    }

    public void saveAll(List<Customer> customerList) {
        if (customerList != null && customerList.size() > 0) {
            cystomerRepository.saveAll(customerList);
        }
    }
}
