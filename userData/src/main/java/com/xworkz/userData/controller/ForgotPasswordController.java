package com.xworkz.userData.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.userData.dto.UserDataDTO;
import com.xworkz.userData.service.UserService;



@Controller
@RequestMapping("/for")
public class ForgotPasswordController {
	@Autowired
	private UserService userService;

	
	ForgotPasswordController(){
		System.out.println("ForgotPasswordController is running");
	}
	@PostMapping
	public String onForgot(UserDataDTO userDataDTO,Model model) {
		System.out.println(userDataDTO);
		if(userDataDTO!=null) {
		boolean mail=userService.getByEmail(userDataDTO.getEmail());
		if(!mail) {
			boolean forgotBymail=userService.forgotByEmail(userDataDTO.getEmail(), userDataDTO.getPassword());
			model.addAttribute("msg","your password has been changed");
			return "signUp";
		}
		else {
			model.addAttribute("msg","your Email Dose not Exits");
			return "signUp";
		}
		
		
		
		
		}
		return null;
		
	}
	
}
