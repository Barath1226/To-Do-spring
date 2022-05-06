package com.example.springbootproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootproject.model.LoginModel;
import com.example.springbootproject.repository.LoginRepo;

@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RestController
public class LoginController {
         
	
	@Autowired
	private LoginRepo login;
	
	@PostMapping("add1")
	public LoginModel addlogin(@RequestBody LoginModel log) {
		 return login.save(log);
	}
	
	@PutMapping("edit2")
	public LoginModel editlogin(@RequestBody LoginModel log) {
		return login.save(log);
	}
	
	@DeleteMapping("delete3")
	public String deleteAllLogin() {
		String result = " ";
		try {
			login.deleteAll();
			result = "Deleted Successfully ";
		}
	catch(Exception e) {
		result = "Error occured";
	}
	return result;
	}
	
	@GetMapping("getall4")
	public List<LoginModel> getall() {
		return login.findAll();
	}
	
}
