package com.claim.capstoneone.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.claim.capstoneone.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	
	//Users findByEmail(String email);
	
	@Query("FROM Users WHERE lname=?1")
	List<Users> findByLastName(String lname);
	
	@Query("FROM Users WHERE lname=?1 or fname=?1")
	List<Users> findByName(String name);
	
	@Query("FROM Users WHERE email=?1")
	Optional<Users> findEmail(String email);
	
	@Query("FROM Users WHERE email=?1 AND password=?2")
	Optional<Users> login(String email, String password);
	
	Users findByEmail(String email);
	
}
