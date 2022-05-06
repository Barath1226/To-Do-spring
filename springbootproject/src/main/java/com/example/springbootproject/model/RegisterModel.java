package com.example.springbootproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RegisterModel {
	@Id
	private String fullname;
	private String mobilenumber;
	private String emailaddress;
	private String password;
	public RegisterModel(String fullname, String mobilenumber, String emailaddress, String password) {
		super();
		this.fullname = fullname;
		this.mobilenumber = mobilenumber;
		this.emailaddress = emailaddress;
		this.password = password;
	}
	public RegisterModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
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
