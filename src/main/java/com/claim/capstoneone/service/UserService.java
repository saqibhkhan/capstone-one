package com.claim.capstoneone.service;

import java.util.List;
import java.util.Optional;

import com.claim.capstoneone.model.Users;

public interface UserService {
	
	Optional<Users> findById(Long id);
	
	Optional<Users> findEmail(String email);
	
	Optional<Users> login (String email, String password);
	
	List<Users> findByLastName(String lname);
	
	List<Users> findByName(String name);
	
	List<Users> findAll();
	
	void delete(Long id);
	
	void updateUser(Users user, Long id);
	
	void updateRole(String role, Long id);
	
	void resetPassword(String password, Long id);
	
	void save(Users user);
	

}
