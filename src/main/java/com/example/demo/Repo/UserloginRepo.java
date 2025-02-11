package com.example.demo.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.UserLogin;

import java.util.Optional;


@Repository
public interface UserloginRepo extends JpaRepository<UserLogin,Long> {
	
	Optional<UserLogin> findByUsername(String username);
	

	

}
