package com.onlineexam.web;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.onlineexam.domain.User;
import com.onlineexam.domain.UserType;
import com.onlineexam.main.ServiceHandler;
import com.onlineexam.service.AccountService;

public class UserListForm {

	public UserListForm() {
		loadList();
	}

	public String searchUserByName() {
		List<User> userResults;
		users = new LinkedList<UserForm>();
		try {
			userResults = ((AccountService) ServiceHandler.getInstance()
					.getService("accountService")).searchUserByName(searchUser);
			searchUser = "";
		} catch (Exception e) {
			e.printStackTrace();
			return "userList";
		}
		for (User u : userResults) {

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
		return "userList";
	}

	public String saveUser() {
		if ("".equals(currentUser.getUsername())
				|| currentUser.getUsername() == null)
			currentUser.setErrorMessage("username can't be null!");
		if ("".equals(currentUser.getPassword())
				|| currentUser.getPassword() == null)
			currentUser.setErrorMessage("password can't be null!");
		if (currentUser.getErrorMessage().equals("")) {
			User user = new User();
			user.setUsername(currentUser.getUsername());
			user.setPassword(currentUser.getPassword());
			if (currentUser.getUserId() != 0)
				user.setId(currentUser.getUserId());
			if (currentUser.getFirstName() != null)
				user.setFirstName(currentUser.getFirstName());
			if (currentUser.getLastName() != null)
				user.setLastName(currentUser.getLastName());
			if (currentUser.getCity() != null)
				user.setCity(currentUser.getCity());
			if (currentUser.getEmail() != null)
				user.setEmail(currentUser.getEmail());
			if (currentUser.getPhone() != null)
				user.setPhone(currentUser.getPhone());
			if (currentUser.getStreet() != null)
				user.setStreet(currentUser.getStreet());
			if (currentUser.getUserType().equalsIgnoreCase("admin"))
				user.setUserType(UserType.ADMIN);
			if (currentUser.getUserType().equalsIgnoreCase("student"))
				user.setUserType(UserType.STUDENT);
			if (currentUser.getUserType().equalsIgnoreCase("teacher"))
				user.setUserType(UserType.TEACHER);
			try {
				((AccountService) ServiceHandler.getInstance().getService(
						"accountService")).save(user);
			} catch (Exception e) {
				currentUser.setErrorMessage("username already exist");
			}
		}
		if (!currentUser.getErrorMessage().equals(""))
			return "userEdit";
		loadList();
		return "userList";
	}

	public String editUser() {
		User u;
		u = ((AccountService) ServiceHandler.getInstance().getService(
				"accountService")).getUserByID(Integer.parseInt(this
				.getCurrentUserID()));
		currentUser.setUserId(Integer.parseInt(this.getCurrentUserID()));
		currentUser.setUsername(u.getUsername());
		currentUser.setPassword(u.getPassword());
		currentUser.setFirstName(u.getFirstName());
		currentUser.setLastName(u.getLastName());
		currentUser.setCity(u.getCity());
		currentUser.setEmail(u.getEmail());
		currentUser.setPhone(u.getPhone());
		currentUser.setStreet(u.getStreet());
		currentUser.setUserId(u.getId());
		switch (u.getUserType()) {
		case ADMIN:
			currentUser.setUserType("admin");
			break;
		case TEACHER:
			currentUser.setUserType("teacher");
			break;
		case STUDENT:
			currentUser.setUserType("student");
			break;
		}
		return "userEdit";
	}

	public String deleteUser() {
		int userID = Integer.parseInt(this.getCurrentUserID());
		User user;
		user = ((AccountService) ServiceHandler.getInstance().getService(
				"accountService")).getUserByID(userID);
		((AccountService) ServiceHandler.getInstance().getService(
				"accountService")).delete(user);
		loadList();
		return "userList";
	}

	private void loadList() {
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

	private List<UserForm> users;

	private UserForm currentUser = new UserForm();

	private String searchUser;

	private String currentUserID;

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

	public UserForm getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(UserForm currentUser) {
		this.currentUser = currentUser;
	}

	public String getCurrentUserID() {
		return currentUserID;
	}

	public void setCurrentUserID(String currentUserID) {
		this.currentUserID = currentUserID;
	}

}
