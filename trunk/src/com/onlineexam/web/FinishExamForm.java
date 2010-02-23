/**
 * 
 */
package com.onlineexam.web;

/**
 * @author Joel Tsai
 *
 */
public class FinishExamForm {
	private String userId;
	private String username;
	private String category;
	private String passedTime;
	private int score;
	private boolean passed;
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the passedTime
	 */
	public String getPassedTime() {
		return passedTime;
	}
	/**
	 * @param passedTime the passedTime to set
	 */
	public void setPassedTime(String passedTime) {
		this.passedTime = passedTime;
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	/**
	 * @return the passed
	 */
	public boolean isPassed() {
		return passed;
	}
	/**
	 * @param passed the passed to set
	 */
	public void setPassed(boolean passed) {
		this.passed = passed;
	}

}
