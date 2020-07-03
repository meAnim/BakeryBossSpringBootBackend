package com.eshlon.BakeryBoss.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eshlon.BakeryBoss.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByEmail(String email);
	
	User findById(int id);
	
}
