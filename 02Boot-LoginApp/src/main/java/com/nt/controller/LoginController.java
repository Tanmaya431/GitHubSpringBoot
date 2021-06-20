package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.entity.User;
import com.nt.service.ILoginService;
@Controller
public class LoginController {
	
	@Autowired
	private ILoginService service;
	
	@GetMapping("/login")
	public String showHome(@ModelAttribute("userForm") User user) {
		return "login_form";
	}
	
	@PostMapping("/login")
	public String processRequest(Map<String,Object> map, @ModelAttribute("userForm") User user) {
		//use service
		String result=service.validate(user);
		//Keep result in model attribute
		map.put("resultMsg", result);
		return "login_form";
	}

}
