/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.dao.impl.hibernate;

import java.util.List;

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
		Query q  = this.getEntityManager().createQuery("SELECT u FROM User u where u.username = ?1");
		q.setParameter(1, userName);
		User user  = (User) q.getSingleResult();
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
