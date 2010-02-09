/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.dao.impl.hibernate;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onlineexam.dao.UserDAO;
import com.onlineexam.domain.User;
import com.onlineexam.domain.UserType;
import com.onlineexam.main.HibernateUtil;

/**
 * @author Joe Zhu
 * 
 */
public class UserDAOImpl implements UserDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.onlineexam.dao.AccountDAO#getAccount(java.lang.String)
	 */
	public User getUser(String username) {
		User u = new User("admin", "admin", UserType.ADMIN);
		return u;
	}

	public void save(User user) {

        // First unit of work
		EntityManager em = HibernateUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(user);

        tx.commit();
        em.close();
		
	}

	
}
