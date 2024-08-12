package com.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecart.model.ProductCategory;
import com.ecart.service.ProductCategoryService;

@RestController
@RequestMapping("/api/product-categories")
public class ProductCategoryController {
    
    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping
    public List<ProductCategory> getAllCategories() {
        return productCategoryService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductCategory> getCategoryById(@PathVariable Long id) {
        ProductCategory category = productCategoryService.findById(id);
        if (category != null) {
            return ResponseEntity.ok(category);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ProductCategory createCategory(@RequestBody ProductCategory productCategory) {
        return productCategoryService.save(productCategory);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductCategory> updateCategory(@PathVariable Long id, @RequestBody ProductCategory categoryDetails) {
        ProductCategory category = productCategoryService.findById(id);
        if (category != null) {
            category.setName(categoryDetails.getName());
            return ResponseEntity.ok(productCategoryService.save(category));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        ProductCategory category = productCategoryService.findById(id);
        if (category != null) {
            productCategoryService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
