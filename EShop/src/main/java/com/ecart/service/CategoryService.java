package com.ecart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecart.model.ProductCategory;
import com.ecart.repo.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	 
	public List<ProductCategory> getAllCategory(){
		return categoryRepository.findAll();
	}
	
	public ProductCategory addCategory(ProductCategory category) {
        return categoryRepository.save(category);
    }

}
