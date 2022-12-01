package com.xworkz.userData.serviceImpl;

import java.util.List;

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
		System.out.println("ServiceImpl save method calling");
		String password=password();

		System.out.println(userDataDTO.getEmail().length() > 2);
		if (userDataDTO.getName().length() > 2 && userDataDTO.getEmail().length() > 8
				&& userDataDTO.getNumber().length() > 9) {
			userDataDTO.setPassword(password);
			boolean save = userDataDao.save(userDataDTO);
		
			System.out.println(save);
			if (save) {
				userDataDao.sendEmail(userDataDTO.getEmail(), userDataDTO.getPassword(), userDataDTO);
			} else {
				System.out.println("Envalid Email Entered");
			}

		} else {
			System.out.println("you are typing wrong");
		}

		return true;
	}

	@Override
	public boolean getByEmail(String email) {
		System.out.println("calling find by email method");
		List<UserDataDTO> emails = userDataDao.findByEmail(email);
		if (emails != null) {

			return false;
		} else {
			return true;
		}

	}

	@Override
	public String password() {
		String password = userDataDao.passwordGenerator();
		return password;
	}

	@Override
	public boolean getLogInByEmailAndPassword(String email,String password) {
		System.out.println("calling getLogInByEmailAndPassword method");
		List<UserDataDTO> emailsAndPass=userDataDao.logInByEmailAndPassword(email, password);
		if (emailsAndPass != null) {

			return true;
		} else {
			return false;
		}
		
		
	}

	@Override
	public boolean forgotByEmail(String email, String password) {
		System.out.println("calling forgotByEmail method");
		List<UserDataDTO> forgotPass=userDataDao.forgotPasswordByMail(email, password);
		if(forgotPass==null) {
			System.out.println("if condition ");
			
			
			return true;
			
		}
	
		else {
			System.out.println("else condition ");
		
			return false;
		}
		
	}

}
