package com.bankingbackend.banking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bankingbackend.banking.entity.Role;
import com.bankingbackend.banking.entity.User;
import com.bankingbackend.banking.exception.UserNotFoundException;
import com.bankingbackend.banking.repository.RoleRepository;
import com.bankingbackend.banking.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	public ResponseEntity<List<User>> getUsers() {
		 userRepository.findAll();
		 return ResponseEntity.ok().body(userRepository.findAll());
	}
	
	
	public User getUserById(Long userId) {
		return userRepository.findById(userId)
				.orElseThrow(() -> new UserNotFoundException("User not found with id: " + userId));
	}
	
	public User addUser(User user) {
	    // Save the user
	    userRepository.save(user);
		return userRepository.save(user);
	}
	

}
