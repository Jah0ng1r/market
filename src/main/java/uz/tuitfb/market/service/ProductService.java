package uz.tuitfb.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.tuitfb.market.entity.Product;
import uz.tuitfb.market.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    public Product save(Product product) {
        if (product.getId() != null) {
            return productRepository.save(product);
        }
        throw new RuntimeException("this object exist");
    }

    public Product update(Product product) {
        if (product.getId() == null) {
            return productRepository.save(product);
        }
        throw new RuntimeException("this object not exist");
    }
}
