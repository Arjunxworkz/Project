package com.xworkz.userData.dao;

import java.util.List;

import com.xworkz.userData.dto.UserDataDTO;




public interface UserDataDao {

	public boolean save(UserDataDTO userDataDTO);

	public List<UserDataDTO> findByEmail(String email);
}