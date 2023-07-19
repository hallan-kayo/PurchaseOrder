package com.project.PurchaseOrder.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.PurchaseOrder.entities.User;
import com.project.PurchaseOrder.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public List<User> findAll(){
		List<User> result = userRepository.findAll();
		return result;
	}
}
