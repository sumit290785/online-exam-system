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
	List<Answer> initialAnswers(List<Question> questionList);
	Answer findByExamIDAndSeqNUM(int examID, int seqNUM);

}
