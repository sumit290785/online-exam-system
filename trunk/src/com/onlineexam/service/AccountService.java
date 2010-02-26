/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.service;

import java.util.List;

import com.onlineexam.domain.Category;
import com.onlineexam.domain.User;

/**
 * @author Joe Zhu
 *
 */
public interface AccountService {
	
	public User getUser(String username);
	
	public List<User> getAllUsers();
	
	public void save(User user);
	
	public User getUserByID(int ID);
	
	public void delete(User user);
	
	public List<Category> getCategories(String userName);
	
	public List<User> searchUserByName(String userName);
}
