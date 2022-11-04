package com.xworkz.userData.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name ="userdata_info")
public class UserDataDTO {
	
	@Id
	@GenericGenerator(name = "user",strategy = "increment")
	@GeneratedValue(generator = "user")
	private Integer id;
	private String name;
	private String email;
	private String number;
	
	public UserDataDTO() {
		System.out.println("UserDat DTO class is running");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "UserDataDTO [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + "]";
	}
	
}
