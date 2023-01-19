package com.xworkz.neonWizard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.neonWizard.dto.NeonWizardDTO;
import com.xworkz.neonWizard.service.NeonWizardService;

@Controller
@RequestMapping("/use")
public class NeonWizardController {
	@Autowired
	private NeonWizardService neonWizardService;
	
     public NeonWizardController() {
    	 System.out.println("Controller is running");
}
     @PostMapping
     public String onSave(NeonWizardDTO neonWizardDTO ,Model model) {
    	 System.out.println("calling onsave method");
    	 System.out.println(neonWizardDTO);
    	 if(neonWizardDTO !=null) {
    		boolean save= neonWizardService.saveAndValidate(neonWizardDTO);
    		if(save) {
    			 model.addAttribute("msg", "Your data saved");
    		}
    		else {
    			 model.addAttribute("msg","You Are Unable To Save");
    		}
    		

    		 
    	 }
		return "index";
    	 
     }
}
