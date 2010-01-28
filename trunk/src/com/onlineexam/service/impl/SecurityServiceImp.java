/**
 * Software Engineering Course task
 * copyright © 2010 USS.
 */
package com.onlineexam.service.impl;

import com.onlineexam.dao.AccountDAO;
import com.onlineexam.domain.Account;
import com.onlineexam.service.SecurityService;

/**
 * @author Joe Zhu
 *
 */
public class SecurityServiceImp implements SecurityService {
	private AccountDAO accountDAO;

	/* (non-Javadoc)
	 * @see com.onlineexam.service.SecurityService#getAccount()
	 */
	public Account getAccount(String username) {
		return accountDAO.getAccount("");

	}

	/**
	 * @return the accountDAO
	 */
	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	/**
	 * @param accountDAO the accountDAO to set
	 */
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	

}
