package com.example.demo.Serv;

import com.example.demo.Entity.UserLogin;

public interface UserloginSer {
	
	public String registeruser(UserLogin userlogin);
	public String loginuser(UserLogin userlogin);
	public String logoutuser(String username);

}
