package com.project.PurchaseOrder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.PurchaseOrder.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
