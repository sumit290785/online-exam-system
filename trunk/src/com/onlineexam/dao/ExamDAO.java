/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.dao;

import java.util.List;

import com.onlineexam.domain.Answer;
import com.onlineexam.domain.Category;
import com.onlineexam.domain.Exam;
import com.onlineexam.domain.User;

/**
 * @author zhujoe
 *
 */
public interface ExamDAO  extends GenericDAO<Exam>{
	public Exam createExam(Category category,User user,List<Answer> answerLst);
}
