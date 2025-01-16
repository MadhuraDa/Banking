package com.bankingbackend.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankingbackend.banking.entity.Role;
import com.bankingbackend.banking.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	
	@GetMapping("/roles")
	public List<Role> getRoles() {
		return roleService.findAll();
	}
	
	
	@PostMapping(value="/addRole", consumes="application/json")
	public Role addRole(@RequestBody Role role) {
		return roleService.addRole(role);
	}
}
