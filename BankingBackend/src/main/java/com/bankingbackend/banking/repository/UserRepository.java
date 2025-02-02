package com.bankingbackend.banking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingbackend.banking.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public List<User> findAll();
	
	public User findByEmail(String email);
	
	public User findByEmailAndPassword(String email, String password);
	
	public User findById(long id);
	
	public void deleteById(long id);
	
	
}