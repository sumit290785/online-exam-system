package com.onlineexam.web;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

public class AddQuestionForm {
	
	private String categoryId;
	private String knowlegePointId;
	private boolean multiSelect;
	private String questionContent;
	private int answerId;
	private String optionId;
	
	private String optionContent;
	private List<String> options = new ArrayList<String>();
	public AddQuestionForm() {
		
	}
	
	public List<SelectItem> getCategoryItems() {
		List<SelectItem> categoryItems = new ArrayList<SelectItem>();
		categoryItems.add(new SelectItem("1", "category1"));
		categoryItems.add(new SelectItem("2", "category2"));
		categoryItems.add(new SelectItem("3", "category3"));
		categoryItems.add(new SelectItem("4", "category4"));
		
		return categoryItems;
	}
	
	public List<SelectItem> getKpItems() {
		List<SelectItem> kpItems = new ArrayList<SelectItem>();
		kpItems.add(new SelectItem("1", "knowlegePoint1"));
		kpItems.add(new SelectItem("2", "knowlegePoint2"));
		kpItems.add(new SelectItem("3", "knowlegePoint3"));
		kpItems.add(new SelectItem("4", "knowlegePoint4"));
		
		return kpItems;
	}
	
	public List<SelectItem> getOptionItems() {
		List<SelectItem> qItems = new ArrayList<SelectItem>();
		if (options == null) options = new ArrayList<String>();
		for (int i = 0; i < options.size(); i++) {
			qItems.add(new SelectItem(i, options.get(i)));
		}
		return qItems;
	}
	
	public String addOption() {
		options.add(optionContent);
		System.out.println("dfsdfsdfdsf");
		System.out.println("categoryId:" + categoryId);
		System.out.println("knowlegePointId:" + knowlegePointId);
		return "";
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
	 * @return the knowlegePointId
	 */
	public String getKnowlegePointId() {
		return knowlegePointId;
	}

	/**
	 * @param knowlegePointId the knowlegePointId to set
	 */
	public void setKnowlegePointId(String knowlegePointId) {
		this.knowlegePointId = knowlegePointId;
	}

	/**
	 * @return the multiSelect
	 */
	public boolean isMultiSelect() {
		return multiSelect;
	}
	/**
	 * @param multiSelect the multiSelect to set
	 */
	public void setMultiSelect(boolean multiSelect) {
		this.multiSelect = multiSelect;
	}
	/**
	 * @return the questionContent
	 */
	public String getQuestionContent() {
		return questionContent;
	}
	/**
	 * @param questionContent the questionContent to set
	 */
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
	/**
	 * @return the answerId
	 */
	public int getAnswerId() {
		return answerId;
	}
	/**
	 * @param answerId the answerId to set
	 */
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	/**
	 * @return the optionContent
	 */
	public String getOptionContent() {
		return optionContent;
	}

	/**
	 * @param optionContent the optionContent to set
	 */
	public void setOptionContent(String optionContent) {
		this.optionContent = optionContent;
	}

	/**
	 * @return the optionId
	 */
	public String getOptionId() {
		return optionId;
	}

	/**
	 * @param optionId the optionId to set
	 */
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}

}

