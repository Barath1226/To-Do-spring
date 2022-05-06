package com.example.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootproject.model.RegisterModel;

@Repository
public interface RegisterRepo extends JpaRepository<RegisterModel,String> {


	     
}
