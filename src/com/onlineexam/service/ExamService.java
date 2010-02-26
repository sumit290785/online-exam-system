/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.service;

import java.util.List;

import com.onlineexam.domain.Answer;
import com.onlineexam.domain.Exam;
import com.onlineexam.util.InterBoolean;

/**
 * @author zhujoe
 *
 */
public interface ExamService {
	
	public Exam createExam(String userName,int categoryID);
	
	public Exam submitExam(int examID);
	
	public Answer submitAnswer(int answerID, int... optionID);

	public Answer getQuestion(int examID,int seqNUM,InterBoolean isLAST);
	
	public List<Exam> getAllExams();

}
