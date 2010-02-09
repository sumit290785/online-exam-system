/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.main;

/**
 * @author Joe Zhu
 * 
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.HibernateException;

public class HibernateUtil {
	private static final EntityManager entityManager;
	static {
		EntityManagerFactory emf =null;
		try {
			emf = Persistence
					.createEntityManagerFactory("online-exam");
			entityManager = emf.createEntityManager();
		} catch (Throwable ex) {
			// Log exception!
			emf.close();
			System.out.println("EntityManager create failed!!!!!");
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static EntityManager getEntityManager() throws HibernateException {
		return entityManager;
	}
}