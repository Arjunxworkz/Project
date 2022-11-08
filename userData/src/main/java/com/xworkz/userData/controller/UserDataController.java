package com.xworkz.userData.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.userData.dto.UserDataDTO;
import com.xworkz.userData.service.UserService;

@Controller
@RequestMapping("/user")
public class UserDataController {

	@Autowired
	private UserService userService;

	public UserDataController() {
		System.out.println("Controller is running");
	}

	@PostMapping
	public String onSave(UserDataDTO userDataDTO, Model model) {

		System.out.println("calling onsave method");
		System.out.println(userDataDTO);
		if (userDataDTO != null) {
			boolean findByEmail = userService.getByEmail(userDataDTO.getEmail());
			if (!findByEmail) {//allready exist
				model.addAttribute("msg", "Email is Already exits ,You Are Unable To Save");

			} else {
				boolean validateAndSave = userService.saveAndValidate(userDataDTO);
				System.out.println(validateAndSave);
				if (validateAndSave) {
					model.addAttribute("UserData", userDataDTO);
					model.addAttribute("msg", "SuccessFully Enter The Detials");
				} else {
					model.addAttribute("msg", "Data is not valid");
				}
			}
		}

		// boolean validateAndSave = userService.saveAndValidate(userDataDTO);
		// System.out.println(validateAndSave);
		// System.out.println(userDataDTO);

		//model.addAttribute("UserData", userDataDTO);
		return "signUp";

	}

}
