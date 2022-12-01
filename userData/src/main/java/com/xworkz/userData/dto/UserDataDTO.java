package com.xworkz.userData.dto;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.annotations.GenericGenerator;
//query= "update UserDTO as user set user.password = :passs, user.status=:stats where user.userEmail =:email"),
@Entity
@Table(name = "userdata_info")
@NamedQueries({ @NamedQuery(name = "getEmail", query = "select user from UserDataDTO user where user.email = :mail"),
		@NamedQuery(name = "getEmailAndPassword", query = "select user from UserDataDTO user where user.email = :mail And user.password =:pass"),
		@NamedQuery(name="forgotPasswordByMail",query = "UPDATE UserDataDTO as user SET user.password=:pass WHERE user.email=:mail")})
public class UserDataDTO {

	@Id
	@GenericGenerator(name = "user", strategy = "increment")
	@GeneratedValue(generator = "user")
	@Min(value = 1)
	private Integer id;
	private String name;
	private String email;
	private String number;
	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDataDTO [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + ", password="
				+ password + "]";
	}

}
