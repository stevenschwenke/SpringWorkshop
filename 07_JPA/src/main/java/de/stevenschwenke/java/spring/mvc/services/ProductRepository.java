package de.stevenschwenke.java.spring.mvc.services;

import de.stevenschwenke.java.spring.mvc.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
