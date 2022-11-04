package com.xworkz.userData.daoImpl;

import java.util.List;

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

	@Override
	public List<UserDataDTO> findByEmail(String email) {
		try {
			manager = factory.createEntityManager();
			Query query=manager.createNamedQuery("getEmail");
			query.setParameter("mail", email);
			List<UserDataDTO> resultList=query.getResultList();
			if(resultList.isEmpty()) {
				return null;
			}else if(!resultList.isEmpty()){
				return resultList;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();

		}
		return null;
	}

}
