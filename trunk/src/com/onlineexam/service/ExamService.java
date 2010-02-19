/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.service;

import com.onlineexam.domain.Answer;
import com.onlineexam.domain.Category;
import com.onlineexam.domain.Exam;
import com.onlineexam.domain.Question;
import com.onlineexam.domain.User;

/**
 * @author zhujoe
 *
 */
public interface ExamService {
	
	public Exam createExam(String userName,int categoryID);
	
	public Exam submitExam(int examID);
	
	public Answer submitAnswer(int answerID, int... optionID);

	public Question getQuestion(int examID,int seqNUM,Boolean isLAST);
}
