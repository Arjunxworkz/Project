package com.xworkz.userData.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.userData.dto.UserDataDTO;
import com.xworkz.userData.service.UserService;

@Controller
@RequestMapping("/log")
public class LogInController {
	@Autowired
	private UserService userService;
	int count = 0;
	boolean blockEmail;
	
	public LogInController() {
		System.out.println("LogIn controller is calling");
	}
	
	@PostMapping
	public String login(UserDataDTO userDataDTO,Model model,String email,String password) {
		
		System.out.println("log in method is calling");
	
		
		if(userDataDTO!=null) {
			
			boolean eemail=userService.getByEmail(userDataDTO.getEmail());
			blockEmail=eemail;
			boolean findByemailAndPassword=userService.getLogInByEmailAndPassword(userDataDTO.getEmail(), userDataDTO.getPassword());
			if(eemail) {
				
				model.addAttribute("msg", "Your are typing wrong Email");
				return "logIn";
				
			}else if(findByemailAndPassword) {
				
				model.addAttribute("msg", "You are Login Susseccfully ");
				return "index";
				
			}
			else {
				if(6>count) {
					boolean accountBlockEmail=userService.getByEmail(userDataDTO.getEmail());
					
					if(blockEmail==accountBlockEmail) {

						model.addAttribute("msg", "You are typing wrong password");
						
						count++;
						
						
						System.out.println(count);
						return "logIn";
					}else{
						model.addAttribute("msg", "Its another email ,You are typing wrong password");
						
						count++;
						
						
						System.out.println(count);
						return "logIn";
					}
				
			
				
				
				
					
					
				
				}
			
	
			
			}
			
//		if(email!=userDataDTO.getEmail()) {
//			model.addAttribute("msg", "Your are typing wrong Email");
//			return "signUp";
//		}
//		else if(password!=userDataDTO.getPassword()) {
//			model.addAttribute("msg", "Your are typing wrong Password");
//			return "signUp";
//		}
//		else if(findByemailAndPassword) {
//			model.addAttribute("msg", "You are Login Susseccfully ");
//			return "index";
//		}
//		else {
//			model.addAttribute("msg", "You are typing wrong");
//			return "logIn";
//		}
		}
		return null;
			
		
		
	}
	
	
}
