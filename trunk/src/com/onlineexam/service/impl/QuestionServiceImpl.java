package com.onlineexam.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.onlineexam.dao.CategoryDAO;
import com.onlineexam.dao.OptionDAO;
import com.onlineexam.dao.QuestionDAO;
import com.onlineexam.domain.Answer;
import com.onlineexam.domain.Category;
import com.onlineexam.domain.Option;
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
	private OptionDAO optionDAO;	
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
		return questionDAO.findById(ID, false);
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

	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		List<Category> result = categoryDAO.findAll();
		return result;
	}

	@Override
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		List<Question> result = questionDAO.findAll();
		return result;
	}

	@Override
	public Category getCategoryByName(String name) {
		// TODO Auto-generated method stub
		return categoryDAO.getCategoryByName(name);
	}

	@Override
	public Option getOptionByID(int ID) {
		// TODO Auto-generated method stub
		
		return optionDAO.findById(ID, false);
	}

	@Override
	public void removeOption(int ID) {
		// TODO Auto-generated method stub
		System.out.println("DELETING"+ID);
		Option option = optionDAO.findById(ID, false);
		optionDAO.makeTransient(option);
		
	}

	@Override
	public Option updateOption(Option option) {
		// TODO Auto-generated method stub
		return optionDAO.makePersistent(option);
	}

	public OptionDAO getOptionDAO() {
		return optionDAO;
	}

	public void setOptionDAO(OptionDAO optionDAO) {
		this.optionDAO = optionDAO;
	}
	
}
