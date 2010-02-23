
package com.onlineexam.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.model.SelectItem;

import com.onlineexam.domain.Category;
import com.onlineexam.main.ServiceHandler;
import com.onlineexam.service.AccountService;
import com.onlineexam.util.FacesUtil;

/**
 * @author Joel Tsai
 *
 */
public class SelectCategoryForm {
	
	private String categoryId;
	
	private String categoryName;
	
	private List<SelectItem> categoryItems = new ArrayList<SelectItem>();
	
	public String showCategory() {
		for (SelectItem ci : categoryItems) {
			if (ci.getValue().toString().equals(categoryId)) {
				categoryName = ci.getLabel();
			}
		}
		//FacesUtil.getServletRequest().setAttribute("categoryId", categoryId);
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
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the categoryItems
	 */
	public List<SelectItem> getCategoryItems() {
		LoginBean loginBean = (LoginBean) FacesUtil.getManagedBean("login");
		AccountService accountService = (AccountService) ServiceHandler.getInstance().getService("accountService");
		List<Category> categories = accountService.getCategories(loginBean.getUserId());
		for (Category category : categories) {
			categoryItems.add(new SelectItem(category.getId(), category.getCategoryName()));
		}
		return categoryItems;
	}


	
	

}
