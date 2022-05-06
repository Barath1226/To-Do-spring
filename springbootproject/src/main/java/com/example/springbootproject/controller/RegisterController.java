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

import com.example.springbootproject.model.RegisterModel;
import com.example.springbootproject.repository.RegisterRepo;

@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RestController
public class RegisterController {
	
	@Autowired
	private RegisterRepo register;

	@PostMapping("add")
	public RegisterModel addregister(@RequestBody RegisterModel reg) {
		 return register.save(reg);
	}
	
	@PutMapping("edit")
	public RegisterModel editRegister(@RequestBody RegisterModel reg) {
		
		return register.save(reg);
	}
	
	@DeleteMapping("delete")
	public String deleteAllregister() {
		String result = " ";
		try {
			register.deleteAll();
			result = "Deleted Successfully ";
		}
	catch(Exception e) {
		result = "Error occured";
	}
	return result;
	}
	
	@GetMapping("getall")
	public List<RegisterModel> getall() {
		return register.findAll();
	}
	
}
