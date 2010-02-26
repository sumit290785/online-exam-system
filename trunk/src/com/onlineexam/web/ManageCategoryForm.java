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
//	private int passScore;
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
	private String errorMessage = "";
	
	public String addCategory() {
		System.out.println("category name:" + categoryName + ";" + "total time:" + totalTime + ";" + "question count:" + questionCount);
		errorMessage="";
		if (categoryName== null ||categoryName.length()==0)
			errorMessage=errorMessage + "category name can't be null!";
		if (questionCount==0)
			errorMessage=errorMessage + "questionCount name can't be 0!";	
		if (totalScore==0)
			errorMessage=errorMessage + "totalScore name can't be 0!";	
		if (passedQuestion>questionCount)
			errorMessage=errorMessage + "passQuestion cannot be greater than totalQuestion!";	
		if (passedQuestion==0)
			errorMessage=errorMessage + "passedQuestion name can't be 0!";	
		if (errorMessage.equals("")){
		try {
			Category category;
			if (this.getSelectedID() > 0) {
				category = qs.getCategoryByID(selectedID);
				category.setCreated(new Date());
			} else
				category = new Category();
			category.setCategoryName(categoryName);
			category.setExamTime(totalTime);
			category.setPassedQuestions(passedQuestion);
			category.setTotalQuestions(questionCount);
			category.setTotalScore(totalScore);
			qs.updateCategory(category);
		} catch (Exception e) {
			// TODO: handle exception
			errorMessage = errorMessage + "category name already exist";
		}
		}
		this.setCategoryList(qs.getAllCategories());
		if (!errorMessage.equals(""))
			return forword_edit;
		return forword_list;
	}
	
	public String initCategory() {
		System.out.println("category name:" + categoryName + ";" + "pass score:"  + "total time:" + totalTime + ";" + "question count:" + questionCount);
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

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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
