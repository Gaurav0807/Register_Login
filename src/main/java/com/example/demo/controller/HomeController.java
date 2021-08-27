package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.UserService;
import com.example.demo.web.dto.UserRegister;


@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;

	public HomeController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	@ModelAttribute("user")
	public UserRegister userRegister()
	{
		return new UserRegister();
	}
	
	
	@GetMapping("/register")
	public String showRegistrationForm()
	{
		return "register";
	}
	
	@PostMapping("/register")
	public String registerAccount(@ModelAttribute("user") UserRegister r)
	{
	userService.save(r);
	return "redirect:/register?success";
	}
	
	
	

}
