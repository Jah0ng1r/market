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
        cystomerRepository.saveAll(customerList);

    }

    public void save(Customer customer) {
        cystomerRepository.save(customer);
    }

    public List<Customer> findAll() {
        return cystomerRepository.findAll();
    }

    public Customer findByCustomerId(Integer customerId) {
        if (customerId != null) {
            return cystomerRepository
                    .findById(customerId)
                    .orElseThrow(() -> new IllegalArgumentException("could not found customer by id"));
        }
        return null;

    }

}
