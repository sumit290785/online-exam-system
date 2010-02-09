/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.dao.impl.hibernate;

import com.onlineexam.dao.UserDAO;
import com.onlineexam.domain.User;
import com.onlineexam.domain.UserType;

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
	public User getUser(String userName) {
		return null;
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
