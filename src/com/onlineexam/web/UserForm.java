package com.onlineexam.web;

import java.util.List;

import javax.faces.model.SelectItem;

import com.onlineexam.domain.Category;
import com.onlineexam.main.ServiceHandler;
import com.onlineexam.service.QuestionService;

public class UserForm {

	public UserForm() {
		loadTotalCategory();
	}

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
	private List<String> category;
	private String errorMessage = "";
	private SelectItem[] totalCategory;

	private void loadTotalCategory() {
		List<Category> cList = ((QuestionService) ServiceHandler.getInstance()
				.getService("questionService")).getAllCategories();
		int m = 0;

		totalCategory = new SelectItem[cList.size()];
		for (int i = 0; i < cList.size(); i++) {
			m = i;
			totalCategory[m] = new SelectItem(cList.get(m).getCategoryName());
		}
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

	public List<String> getCategory() {
		return category;
	}

	public void setCategory(List<String> category) {
		this.category = category;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public SelectItem[] getTotalCategory() {
		return totalCategory;
	}

	public void setTotalCategory(SelectItem[] totalCategory) {
		this.totalCategory = totalCategory;
	}

}
