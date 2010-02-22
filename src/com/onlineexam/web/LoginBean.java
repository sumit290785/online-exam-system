package com.onlineexam.web;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import com.onlineexam.domain.Category;
import com.onlineexam.main.ServiceHandler;
import com.onlineexam.service.LoginService;
import com.onlineexam.util.FacesUtil;

/**
 * @author Joel Tsai
 */
public final class LoginBean {
	private String password;
	private String userId;

	// private Action loginAction;

	/**
	 * Provides the password
	 */
	public String getPassword() {
		return (this.password);
	}

	/**
	 * Sets the desired password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Provides the user ID
	 */
	public String getUserId() {
		return (this.userId);
	}

	/**
	 * Sets the desired user ID
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Attempt to log in the user.
	 */
	public String login() {
		// Check for blank input fields.
		if ((userId == null) || (userId.length() < 1))
			return "failure";
		if ((password == null) || (password.length() < 1))
			return "failure";
		// User user = null;
		// Access the Login business object.
		LoginService loginService = (LoginService) ServiceHandler.getInstance().getService("loginService");
		// Attempt to login.

		boolean isValid = loginService.checkUser(userId, password);
		// If no such user exists, login fails.
		// Otherwise, login succeeds.
		if (isValid == false)
			return "failure";
		else {
			return "success";
		}
	}

	public void validate(FacesContext context, UIComponent toValidate,
			Object value) {

	}

}
