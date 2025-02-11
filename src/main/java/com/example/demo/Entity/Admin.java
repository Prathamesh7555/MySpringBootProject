package com.example.demo.Entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String adminname;
	private String adminpass;
	
	@OneToOne(mappedBy = "admin",cascade = CascadeType.ALL)
	
	private UserLogin userLogin;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getAdminpass() {
		return adminpass;
	}

	public void setAdminpass(String adminpass) {
		this.adminpass = adminpass;
	}

	public UserLogin getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", adminname=" + adminname + ", adminpass=" + adminpass + ", userLogin=" + userLogin
				+ "]";
	}

	
	
	
	
	
	
	
	
	

}
