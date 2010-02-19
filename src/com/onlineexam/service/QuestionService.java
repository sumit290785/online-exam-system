package com.onlineexam.service;

import com.onlineexam.domain.Category;
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
	public Question getQuestionByID(int ID) ;
	public Question addQuestion(Question question);
	public Question updateQuestion(Question question);
	public void removeQuestion(int questionID);

}
