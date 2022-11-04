package com.xworkz.userData.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

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
			//System.out.println(userDataDTO);
			manager.persist(userDataDTO);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();

		}
		return true;
	}

}
