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
	
	public String takeExam() {
		System.out.println("ready to take exam:" + categoryId);
		ExamService examService = (ExamService) ServiceHandler.getInstance().getService("examService");
		LoginBean loginBean = (LoginBean) FacesUtil.getManagedBean("login");
		//TODO: use categoryId instead
		Exam exam = examService.createExam(loginBean.getUserId(), 1);
		examTime = 120;
		ExamTerminatorTask ett = new ExamTerminatorTask();
		ExamTerminatorUtil.startExamTerminatorThread(examTime*60, ett);
		FacesUtil.getServletRequest().setAttribute("passedTime", String.valueOf(ExamTerminatorUtil.getCurrentTerminatorRemainingTime()));
		//prepare the first question
		TakeExamForm takeExam = (TakeExamForm) FacesUtil.getManagedBean("takeExam");
		takeExam.fetchQuestion();
		return "TAKE_EXAM";
	}
	
    class ExamTerminatorTask extends TimerTask {
    	
//    	private HttpServletRequest request;
//    	private HttpServletResponse response;
//    	private ServletContext servletContext;

        public void run() {
//        	try {
//        		servletContext.getRequestDispatcher(
//						"/pages/finish_exam.jsp").forward(
//								request,
//								response);
//			} catch (Exception e) {
//				//TODO:
//				e.printStackTrace();
//			}
        }

  }
	public String cancel() {
		return "SELECT_CATEGORY";
	}

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

}
