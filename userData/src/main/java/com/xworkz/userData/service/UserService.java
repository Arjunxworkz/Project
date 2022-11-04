package com.xworkz.userData.service;

import com.xworkz.userData.dto.UserDataDTO;

public interface UserService {
	
public boolean saveAndValidate(UserDataDTO userDataDTO);
public boolean getByEmail(String email);
}
