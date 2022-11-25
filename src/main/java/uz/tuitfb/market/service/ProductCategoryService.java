package uz.tuitfb.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.tuitfb.market.entity.ProductCategory;
import uz.tuitfb.market.repository.ProductCategoryRepository;

@Service
public class ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    public ProductCategory save(ProductCategory productCategory){
        if(productCategory.getId()!=null){
            return productCategoryRepository.save(productCategory);
        }
        throw new RuntimeException("this object exist ");

    }
}
