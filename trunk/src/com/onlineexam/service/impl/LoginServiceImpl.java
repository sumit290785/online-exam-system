
package com.onlineexam.service.impl;

import com.onlineexam.dao.UserDAO;
import com.onlineexam.domain.User;
import com.onlineexam.domain.UserType;
import com.onlineexam.service.LoginService;
import com.onlineexam.util.SystemConstants;

/**
 * @author Joel Tsai
 *
 */
public class LoginServiceImpl implements LoginService {

	private UserDAO userDAO;	
	
	public int checkUser(String userName, String passwd) throws Exception {

		User user = userDAO.getUser(userName);
		if (user==null) return SystemConstants.USER_NOT_EXISTS;
		if (!passwd.equals(user.getPassword())) return SystemConstants.PASSWORD_INCORRECT;
		if (user.isAdmin()) return SystemConstants.LOGIN_AS_ADMIN;
		if (user.getUserType().equals(UserType.TEACHER)) return SystemConstants.LOGIN_AS_TEACHER;
		if (user.getUserType().equals(UserType.STUDENT))return SystemConstants.LOGIN_AS_STUDENT;
		return SystemConstants.LOGIN_UNKNOWN_ERROR;		
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	
}
