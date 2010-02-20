package com.onlineexam.web;

import java.util.TimerTask;

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
		examTime = 1;
		ExamTerminatorUtil.startExamTerminatorThread(examTime*60, new ScheduleRunTask());
		FacesUtil.getServletRequest().setAttribute("passedTime", String.valueOf(ExamTerminatorUtil.getCurrentTerminatorRemainingTime()));
		return "TAKE_EXAM";
	}
	
    class ScheduleRunTask extends TimerTask {

        public void run() {
        	try {
				FacesUtil.getServletContext().getRequestDispatcher(
						"/pages/finish_exam.jsp").forward(
						FacesUtil.getServletRequest(),
						FacesUtil.getServletResponse());
			} catch (Exception e) {
				//TODO:
				e.printStackTrace();
			}
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
