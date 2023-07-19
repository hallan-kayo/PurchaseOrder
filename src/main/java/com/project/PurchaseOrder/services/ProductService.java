package com.project.PurchaseOrder.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.PurchaseOrder.entities.Product;
import com.project.PurchaseOrder.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Transactional
	public List<Product> findAll() {
		List<Product> result = productRepository.findAll();
		return result;
	}
}
