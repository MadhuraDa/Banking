package com.bankingbackend.banking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankingbackend.banking.entity.Role;
import com.bankingbackend.banking.repository.RoleRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RoleService {

	@Autowired
	RoleRepository roleRepository;
	
	
	public List<Role> findAll() {
		return roleRepository.findAll();
	}
	
	public Role addRole(Role role) {
		return roleRepository.save(role);
	}
}
