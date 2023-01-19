package com.xworkz.neonWizard.service;



import com.xworkz.neonWizard.dto.NeonWizardDTO;

public interface NeonWizardService {
	
	
	public boolean saveAndValidate(NeonWizardDTO neonWizardDTO);
	public Boolean sendEmail(String email ,NeonWizardDTO neonWizardDTO);

}
