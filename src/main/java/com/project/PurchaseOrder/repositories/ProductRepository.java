package com.project.PurchaseOrder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.PurchaseOrder.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
