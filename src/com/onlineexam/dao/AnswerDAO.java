package com.onlineexam.dao;

import java.util.List;

import com.onlineexam.domain.Answer;
import com.onlineexam.domain.Question;
/**
 * 
 * @author chenecho
 *
 */
public interface AnswerDAO extends  GenericDAO<Answer> {
	List<Answer> createAnswers(List<Question> questionList);

}
