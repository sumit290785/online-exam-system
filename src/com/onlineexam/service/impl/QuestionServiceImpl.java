package com.onlineexam.service.impl;

import java.util.Date;

import com.onlineexam.dao.CategoryDAO;
import com.onlineexam.dao.QuestionDAO;
import com.onlineexam.domain.Answer;
import com.onlineexam.domain.Category;
import com.onlineexam.domain.Question;
import com.onlineexam.service.QuestionService;
/**
 * 
 * @author chenecho
 *
 */
public class QuestionServiceImpl implements QuestionService {
	private QuestionDAO questionDAO;
	private CategoryDAO categoryDAO;
	
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		Date today = new Date();
		category.setLastModified(today);
		category.setCreated(today);
		category = categoryDAO.makePersistent(category);	
		return category;
	}
	
	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		Date today = new Date();
		category.setLastModified(today);
		category = categoryDAO.makePersistent(category);	
		return category;
	}
	
	public void removeCategory(int categoryID) {
		// TODO Auto-generated method stub
		Category category = categoryDAO.findById(categoryID, false);
		categoryDAO.makeTransient(category);
	}
	
	public Question addQuestion(Question question){
		Date today = new Date();
		question.setCreated(today);
		question.setLastModified(today);
		return questionDAO.makePersistent(question);		
	}
	
	public Question updateQuestion(Question question){
		Date today = new Date();
		question.setLastModified(today);
		return questionDAO.makePersistent(question);		
	}
	
	public void removeQuestion(int questionID){
		Question question = questionDAO.findById(questionID, false);
		questionDAO.makeTransient(question);
	}
	
	public Category getCategoryByID(int ID) {
		return categoryDAO.findById(ID, false);
		// TODO Auto-generated method stub		
	}

	public Question getQuestionByID(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

//	public void save(Question question) {
//		questionDAO.makePersistent(question);
//		// TODO Auto-generated method stub
//	}

	public CategoryDAO getCategoryDAO() {
		return categoryDAO;
	}

	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

	public QuestionDAO getQuestionDAO() {
		return questionDAO;
	}

	public void setQuestionDAO(QuestionDAO questionDAO) {
		this.questionDAO = questionDAO;
	}
	
}
