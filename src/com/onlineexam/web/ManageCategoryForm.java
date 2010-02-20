package com.onlineexam.web;

/**
 * @author Joel Tsai
 * 
 */
public class ManageCategoryForm {

	private String categoryName = "";
	private int passScore = 60;
	private int totalTime = 120;
	private int questionCount = 40;

	public String addCategory() {
		System.out.println("category name:" + categoryName + ";" + "pass score:" + passScore + ";" + "total time:" + totalTime + ";" + "question count:" + questionCount);
		return "";
	}

	public String getCategories() {
		return "";
	}

	public String editCategory() {
		return "";

	}

	public String deleteCategory() {
		return "";
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName
	 *            the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the passScore
	 */
	public int getPassScore() {
		return passScore;
	}

	/**
	 * @param passScore
	 *            the passScore to set
	 */
	public void setPassScore(int passScore) {
		this.passScore = passScore;
	}

	/**
	 * @return the totalTime
	 */
	public int getTotalTime() {
		return totalTime;
	}

	/**
	 * @param totalTime
	 *            the totalTime to set
	 */
	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	/**
	 * @return the questionCount
	 */
	public int getQuestionCount() {
		return questionCount;
	}

	/**
	 * @param questionCount
	 *            the questionCount to set
	 */
	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}

}
