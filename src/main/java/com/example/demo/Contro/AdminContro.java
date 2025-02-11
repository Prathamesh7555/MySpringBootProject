package com.example.demo.Contro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Admin;
import com.example.demo.Entity.UserLogin;
import com.example.demo.Impl.AdminImpl;
import com.example.demo.Impl.UserLoginImpl;

@RestController
public class AdminContro {
	
	@Autowired
	private AdminImpl imp;
	
	@Autowired
	private UserLoginImpl uimp;
	
	
	@PostMapping("/adminsave")
	public ResponseEntity<?>regadmin(@RequestBody Admin admin){
		
		String aa=imp.registeradmin(admin);
		return new ResponseEntity<>(aa,HttpStatus.OK);
	}
	
	@PostMapping("/adminlogin")
	public ResponseEntity<?>loginadmin(@RequestBody Admin admin){
		String bb=imp.loginadmin(admin);
		return new ResponseEntity<>(bb,HttpStatus.OK);
	}
	
	@PostMapping("/logoutadmin/{adminame}")
	public ResponseEntity<?>logoutadmin(@PathVariable("adminname") String adminaname){
		String cc=imp.Logoutadmin(adminaname);
		return new ResponseEntity<>(cc,HttpStatus.OK);
		
		
		
	}
	
	@GetMapping("/deluser/{id}")
	public ResponseEntity<?>deleteuser(@PathVariable("id")Long id){
		String dd=uimp.deletebyid(id);
		return new ResponseEntity<>(dd,HttpStatus.OK);
	}
	
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<?>getuser(@PathVariable("id")Long id){
		
		String ee=uimp.getbyid(id);
		return new ResponseEntity<>(ee,HttpStatus.OK);
	}

}
