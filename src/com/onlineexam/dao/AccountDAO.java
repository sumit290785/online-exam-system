/**
 * Software Engineering Course task
 * copyright © 2010 USS.
 */
package com.onlineexam.dao;

import com.onlineexam.domain.Account;

/**
 * @author Joe Zhu
 *
 */
public interface AccountDAO {
	
	public Account getAccount(String username);

}
