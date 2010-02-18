package com.onlineexam.service;

import com.onlineexam.domain.Category;
import com.onlineexam.domain.Question;
/**
 * 
 * @author chenecho
 *
 */
public interface QuestionService {
	public void save(Category category) ;
	public void save(Question question) ;
	public Category getCategoryByID(int ID) ;
	public Question getQuestionByID(int ID) ;
}
