/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.service.impl;

import com.onlineexam.dao.UserDAO;
import com.onlineexam.domain.User;
import com.onlineexam.service.AccountService;

/**
 * @author Joe Zhu
 *
 */
public class AccountServiceImp implements AccountService {
	private UserDAO userDAO;

	/* (non-Javadoc)
	 * @see com.onlineexam.service.SecurityService#getAccount()
	 */
	public User getUser(String username) {
		return userDAO.getUser(username);

	}
	public void save(User user) {
		userDAO.save(user);
		
	}
	

	/**
	 * @return the accountDAO
	 */
	public UserDAO getUserDAO() {
		return userDAO;
	}

	/**
	 * @param accountDAO the accountDAO to set
	 */
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	@Override
	public User getUserByID(int ID) {
		return userDAO.getUserByID(ID);
	}


	
	

}
