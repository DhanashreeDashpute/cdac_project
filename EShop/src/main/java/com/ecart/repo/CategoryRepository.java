package com.ecart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecart.model.ProductCategory;

public interface CategoryRepository extends JpaRepository<ProductCategory, Long> {


}
