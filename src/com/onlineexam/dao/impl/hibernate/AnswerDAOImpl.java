package com.onlineexam.dao.impl.hibernate;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;

import com.onlineexam.dao.AnswerDAO;
import com.onlineexam.domain.Answer;
import com.onlineexam.domain.Question;
/**
 * 
 * @author chenecho
 *
 */
public class AnswerDAOImpl extends GenericDAOImpl<Answer> implements AnswerDAO {

	public List<Answer> createAnswers(List<Question> questionList){
		Answer answer;
		List<Answer> answerList= new ArrayList();
		for (int i=0;i<questionList.size();i++){
			Question question = questionList.get(i);
			answer = new Answer();
			answer.setQuestion(question);
			answer.setMarkReview(false);
			answer.setAnswered(false);
			this.makePersistent(answer);
			answerList.add(answer);
		}
		return answerList;
	}

	public Answer findByExamIDAndSeqNUM(int examID, int seqNUM) {
		// TODO Auto-generated method stub
		DetachedCriteria query =  DetachedCriteria.forClass(this.getEntityBeanType()).add(Property.forName("sequenceId").eq(seqNUM));
		List<Answer> result = this.executeQuery(query);
		return result.size()>0?result.get(0):null;
	}

}
