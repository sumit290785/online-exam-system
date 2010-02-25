package com.onlineexam.web;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import com.onlineexam.domain.Category;
import com.onlineexam.domain.Question;
import com.onlineexam.main.ServiceHandler;
import com.onlineexam.service.QuestionService;

public class ManageQuestionForm {
	private static final String forword_list = "list";
	private static final String forword_edit = "edit";
	private int selectedID;
	private String questionContent;
	private String category;
	private List questionList;
	private SelectItem[] categoryList;

	private ServiceHandler sh = ServiceHandler.getInstance();
	private QuestionService qs = (QuestionService)sh.getService("questionService");
	
	public String editQuestion(){
		Question question = qs.getQuestionByID(selectedID);
		this.setCategory(question.getCategory().getCategoryName());
		this.setQuestionContent(question.getQuestionContent());
		this.setSelectedID(this.getSelectedID());
		return forword_edit;
	}

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
	
//	public List getQuestionList() {		
//		return qs.getAllQuestions();
//	}
	
	public void setQuestionList(List questionList) {
		this.questionList = questionList;
	}

	public SelectItem[] getCategoryList() {
		List<Category> cList = qs.getAllCategories();
		List<String> result = new ArrayList();
		int m=0;
////		if (categoryList == null){
//			categoryList = new SelectItem[2];
//			categoryList[0]= new SelectItem("12","34");
//			categoryList[1]= new SelectItem("32","344");
////		}
//		this.setCategory("12");

		categoryList = new SelectItem[cList.size()];
		for (int i=0;i<cList.size();i++) {
			m=i;
			categoryList[m]=new SelectItem(cList.get(m).getCategoryName());}
		return categoryList;
	}

	public void setCategoryList(SelectItem[] categoryList) {
		this.categoryList = categoryList;
	}
}
