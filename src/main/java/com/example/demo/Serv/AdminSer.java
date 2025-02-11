package com.example.demo.Serv;

import com.example.demo.Entity.Admin;

public interface AdminSer {
	
	public String registeradmin(Admin admin);
	public String loginadmin(Admin admin);
	
	public String Logoutadmin(String adminname);



}
