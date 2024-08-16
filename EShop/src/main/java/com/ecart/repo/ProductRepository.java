
package com.ecart.repo;
import java.util.List;
import java.util.Locale.Category;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecart.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

 List<Product> findAllByCategory(Category category);
}

