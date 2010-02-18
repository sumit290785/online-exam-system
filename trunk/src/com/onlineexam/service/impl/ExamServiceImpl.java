/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.service.impl;

import com.onlineexam.dao.CategoryDAO;
import com.onlineexam.dao.ExamDAO;
import com.onlineexam.domain.Category;
import com.onlineexam.domain.Exam;
import com.onlineexam.domain.User;
import com.onlineexam.service.ExamService;

/**
 * @author zhujoe
 *
 */
public class ExamServiceImpl implements ExamService {
	
	private ExamDAO examDAO;
	private CategoryDAO categoryDAOImpl;
	
	

	/* (non-Javadoc)
	 * @see com.onlineexam.service.ExamService#caculateScore(com.onlineexam.domain.Exam)
	 */
	public boolean caculateScore(Exam exam) {
		
		return true;

	}

	/* (non-Javadoc)
	 * @see com.onlineexam.service.ExamService#createExam(com.onlineexam.domain.User)
	 */
	public Exam createExam(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public ExamDAO getExamDAO() {
		return examDAO;
	}

	public void setExamDAO(ExamDAO examDAO) {
		this.examDAO = examDAO;
	}

}
