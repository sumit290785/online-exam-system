/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.service;

import com.onlineexam.domain.User;

/**
 * @author Joe Zhu
 *
 */
public interface AccountService {
	
	public User getUser(String username);
	
	public void save(User user);
	
	public User getUserByID(int ID);
	
}
