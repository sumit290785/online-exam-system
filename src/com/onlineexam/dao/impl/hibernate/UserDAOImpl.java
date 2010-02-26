/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.dao.impl.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.onlineexam.dao.UserDAO;
import com.onlineexam.domain.User;

/**
 * @author Joe Zhu
 * 
 */
public class UserDAOImpl extends GenericDAOImpl<User> implements
		UserDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.onlineexam.dao.AccountDAO#getAccount(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public User getUser(String userName) {
		
		EntityManager em = getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		User user;
		try{
		Query q  = em.createQuery("SELECT u FROM User u where u.username = ?1");
		q.setParameter(1, userName);
		user  = (User) q.getSingleResult();
		}catch(RuntimeException e){
			tx.rollback();
			throw e;
		}
		tx.commit();
		return user;
	}

	public void save(User user) {

		// First unit of work
		this.makePersistent(user);

	}

	@Override
	public User getUserByID(int ID) {
		return this.findById(ID, false);
	}

	
}
