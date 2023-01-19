package com.xworkz.neonWizard.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.neonWizard.dao.NeonWizardDao;
import com.xworkz.neonWizard.dto.NeonWizardDTO;
@Repository
public class NeonWizardDaoImpl implements NeonWizardDao {
	@Autowired
	private EntityManagerFactory factory;

	private EntityManager manager;
	@Override
	public boolean save(NeonWizardDTO neonWizardDTO) {
		try {

			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			// System.out.println(userDataDTO);
			manager.persist(neonWizardDTO);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();

		}
		return true;
	}
}
	


