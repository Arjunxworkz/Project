package com.xworkz.userData.dto;



import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;


//query= "update UserDTO as user set user.password = :passs, user.status=:stats where user.userEmail =:email"),
@Entity
@Table(name = "userdata_info")
@NamedQueries({ @NamedQuery(name = "getEmail", query = "select user from UserDataDTO user where user.email = :mail"),
		@NamedQuery(name = "getEmailAndPassword", query = "select user from UserDataDTO user where user.email = :mail And user.password =:pass"),
		@NamedQuery(name = "forgotPasswordByMail", query = "UPDATE UserDataDTO as user SET user.password=:pass WHERE user.email=:mail"),
		@NamedQuery(name = "updateCount", query = "UPDATE UserDataDTO as user SET user.count=:cot WHERE user.email=:mail"),
		@NamedQuery(name="getByCount",query = "select user.count from UserDataDTO user where user.email = :mail"),
		@NamedQuery(name="statusBlock",query = "UPDATE UserDataDTO as user SET user.status='block' where user.email = :mail"),
		@NamedQuery(name="statusUnblock",query = "UPDATE UserDataDTO as user SET user.status='unblock' where user.email = :mail")})
//select user from UserDataDTO user where user.count=:cot,select E.count from UserDataDTO E.count=:cot
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
	private Integer count;
	
	private LocalDate date;
	private LocalTime time;
	private String status;

	public UserDataDTO() {
		System.out.println("UserData DTO class is running");
		
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

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status=status;
	}

	@Override
	public String toString() {
		return "UserDataDTO [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + ", password="
				+ password + ", count=" + count + ", date=" + date + ", time=" + time + ", status=" + status +"]";
	}

}
