package com.project.PurchaseOrder.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.PurchaseOrder.entities.User;
import com.project.PurchaseOrder.repositories.UserRepository;
import com.project.PurchaseOrder.services.exceptions.DatabaseException;
import com.project.PurchaseOrder.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

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
		return userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(id));
	}
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public User insertUser(User user) {
		return userRepository.save(user);
	}
	
	public void deleteUser(Long id) {
		try {
			userRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			// TODO: handle exception
			throw new ResourceNotFoundException(id);
		} catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User updateUser(Long id, User user) {
		try {
			User entity = userRepository.getReferenceById(id);
			updateData(entity, user);
			return userRepository.save(entity);
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
			throw new ResourceNotFoundException(id);
		}
	}
	
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
