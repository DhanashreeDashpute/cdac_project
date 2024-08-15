package com.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecart.model.ProductCategory;
import com.ecart.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<ProductCategory> getAllCategory() {
        return categoryService.getAllCategory();
    }

    @PostMapping
    public ProductCategory addCategory(@RequestBody ProductCategory category) {
        return categoryService.addCategory(category);
    }
    
//    @DeleteMapping
//    public ProductCategory deleteCategory(Long id)
//    {
//		return categoryService.;
//             
//    }
    
    
   
}
