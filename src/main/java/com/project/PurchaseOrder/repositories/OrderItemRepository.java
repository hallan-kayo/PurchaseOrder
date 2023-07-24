package com.project.PurchaseOrder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.PurchaseOrder.entities.OrderItem;
import com.project.PurchaseOrder.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
