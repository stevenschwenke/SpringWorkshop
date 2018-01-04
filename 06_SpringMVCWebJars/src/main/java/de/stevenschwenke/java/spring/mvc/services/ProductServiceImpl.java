package de.stevenschwenke.java.spring.mvc.services;

import de.stevenschwenke.java.spring.mvc.domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    /**
     * Map to simulate a database
     */
    private Map<Integer, Product> products;

    public ProductServiceImpl() {
        loadProducts();
    }

    @Override
    public List<Product> listAllProducts() {
        return new ArrayList<>(products.values());
    }

    private void loadProducts() {
        products = new HashMap<>();

        Product product1 = new Product();
        product1.setId(1);
        product1.setDescription("Product 1");
        product1.setPrice(new BigDecimal(12.99));
        product1.setImageUrl("http://example.com/product1");
        products.put(1, product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setDescription("Product 2");
        product2.setPrice(new BigDecimal(14.99));
        product2.setImageUrl("http://example.com/product2");
        products.put(2, product2);

        Product product3 = new Product();
        product3.setId(3);
        product3.setDescription("Product 3");
        product3.setPrice(new BigDecimal(34.99));
        product3.setImageUrl("http://example.com/product3");
        products.put(3, product3);

        Product product4 = new Product();
        product4.setId(4);
        product4.setDescription("Product 4");
        product4.setPrice(new BigDecimal(44.99));
        product4.setImageUrl("http://example.com/product4");
        products.put(4, product4);
    }
}
