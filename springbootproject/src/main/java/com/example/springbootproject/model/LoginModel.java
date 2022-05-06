package com.example.springbootproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class LoginModel {
	@Id
	private String emailaddress;
	private String password;
	public LoginModel(String emailaddress, String password) {
		super();
		this.setEmailaddress(emailaddress);
		this.setPassword(password);
}
	
	public LoginModel() {
		super();
	}

	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}