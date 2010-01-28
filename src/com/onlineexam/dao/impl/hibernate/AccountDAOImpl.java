/**
 * Software Engineering Course task
 * copyright © 2010 USS.
 */
package com.onlineexam.dao.impl.hibernate;

import com.onlineexam.dao.AccountDAO;
import com.onlineexam.domain.Account;

/**
 * @author Joe Zhu
 *
 */
public class AccountDAOImpl implements AccountDAO {

	/* (non-Javadoc)
	 * @see com.onlineexam.dao.AccountDAO#getAccount(java.lang.String)
	 */
	public Account getAccount(String username) {
		Account a = new Account();
		a.setId(1);
		a.setUsername("admin");
		a.setPassword("admin");
		return a;
	}

}
