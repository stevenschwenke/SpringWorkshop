package de.stevenschwenke.java.spring.mvc.services;

import de.stevenschwenke.java.spring.mvc.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Profile("springdatajpa")
public class ProductServiceSpringDataJpaImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceSpringDataJpaImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findOne(id);
    }

    @Override
    public Product saveOrUpdate(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.delete(id);
    }
}
