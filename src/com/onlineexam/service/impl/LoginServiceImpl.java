
package com.onlineexam.service.impl;

import com.onlineexam.service.LoginService;

/**
 * @author Joel Tsai
 *
 */
public class LoginServiceImpl implements LoginService {
	public boolean checkUser(String user, String passwd) {
		//TODO: will be removed soon.
		if ("user".equals(user) && "passwd".equals(passwd)) {
			return true;
		} else {
			return false;
		}
	}
}
