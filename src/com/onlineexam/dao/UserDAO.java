/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.dao;

import java.util.List;

import com.onlineexam.domain.User;

/**
 * @author Joe Zhu
 *
 */
public interface UserDAO extends GenericDAO<User>{
	
	public User getUser(String username);
	
	public void save(User user);
	
	public User getUserByID(int ID);
	
	public List<User> searchUserByName(String userName);

}
