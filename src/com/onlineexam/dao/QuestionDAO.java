package com.onlineexam.dao;

import java.util.List;

import com.onlineexam.domain.Category;
import com.onlineexam.domain.Option;
import com.onlineexam.domain.Question;

/**
 * 
 * @author chenecho
 *
 */
public interface QuestionDAO extends GenericDAO<Question>{
	public List<Question> getRandomeQuestions(Category category);
	public List<Option> getCorrectOptions(Question question);
}
