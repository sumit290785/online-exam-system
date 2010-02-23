package com.onlineexam.service;

/**
 * 
 * @author Joel Tsai
 *
 */
public interface LoginService {
	
	public boolean checkUser(String user, String passwd) throws Exception;

}
