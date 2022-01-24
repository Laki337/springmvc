package com.example.springboot.controller;

import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(value = "/")
	public String printWelcome(Model model) {
		
		model.addAttribute("users", userService.getUsers());
		return "index";
	}
}
