
package com.onlineexam.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.onlineexam.domain.Category;
import com.onlineexam.util.FacesUtil;

/**
 * @author Joel Tsai
 *
 */
public class SelectCategoryForm {
	
	private String categoryId;
	
	private List<Category> categories;
	
	private Map<String, String> categoryMap;
	
	public SelectCategoryForm() {
		//TODO: use actual services
		Category c1 = new Category("Advanced Software Engineering", 100, 40, 60, 120);
		Category c2 = new Category("Project Management", 100, 40, 60, 120);
		Category c3 = new Category("Advanced UML", 100, 40, 60, 120);
		Category c4 = new Category("Data Structure and Algorithm", 100, 40, 60, 120);
		List<Category> categories = new ArrayList<Category>();
		categories.add(c1);
		categories.add(c2);
		categories.add(c3);
		categories.add(c4);
		this.categories = categories;
		
		categoryMap = new HashMap<String, String>();
		categoryMap.put("Advanced Software Engineering", "Advanced Software Engineering");
		categoryMap.put("Project Management", "Project Management");
		categoryMap.put("Advanced UML", "Advanced UML");
		categoryMap.put("Data Structure and Algorithm", "Data Structure and Algorithm");
		
	}
	
	public String showCategory() {
		System.out.println("****" + categoryId);
		FacesUtil.getServletRequest().setAttribute("categoryId", categoryId);
		return "ENTER_EXAM";
	}

	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the categories
	 */
	public List<Category> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	/**
	 * @return the categoryMap
	 */
	public Map<String, String> getCategoryMap() {
		return categoryMap;
	}

	/**
	 * @param categoryMap the categoryMap to set
	 */
	public void setCategoryMap(Map<String, String> categoryMap) {
		this.categoryMap = categoryMap;
	}
	
	

}
