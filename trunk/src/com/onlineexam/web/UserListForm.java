package com.onlineexam.web;

import java.util.ArrayList;
import java.util.List;

import com.onlineexam.domain.User;
import com.onlineexam.main.ServiceHandler;
import com.onlineexam.service.AccountService;

public class UserListForm {

	public UserListForm() {
		users = new ArrayList<UserForm>();
		List<User> userList = ((AccountService) ServiceHandler.getInstance()
				.getService("accountService")).getAllUsers();
		for (User u : userList) {
			UserForm user = new UserForm();
			user.setUsername(u.getUsername());
			user.setPassword(u.getPassword());
			user.setFirstName(u.getFirstName());
			user.setLastName(u.getLastName());
			user.setCity(u.getCity());
			user.setEmail(u.getEmail());
			user.setPhone(u.getPhone());
			user.setStreet(u.getStreet());
			user.setUserId("" + u.getId());
			switch (u.getUserType()) {
			case ADMIN:
				user.setUserType("ADMIN");
			case TEACHER:
				user.setUserType("TEACHER");
			case STUDENT:
				user.setUserType("STUDENT");
			}
			users.add(user);
		}

	}

	private List<UserForm> users;

	public List<UserForm> getUsers() {
		return users;
	}

	public void setUsers(List<UserForm> users) {
		this.users = users;
	}

}
