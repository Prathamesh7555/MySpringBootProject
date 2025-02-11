package com.example.demo.Repo;




import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Admin;
@Repository
public interface AdminRepo extends JpaRepository<Admin, Long>{
	Optional<Admin> findByadminname(String adminname);
  
}
