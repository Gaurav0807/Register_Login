package com.example.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.model.User;
import com.example.demo.web.dto.UserRegister;

public interface UserService extends UserDetailsService{
	
	User save(UserRegister u);

}
