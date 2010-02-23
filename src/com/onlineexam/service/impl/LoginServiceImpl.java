
package com.onlineexam.service.impl;

import com.onlineexam.dao.UserDAO;
import com.onlineexam.domain.User;
import com.onlineexam.service.LoginService;

/**
 * @author Joel Tsai
 *
 */
public class LoginServiceImpl implements LoginService {

	private UserDAO userDAO;
	
	public boolean checkUser(String userName, String passwd) throws Exception {

		User user = userDAO.getUser(userName);
		String userPasswd = user.getPassword();
		if (passwd.equals(userPasswd)) {
			return true;
		}
		return false;
		
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	
}
