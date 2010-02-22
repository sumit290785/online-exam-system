package com.onlineexam.dao.impl.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;

import com.onlineexam.dao.ExamDAO;
import com.onlineexam.dao.UserDAO;
import com.onlineexam.domain.Answer;
import com.onlineexam.domain.Category;
import com.onlineexam.domain.Exam;
import com.onlineexam.domain.User;

/**
 * 
 * @author chenecho
 * 
 */
public class ExamDAOImpl extends GenericDAOImpl<Exam> implements ExamDAO {
	
	public Exam createExam(Category category,User user,List<Answer> answerLst){
		Date today = new Date();
		Exam exam = new Exam();
		exam.setAnswers(new HashSet(answerLst));
		exam.setCategory(category);
		exam.setUser(user);
		exam.setCreated(today);
		exam.setLastModified(today);
		this.makePersistent(exam);
		return exam;		
	}
}
