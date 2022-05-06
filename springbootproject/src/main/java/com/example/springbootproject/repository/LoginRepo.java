package com.example.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootproject.model.LoginModel;

@Repository

public interface LoginRepo extends JpaRepository<LoginModel,String> {

}
