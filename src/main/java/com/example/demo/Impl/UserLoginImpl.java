package com.example.demo.Impl;


import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserLogin;
import com.example.demo.Repo.UserloginRepo;
import com.example.demo.Serv.UserloginSer;
@Service
public class UserLoginImpl implements UserloginSer {
	@Autowired
	private UserloginRepo rep;
	

	@Override
	public String registeruser(UserLogin userlogin) {
		// TODO Auto-generated method stub
		Optional<UserLogin>exituser=rep.findByUsername(userlogin.getUsername());
		if(exituser.isPresent()) {
			return "This is user alerdy registerd";
		}
		rep.save(userlogin);
		return"user registerd done of"+userlogin.getUsername(); 
	}

	@Override
	public String loginuser(UserLogin userlogin) {
		// TODO Auto-generated method stub
		
		Optional<UserLogin>exituser=rep.findByUsername(userlogin.getUsername());
		if(exituser.isPresent() && exituser.get().getPassword().equals(userlogin.getPassword()))
		{
			return "login sucessfull";
			
		}
		return "invalid login password and username";
	
	}

	@Override
	public String logoutuser(String username) {
		// TODO Auto-generated method stub
		Optional<UserLogin>exituser=rep.findByUsername(username);
		if(exituser.isPresent()) {
			return "user"+username+"as been logout   bhuummmm";
		}
		return "not found";
		
	}
	
	public String deletebyid(long id) {
		if(rep.existsById(id)) {
			rep.deleteById(id);
			return"this"+id+"user deleted";
		}
		return "the user not found";
	}
		
	public String getbyid(Long id){
		
		if(rep.existsById(id)) {
			rep.findById(id);
			return "this "+id+"get";
		}
		return "this"+id+" not found   ";
		

	}
}
