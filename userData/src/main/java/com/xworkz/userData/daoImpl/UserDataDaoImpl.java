package com.xworkz.userData.daoImpl;

import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.userData.dao.UserDataDao;
import com.xworkz.userData.dto.UserDataDTO;

@Repository
public class UserDataDaoImpl implements UserDataDao {

	@Autowired
	private EntityManagerFactory factory;

	private EntityManager manager;

	@Override
	public boolean save(UserDataDTO userDataDTO) {
		try {

			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			// System.out.println(userDataDTO);
			manager.persist(userDataDTO);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();

		}
		return true;
	}

	@Override
	public List<UserDataDTO> findByEmail(String email) {
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("getEmail");
			query.setParameter("mail", email);
			List<UserDataDTO> resultList = query.getResultList();
			if (resultList.isEmpty()) {
				return null;
			} else if (!resultList.isEmpty()) {
				return resultList;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();

		}
		return null;
	}

	@Override
	public Boolean sendEmail(String email,String password, UserDataDTO userDataDTO) {

		String name = userDataDTO.getName();

		String to = email;

		System.out.println(email);

		String from = "hanamantxworkz@outlook.com";

		String host = "smtp.office365.com";

		String pass = "hanamant123@";

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
			message.setText("Hi" + " " + name + " " + "This Is To Confirm You That Your Registration Was Successful"
					+ " " + "Thank You");

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

	@Override
	public String passwordGenerator() {
		String upperCase="QWERTYUIOPASDFGHJKLZXCVBNM";
		String lowerCase="qwertyuiopasdfghjklzxcvbnm";
		String num="0123456789";
		String specialChar="!@#$%&";
		String combination=upperCase+lowerCase+num+specialChar;
		int length=12;
		char[] password=new char[length];
		Random random=new Random();
		for(int i=0;i<length;i++) {
		password[i]=combination.charAt(random.nextInt(combination.length()));
	}   
		return new String(password);
	}
}
