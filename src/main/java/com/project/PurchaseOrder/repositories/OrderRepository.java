package com.project.PurchaseOrder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.PurchaseOrder.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
