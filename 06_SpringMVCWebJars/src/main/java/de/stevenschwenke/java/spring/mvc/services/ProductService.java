package de.stevenschwenke.java.spring.mvc.services;

import de.stevenschwenke.java.spring.mvc.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProducts();
}
