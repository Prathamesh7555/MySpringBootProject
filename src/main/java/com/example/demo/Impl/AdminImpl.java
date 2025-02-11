package com.example.demo.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Admin;
import com.example.demo.Repo.AdminRepo;
import com.example.demo.Serv.AdminSer;
@Service
public class AdminImpl implements AdminSer {
	
	@Autowired
	private AdminRepo repo;

	@Override
	public String registeradmin(Admin admin) {
		// TODO Auto-generated method stub
		Optional<Admin> exadmin=repo.findByadminname(admin.getAdminname());
		if(exadmin.isPresent())
		{
			return "This alerdy register";
		}
		repo.save(admin);
		return "new admin register"+admin.getAdminname();
	}

	@Override
	public String loginadmin(Admin admin) {
		Optional<Admin>exadmin=repo.findByadminname(admin.getAdminname());
		if(exadmin.isPresent() && exadmin.get().getAdminpass().equals(admin.getAdminpass())){
			return "login sucessfull";
			
		}
		return "invalid login admin password and username";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String Logoutadmin(String adminname) {
		// TODO Auto-generated method stub
		
		Optional<Admin>exadmin=repo.findByadminname(adminname);
		if(exadmin.isPresent()) {
			return "user"+adminname+"as been logout   bhuummmm";
		}
		return "Not found admin";
		
		
	}

}
