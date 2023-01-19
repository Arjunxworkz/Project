package com.xworkz.neonWizard.serviceImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.xworkz.neonWizard.dao.NeonWizardDao;
import com.xworkz.neonWizard.dto.NeonWizardDTO;
import com.xworkz.neonWizard.service.NeonWizardService;

@Service
public class NeonWizardServiceImpl implements NeonWizardService {
	@Autowired
	private NeonWizardDao neonWizardDao;

	@Override
	public boolean saveAndValidate(NeonWizardDTO neonWizardDTO) {
		LocalDateTime dateTime;
		dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		LocalDate sentDate = dateTime.toLocalDate();
		LocalTime sentTime = dateTime.toLocalTime();
		neonWizardDTO.setDate(sentDate);
		neonWizardDTO.setTime(sentTime);

		boolean save = neonWizardDao.save(neonWizardDTO);

		if (save) {
		sendEmail(neonWizardDTO.getEmail(), neonWizardDTO);
		}
		return true;
	}

	@Override
	public Boolean sendEmail(String email, NeonWizardDTO neonWizardDTO) {
		String name =neonWizardDTO.getName();
		String mail=neonWizardDTO.getEmail();
		Integer num=neonWizardDTO.getNumber();
		String gender=neonWizardDTO.getGender();
		String filename=neonWizardDTO.getFilename();
		String web_service=neonWizardDTO.getWeb_service();
		String languages=neonWizardDTO.getLanguages();
		String budget=neonWizardDTO.getBudget();
		String support_period=neonWizardDTO.getSupport_period();
		String code_opti1=neonWizardDTO.getCode_opti1();
		String code_opti2=neonWizardDTO.getCode_opti2();
		String code_opti3=neonWizardDTO.getCode_opti3();
		LocalDate date=neonWizardDTO.getDate();
		LocalTime time=neonWizardDTO.getTime();
		
		String to = email;
		System.out.println(email);
		String from = "arjunbari03@outlook.com";
		String host = "smtp.office365.com";
		String pass = "Arjun@123";
		// Get system properties
				Properties properties = System.getProperties();
				
				// Setup mail server
				properties.put("mail.smtp.host", host);
				properties.put("mail.smtp.port", "587");
				properties.put("mail.smtp.starttls.enable", "true");
				properties.put("mail.smtp.auth", "true");
				properties.put("mail.debug", "true");
				properties.put("mail.transport.protocol", "smtp");
				
				Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

					protected PasswordAuthentication getPasswordAuthentication() {

						return new PasswordAuthentication(from, pass);

					}

				});
				// Used to debug SMTP issues
				session.setDebug(true);
				try {
					// Create a default MimeMessage object.
					MimeMessage message = new MimeMessage(session);
					
					// Set From: header field of the header.
					message.setFrom(new InternetAddress(from));
					
					// Set To: header field of the header.
					message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

					// Set Subject: header field
					message.setSubject("Registration Confirmation Mail");
                    
					// Now set the actual message
					message.setText("Hi" + " your name :-" + name + ", your email : -"+ mail +",your contect:  "+num +", gender :"+ gender +",filename:"+filename+", services your need-"+web_service+", languages:"+languages+",budget"+budget+",support_period "+", code_opti1:"+code_opti1 +", "+code_opti2+" ,"+code_opti3+",date and time"+date+","+time+"This Is To Confirm You That Your Registration Was Successful"
							+ " " + "Thank You ");
				//	message.setText("Hi" +name+"This Is To Confirm You That Your Registration Was Successful");
					
					System.out.println("sending...");
					// Send message
					Transport.send(message);
					System.out.println("Sent message successfully....");
				} catch (MessagingException mex) {
					// TODO: handle exception
					mex.printStackTrace();
				}

		return null;
	}

}
