package com.onlineexam.web;

import java.util.List;

import com.onlineexam.main.ServiceHandler;
import com.onlineexam.service.QuestionService;

public class ManageQuestionForm {
	private static final String forword_list = "list";
	private static final String forword_edit = "edit";
	private int selectedID;
	private String questionContent;
	private String category;
	private List questionList;

	private ServiceHandler sh = ServiceHandler.getInstance();
	private QuestionService qs = (QuestionService)sh.getService("questionService");

	public int getSelectedID() {
		return selectedID;
	}
	public void setSelectedID(int selectedID) {
		this.selectedID = selectedID;
	}
	public String getQuestionContent() {
		return questionContent;
	}
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public List getQuestionList() {		
		return qs.getAllQuestions();
	}
	
	public void setQuestionList(List questionList) {
		this.questionList = questionList;
	}
}
