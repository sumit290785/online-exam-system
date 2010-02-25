package com.onlineexam.web;

import java.util.List;

import com.onlineexam.domain.User;
import com.onlineexam.main.ServiceHandler;
import com.onlineexam.service.AccountService;

public class UserListForm {

	private List<User> users = ((AccountService) ServiceHandler.getInstance()
			.getService("accountService")).getAllUsers();

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
