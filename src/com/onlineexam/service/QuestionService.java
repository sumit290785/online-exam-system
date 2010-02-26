package com.onlineexam.service;

import java.util.List;

import com.onlineexam.domain.Category;
import com.onlineexam.domain.Option;
import com.onlineexam.domain.Question;
/**
 * 
 * @author chenecho
 *
 */
public interface QuestionService {
	public Category addCategory(Category category) ;
	public Category updateCategory(Category category);
	public void removeCategory(int categoryID) ;
	public Category getCategoryByID(int ID) ;
	public Category getCategoryByName(String name) ;
	public Question getQuestionByID(int ID) ;
	public Question addQuestion(Question question);
	public Question updateQuestion(Question question);
	public void removeQuestion(int questionID);
	public List<Category> getAllCategories();
	public List<Question> getAllQuestions();
	public Option getOptionByID(int ID);
	public void removeOption(int ID);
	public Option updateOption(Option option);
	public List<Category> getQuestionsByCategory(String name);
}
