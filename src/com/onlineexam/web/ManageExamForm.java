package com.onlineexam.web;

import java.util.ArrayList;
import java.util.List;

import com.onlineexam.domain.Exam;
import com.onlineexam.main.ServiceHandler;
import com.onlineexam.service.ExamService;
import com.onlineexam.service.QuestionService;

public class ManageExamForm {
	private ServiceHandler sh = ServiceHandler.getInstance();
	private ExamService es = (ExamService) sh
			.getService("examService");
	private List<ExamForm> examList;
	private String selectedID;
	private String selectedCategory;
	private static final String forword_list = "examlist";
	
	public ManageExamForm(){
		this.loadAll();
	}
	
	public void loadAll(){
		List<Exam> allExams ;
//		if(selectedCategory!=null&&!selectedCategory.equals(""))
//		allExams = es.getExamsByCategoryName(selectedCategory);
//		else
		allExams= es.getAllExams();
		examList = new ArrayList();
		for (int i=0;i<allExams.size();i++){
			Exam exam = allExams.get(i);
			ExamForm ef = new ExamForm();
			ef.setCategory(exam.getCategory().getCategoryName());
			ef.setTotalScore(exam.getScore());
			ef.setUser(exam.getUser().getUsername());
			ef.setUserName(exam.getUser().getFirstName()+exam.getUser().getLastName());
			if(exam.isPass())
			ef.setPassed("Successs");
			else
			ef.setPassed("Failure");
			examList.add(ef);	
		}
	}
	
	
	public String deleteExam(){
		
		return "";	
	}


	public List<ExamForm> getExamList() {
		return examList;
	}


	public void setExamList(List<ExamForm> examList) {
		this.examList = examList;
	}


	public String getSelectedID() {
		return selectedID;
	}


	public void setSelectedID(String selectedID) {
		this.selectedID = selectedID;
	}


	public String getSelectedCategory() {
		return selectedCategory;
	}


	public void setSelectedCategory(String selectedCategory) {
		this.selectedCategory = selectedCategory;
	}


}
