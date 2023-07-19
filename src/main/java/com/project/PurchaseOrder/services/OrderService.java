package com.project.PurchaseOrder.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.PurchaseOrder.entities.Order;
import com.project.PurchaseOrder.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Transactional
	public List<Order> findAll(){
		List<Order> result = orderRepository.findAll();
		return result;
	}
}
