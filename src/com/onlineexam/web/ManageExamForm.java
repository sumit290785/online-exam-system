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
	private String examID;
	
	public List getAllExams(){
		List<Exam> allExams = es.getAllExams();
		examList = new ArrayList();
		for (int i=0;i<allExams.size();i++){
			Exam exam = allExams.get(i);
			ExamForm ef = new ExamForm();
			ef.setCategory(exam.getCategory().getCategoryName());
			ef.setTotalScore(exam.getScore());
			ef.setUser(exam.getUser().getUsername());
			ef.setUserName(exam.getUser().getFirstName()+exam.getUser().getLastName());
			examList.add(ef);	
		}
		return examList;
	}
	
	
	public String deleteExam(){
		return "";	
	}


	public List<ExamForm> getExamList() {
		getAllExams();
		return examList;
	}


	public void setExamList(List<ExamForm> examList) {
		this.examList = examList;
	}


	public String getExamID() {
		return examID;
	}


	public void setExamID(String examID) {
		this.examID = examID;
	}

}
