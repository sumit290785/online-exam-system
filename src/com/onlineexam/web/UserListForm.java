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
			user.setUserId(u.getId());
			switch (u.getUserType()) {
			case ADMIN:
				user.setUserType("admin");
				break;
			case TEACHER:
				user.setUserType("teacher");
				break;
			case STUDENT:
				user.setUserType("student");
				break;
			}
			users.add(user);
		}

	}

	public String searchUserByName() {
		users = new ArrayList<UserForm>();
		User u;
		try {
			u = ((AccountService) ServiceHandler.getInstance().getService(
					"accountService")).getUser(searchUser);
			searchUser = "";
		} catch (Exception e) {
			e.printStackTrace();
			return "userList";
		}

		UserForm user = new UserForm();
		user.setUsername(u.getUsername());
		user.setPassword(u.getPassword());
		user.setFirstName(u.getFirstName());
		user.setLastName(u.getLastName());
		user.setCity(u.getCity());
		user.setEmail(u.getEmail());
		user.setPhone(u.getPhone());
		user.setStreet(u.getStreet());
		user.setUserId(u.getId());
		switch (u.getUserType()) {
		case ADMIN:
			user.setUserType("admin");
			break;
		case TEACHER:
			user.setUserType("teacher");
			break;
		case STUDENT:
			user.setUserType("student");
			break;
		}
		users.add(user);
		return "userList";
	}

	private List<UserForm> users;

	private String searchUser;

	public List<UserForm> getUsers() {
		return users;
	}

	public void setUsers(List<UserForm> users) {
		this.users = users;
	}

	public String getSearchUser() {
		return searchUser;
	}

	public void setSearchUser(String searchUser) {
		this.searchUser = searchUser;
	}

}
