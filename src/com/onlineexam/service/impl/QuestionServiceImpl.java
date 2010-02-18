package com.onlineexam.service.impl;

import com.onlineexam.dao.CategoryDAO;
import com.onlineexam.dao.QuestionDAO;
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
	public void save(Category category) {
		// TODO Auto-generated method stub
		categoryDAO.makePersistent(category);
		
	}

	public Category getCategoryByID(int ID) {
		return categoryDAO.findById(ID, false);
		// TODO Auto-generated method stub		
	}

	public Question getQuestionByID(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Question question) {
		questionDAO.makePersistent(question);
		// TODO Auto-generated method stub
	}

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
