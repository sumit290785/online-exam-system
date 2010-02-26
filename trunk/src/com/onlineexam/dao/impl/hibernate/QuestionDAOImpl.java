package com.onlineexam.dao.impl.hibernate;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;



import com.onlineexam.dao.QuestionDAO;
import com.onlineexam.domain.Category;
import com.onlineexam.domain.Option;
import com.onlineexam.domain.Question;

/**
 * 
 * @author chenecho
 *
 */
public class QuestionDAOImpl extends GenericDAOImpl<Question> implements QuestionDAO {

	@SuppressWarnings("unchecked")
	public List<Question> getRandomeQuestions(Category category) {
		// TODO Auto-generated method stub
		EntityTransaction tx = this.getEntityManager().getTransaction();
		List<Question> result;
		tx.begin();
		int question_num = category.getTotalQuestions();
		Query query = getEntityManager().createQuery(
				"from " + getEntityBeanType().getName()+" where category.id ="+category.getId());
		Random   r=new   Random(); 
		int size = query.getResultList().size();
		if (size==question_num) 
		result = query.getResultList();
		else{
		query.setMaxResults(question_num);
		query.setFirstResult(r.nextInt(size-question_num)+1); 
		result =query.getResultList();
		}
		tx.commit();
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public List<Option> getCorrectOptions(Question question) {
		// TODO Auto-generated method stub
//		Option option = new Option();
//		option.setCorrect(true);
		List<Option> optionLst = new ArrayList(question.getOptions());
		List<Option> correctLst = new ArrayList();
		for (int i=0;i<optionLst.size();i++){
			Option option = optionLst.get(i);
			if (option.isCorrect()){
				correctLst.add(option);}			
		}
		return correctLst;
	}
}
