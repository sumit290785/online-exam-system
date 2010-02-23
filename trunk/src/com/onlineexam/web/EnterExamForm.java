package com.onlineexam.web;

import java.util.TimerTask;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		ett.setRequest(FacesUtil.getServletRequest());
		ett.setResponse(FacesUtil.getServletResponse());
		ett.setServletContext(FacesUtil.getServletContext());
		ExamTerminatorUtil.startExamTerminatorThread(examTime*60, ett);
		FacesUtil.getServletRequest().setAttribute("passedTime", String.valueOf(ExamTerminatorUtil.getCurrentTerminatorRemainingTime()));
		return "TAKE_EXAM";
	}
	
    class ExamTerminatorTask extends TimerTask {
    	
    	private HttpServletRequest request;
    	private HttpServletResponse response;
    	private ServletContext servletContext;

        public void run() {
        	try {
        		servletContext.getRequestDispatcher(
						"/pages/finish_exam.jsp").forward(
								request,
								response);
			} catch (Exception e) {
				//TODO:
				e.printStackTrace();
			}
        }

		/**
		 * @return the request
		 */
		public HttpServletRequest getRequest() {
			return request;
		}

		/**
		 * @param request the request to set
		 */
		public void setRequest(HttpServletRequest request) {
			this.request = request;
		}

		/**
		 * @return the response
		 */
		public HttpServletResponse getResponse() {
			return response;
		}

		/**
		 * @param response the response to set
		 */
		public void setResponse(HttpServletResponse response) {
			this.response = response;
		}

		/**
		 * @return the servletContext
		 */
		public ServletContext getServletContext() {
			return servletContext;
		}

		/**
		 * @param servletContext the servletContext to set
		 */
		public void setServletContext(ServletContext servletContext) {
			this.servletContext = servletContext;
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
