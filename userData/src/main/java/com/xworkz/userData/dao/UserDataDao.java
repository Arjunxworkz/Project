package com.xworkz.userData.dao;

import java.util.List;

import com.xworkz.userData.dto.UserDataDTO;


public interface UserDataDao {

	public boolean save(UserDataDTO userDataDTO);

	public List<UserDataDTO> findByEmail(String email);
	
	public Boolean sendEmail(String email,String password, UserDataDTO userDataDTO);
	
	public String passwordGenerator();
	
	public List<UserDataDTO> logInByEmailAndPassword(String email,String password);
	
	public List<UserDataDTO> forgotPasswordByMail(String email,String password);
	public List<UserDataDTO> updateCount(Integer count,String email);
	public boolean  getByCount(Integer count,String email);
	public boolean statusBlock(String status,String email);
	public boolean statusUnblock(String email);
}