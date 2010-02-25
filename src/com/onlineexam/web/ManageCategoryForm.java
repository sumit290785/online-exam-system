package com.onlineexam.web;

import java.util.Date;
import java.util.List;

import com.onlineexam.domain.Category;
import com.onlineexam.main.ServiceHandler;
import com.onlineexam.service.QuestionService;

/**
 * @author Joel Tsai
 * 
 */
public class ManageCategoryForm {

	private String categoryName = "";
	private int passScore;
	private int totalTime;
	private int questionCount;
	private int passedQuestion ;
	private int totalScore ;
	private int selectedID;
	private ServiceHandler sh = ServiceHandler.getInstance();
	private QuestionService qs = (QuestionService)sh.getService("questionService");
	private List<Category> categoryList;
	private static final String forword_list = "list";
	private static final String forword_edit = "edit";
	
	public String addCategory() {
		System.out.println("category name:" + categoryName + ";" + "pass score:" + passScore + ";" + "total time:" + totalTime + ";" + "question count:" + questionCount);
		Category category ;
		if (this.getSelectedID()>0){
			category = qs.getCategoryByID(selectedID);category.setCreated(new Date());}
		else
			category = new Category();
		category.setCategoryName(categoryName);
		category.setExamTime(totalTime);
		category.setPassedQuestions(passedQuestion);
		category.setTotalQuestions(questionCount);
		category.setTotalScore(totalScore);
		qs.updateCategory(category);
		this.setCategoryList(qs.getAllCategories());
		return forword_list;
	}
	
	public String initCategory() {
		System.out.println("category name:" + categoryName + ";" + "pass score:" + passScore + ";" + "total time:" + totalTime + ";" + "question count:" + questionCount);
		this.setCategoryName("");
		this.setTotalTime(0);
		this.setPassedQuestion(0);
		this.setQuestionCount(0);
		this.setTotalScore(0);
		return forword_edit;
	}
	
	public String editCategory() {
		System.out.println("editCategory"+selectedID);
		Category category = qs.getCategoryByID(selectedID);
		this.setCategoryName(category.getCategoryName());
		this.setPassedQuestion(category.getPassedQuestions());
		this.setTotalScore(category.getTotalScore());
		this.setTotalTime(category.getExamTime());
		this.setQuestionCount(category.getTotalQuestions());
		this.setSelectedID(this.getSelectedID());
		return forword_edit;
	}

	public String deleteCategory() {
		System.out.println("delteCategory"+selectedID);
		qs.removeCategory(selectedID);
		this.setCategoryList(qs.getAllCategories());
		return forword_list;
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

	public int getPassedQuestion() {
		return passedQuestion;
	}

	public void setPassedQuestion(int passedQuestion) {
		this.passedQuestion = passedQuestion;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public List<Category> getCategoryList() {
		return qs.getAllCategories();
	}

	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}

	public int getSelectedID() {
		return selectedID;
	}

	public void setSelectedID(int selectedID) {
		this.selectedID = selectedID;
	}

}
