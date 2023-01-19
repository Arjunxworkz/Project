package com.xworkz.neonWizard.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "version1")
public class NeonWizardDTO {
	@Id
	@GenericGenerator(name = "user", strategy = "increment")
	@GeneratedValue(generator = "user")
	@Min(value = 1)
	private Integer id;
	private String name;
	private String email;
	private Integer number;
	private String gender;
	private String filename;
	private String web_service;
	private String languages;
	private String budget;
	private String support_period;
	private String code_opti1;
	private String code_opti2;
	private String code_opti3;
	private LocalDate date;
	private LocalTime time;
	
 public NeonWizardDTO() {
	System.out.println("NeonWizardDTO class is calling");
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

public Integer getNumber() {
	return number;
}

public void setNumber(Integer number) {
	this.number = number;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getFilename() {
	return filename;
}

public void setFilename(String filename) {
	this.filename = filename;
}

public String getWeb_service() {
	return web_service;
}

public void setWeb_service(String web_service) {
	this.web_service = web_service;
}

public String getLanguages() {
	return languages;
}

public void setLanguages(String languages) {
	this.languages = languages;
}

public String getBudget() {
	return budget;
}

public void setBudget(String budget) {
	this.budget = budget;
}

public String getSupport_period() {
	return support_period;
}

public void setSupport_period(String support_period) {
	this.support_period = support_period;
}

public String getCode_opti1() {
	return code_opti1;
}

public void setCode_opti1(String code_opti1) {
	this.code_opti1 = code_opti1;
}

public String getCode_opti2() {
	return code_opti2;
}

public void setCode_opti2(String code_opti2) {
	this.code_opti2 = code_opti2;
}

public String getCode_opti3() {
	return code_opti3;
}

public void setCode_opti3(String code_opti3) {
	this.code_opti3 = code_opti3;
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

@Override
public String toString() {
	return "NeonWizardDTO [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + ", gender="
			+ gender + ", filename=" + filename + ", web_service=" + web_service + ", languages=" + languages
			+ ", budget=" + budget + ", support_period=" + support_period + ", code_opti1=" + code_opti1
			+ ", code_opti2=" + code_opti2 + ", code_opti3=" + code_opti3 + ", date=" + date + ", time=" + time + "]";
}
 
}
