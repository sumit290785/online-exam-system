package com.onlineexam.web;

import antlr.collections.List;

import com.onlineexam.domain.User;
import com.onlineexam.domain.UserType;
import com.onlineexam.main.ServiceHandler;
import com.onlineexam.service.AccountService;

public class UserForm {

	private int userId;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String street;
	private String zipcode;
	private String city;
	private String userType;
	private List Category;
	private String errorMessage = "";

	public String saveUser() {
		if ("".equals(username) || username == null)
			errorMessage = errorMessage + "username can't be null!";
		if ("".equals(password) || username == null)
			errorMessage = errorMessage + "password can't be null!";
		User user = new User();
		user.setUsername(getUsername());
		user.setPassword(getPassword());
		if (getFirstName() != null)
			user.setFirstName(getFirstName());
		if (getLastName() != null)
			user.setLastName(getLastName());
		if (getCity() != null)
			user.setCity(getCity());
		if (getEmail() != null)
			user.setEmail(getEmail());
		if (getPhone() != null)
			user.setPhone(getPhone());
		if (getStreet() != null)
			user.setStreet(getStreet());
		if (getUserType().equalsIgnoreCase("admin"))
			user.setUserType(UserType.ADMIN);
		if (getUserType().equalsIgnoreCase("student"))
			user.setUserType(UserType.STUDENT);
		if (getUserType().equalsIgnoreCase("teacher"))
			user.setUserType(UserType.TEACHER);
		try {
			((AccountService) ServiceHandler.getInstance().getService(
					"accountService")).save(user);
		} catch (Exception e) {
			errorMessage = errorMessage + "username already exist";
		}

		if (!errorMessage.equals(""))
			return "userEdit";
		return "userList";
	}

	public String editUser() {
		
		return "userEdit";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public List getCategory() {
		return Category;
	}

	public void setCategory(List category) {
		Category = category;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
