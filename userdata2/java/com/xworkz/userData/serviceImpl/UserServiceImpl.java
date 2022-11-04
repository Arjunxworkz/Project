package com.xworkz.userData.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.userData.dao.UserDataDao;
import com.xworkz.userData.dto.UserDataDTO;
import com.xworkz.userData.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
 	private UserDataDao userDataDao;

	@Override
	public boolean saveAndValidate(UserDataDTO userDataDTO) {
		System.out.println("ServiceDaoImpl save method calling");
		if(userDataDTO.getEmail()!=null) {
			boolean save = userDataDao.save(userDataDTO);
			System.out.println(save);
		}else {
			System.out.println("email is null");
		}
		
		
		
		return true;
	}

}
