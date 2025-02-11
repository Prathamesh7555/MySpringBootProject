package com.example.demo.Contro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Entity.UserLogin;
import com.example.demo.Impl.UserLoginImpl;

@RestController
public class UserLoginContro {
	@Autowired
	private UserLoginImpl imp;
	
	@PostMapping("/save")
	public ResponseEntity<?>saveuser(@RequestBody UserLogin userlogin){
		String aa=imp.registeruser(userlogin);
		return new ResponseEntity<>(aa,HttpStatus.OK);
	}
	@GetMapping("/Login")
	public ResponseEntity<?>login(@RequestBody UserLogin userlogin){
		String bb=imp.loginuser(userlogin);
		return new ResponseEntity<>(bb,HttpStatus.OK);
	}
	@PostMapping("/Logout/{username}")
	public ResponseEntity<?>Logout(@PathVariable("username")String username){
		String cc=imp.logoutuser(username);
		return new ResponseEntity<>(cc,HttpStatus.OK);
	}
}


