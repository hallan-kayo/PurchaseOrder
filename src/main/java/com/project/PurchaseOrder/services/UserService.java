package com.project.PurchaseOrder.services;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

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
	
	public User findById(Long id) {
		return userRepository.findById(id).get();
	}
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public User insertUser(User user) {
		return userRepository.save(user);
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	public User updateUser(Long id, User user) {
		User result = userRepository.getReferenceById(id);
		BeanUtils.copyProperties(user, result, "id");
		return userRepository.save(result);
	}
}
