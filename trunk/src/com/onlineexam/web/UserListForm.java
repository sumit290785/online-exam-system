package com.onlineexam.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.onlineexam.domain.Category;
import com.onlineexam.domain.User;
import com.onlineexam.domain.UserType;
import com.onlineexam.main.ServiceHandler;
import com.onlineexam.service.AccountService;
import com.onlineexam.service.QuestionService;

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
		System.out.println(currentUser.getUserId());
		if ("".equals(currentUser.getUsername())
				|| currentUser.getUsername() == null)
			currentUser.setErrorMessage(currentUser.getErrorMessage()
					+ "Username can't be null!");
		if ("".equals(currentUser.getPassword())
				|| currentUser.getPassword() == null)
			currentUser.setErrorMessage(currentUser.getErrorMessage()
					+ " Password can't be null!");
		if (!currentUser.getCategory().isEmpty()
				&& !currentUser.getUserType().equalsIgnoreCase("student"))
			currentUser.setErrorMessage(currentUser.getErrorMessage()
					+ " Only student can add Category!");
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
			if (!currentUser.getCategory().isEmpty()) {
				Set<Category> category = new HashSet<Category>();
				for (String c : currentUser.getCategory()) {

					category.add(((QuestionService) ServiceHandler
							.getInstance().getService("questionService"))
							.getCategoryByName(c));
				}
				user.setCategoryTobeExamed(category);
			}

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
		List<String> category = new ArrayList<String>();
		for (Category c : u.getCategoryTobeExamed()) {
			category.add(c.getCategoryName());
		}
		currentUser.setCategory(category);
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
