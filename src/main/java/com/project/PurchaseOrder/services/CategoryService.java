package com.project.PurchaseOrder.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.PurchaseOrder.entities.Category;
import com.project.PurchaseOrder.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Transactional
	public List<Category> findAll(){
		List<Category> result = categoryRepository.findAll();
		return result;
	}
}
