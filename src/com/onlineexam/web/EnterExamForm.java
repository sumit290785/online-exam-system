package com.onlineexam.web;

import java.util.TimerTask;

import com.onlineexam.domain.Exam;
import com.onlineexam.main.ServiceHandler;
import com.onlineexam.service.ExamService;
import com.onlineexam.util.ExamTerminatorUtil;
import com.onlineexam.util.FacesUtil;

/**
 * @author Joel Tsai
 * 
 */
public class EnterExamForm {

	private String categoryId;
	
	/** The exam time, based on minutes. */
	private int examTime;
	
	private int examId;
	/**
	 * Based on minutes.
	 */
	private static final int DEFAULT_EXAM_TIME = 120;
	private static final int DEFAULT_EXAM_ID = 1;
	
	public String takeExam() {
		ExamService examService = (ExamService) ServiceHandler.getInstance().getService("examService");
		LoginBean loginBean = (LoginBean) FacesUtil.getManagedBean("login");
		SelectCategoryForm selectCategory = (SelectCategoryForm) FacesUtil.getManagedBean("selectCategory");
		Exam exam = examService.createExam(loginBean.getUserId(), Integer.parseInt(selectCategory.getCategoryId()));
		examId = exam.getId();
		if (examId == 0) {
			examId = DEFAULT_EXAM_ID;
		}
		int examTimeAllowed = exam.getCategory().getExamTime();
		if (examTimeAllowed != 0) {
			examTime = examTimeAllowed;
		} else {
			examTime = DEFAULT_EXAM_TIME;
		}
		ExamTerminatorUtil.startExamTerminatorThread(examTime * 60, new TimerTask() {public void run() {};});
		FacesUtil.getServletRequest().setAttribute("passedTime", String.valueOf(ExamTerminatorUtil.getCurrentTerminatorRemainingTime()));
		//prepare the first question
		TakeExamForm takeExam = (TakeExamForm) FacesUtil.getManagedBean("takeExam");
		takeExam.fetchQuestion();
		return "TAKE_EXAM";
	}
	
	public String cancel() {
		return "SELECT_CATEGORY";
	}

//	public void action(ActionEvent event) {   
//        categoryId = (String) event.getComponent().getAttributes().get("categoryId");
//    }

	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId
	 *            the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the examId
	 */
	public int getExamId() {
		return examId;
	}

	/**
	 * @param examId the examId to set
	 */
	public void setExamId(int examId) {
		this.examId = examId;
	}

}
