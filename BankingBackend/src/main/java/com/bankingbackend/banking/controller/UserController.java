package com.bankingbackend.banking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankingbackend.banking.entity.User;
import com.bankingbackend.banking.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers() {
		return userService.getUsers();
	}
	
	
	@PostMapping(value="/addUser", consumes="application/json")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		 return ResponseEntity.ok().body(userService.addUser(user));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId) {
                return ResponseEntity.ok().body(userService.getUserById(userId));
    }
	}
	

