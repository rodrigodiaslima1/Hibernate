package com.tvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tvc.dao.IPackageDAO;
import com.tvc.main.java.Package;

public class PackageDAO implements IPackageDAO{

	@Override
	public Package register(Package pack) {
		// 1
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("TestHibernateProject");
		
		// 2
		EntityManager em = emf.createEntityManager();
		
		// 3
		em.getTransaction().begin();
		em.persist(pack);
		em.getTransaction().commit();
		
		// 4
		em.close();
		emf.close();
		
		return pack;
	}


}
