/**
 * Software Engineering Course task
 * copyright © 2010 USS.
 */
package com.onlineexam.service;

import com.onlineexam.domain.Account;

/**
 * @author Joe Zhu
 *
 */
public interface SecurityService {
	
	public Account getAccount(String username);
	
}
