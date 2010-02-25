package com.onlineexam.service;

/**
 * 
 * @author Joel Tsai
 *
 */
public interface LoginService {
	
	public int checkUser(String user, String passwd) throws Exception;

}
