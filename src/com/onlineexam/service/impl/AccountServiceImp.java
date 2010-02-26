/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.onlineexam.dao.UserDAO;
import com.onlineexam.domain.Category;
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
	@Override
	public List<Category> getCategories(String userName) {
		// TODO Auto-generated method stub
		User user = this.getUser(userName);
		return new ArrayList<Category>(user.getCategoryTobeExamed());
	}
	@Override
	public List<User> getAllUsers() {
		return userDAO.findAll();
	}
	@Override
	public void delete(User user) {
		userDAO.makeTransient(user);
	}


	
	

}
