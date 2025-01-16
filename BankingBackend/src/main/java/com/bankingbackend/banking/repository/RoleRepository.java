package com.bankingbackend.banking.repository;

import org.springframework.stereotype.Repository;

import com.bankingbackend.banking.entity.Role;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	public Role findByName(String name);

	public Role findById(long id);

	public void deleteById(long id);
	
	public List<Role> findAll();
}
