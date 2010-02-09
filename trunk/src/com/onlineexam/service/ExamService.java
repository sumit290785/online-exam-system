/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.service;

import com.onlineexam.domain.Exam;
import com.onlineexam.domain.User;

/**
 * @author zhujoe
 *
 */
public interface ExamService {
	
	public Exam createExam(User user);
	
	public boolean caculateScore(Exam exam);

}
