/**
 * Software Engineering Course task
 * copyright © 2010 USS.
 */
package com.onlineexam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onlineexam.service.SecurityService;

/**
 * @author Joe Zhu
 * 
 */
public class ServiceHandler {
	ApplicationContext context = new ClassPathXmlApplicationContext(
			new String[] { "services.xml","daos.xml"});

	public Object getService(String serviceName) {
		return context.getBean(serviceName);
	}

	private static ServiceHandler instance = new ServiceHandler();
	private ServiceHandler(){}
	public static ServiceHandler getInstance(){
		return instance;
	}
	//test if the getService works fine
	public static void main(String[] args) {
		ServiceHandler sh = ServiceHandler.getInstance();
		SecurityService service = (SecurityService)sh.getService("accountService");
		System.out.println(service.getAccount("").getUsername());
	}

}
