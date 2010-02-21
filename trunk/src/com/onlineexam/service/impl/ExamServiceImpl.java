/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.onlineexam.dao.AnswerDAO;
import com.onlineexam.dao.CategoryDAO;
import com.onlineexam.dao.ExamDAO;
import com.onlineexam.dao.OptionDAO;
import com.onlineexam.dao.QuestionDAO;
import com.onlineexam.dao.UserDAO;
import com.onlineexam.domain.Answer;
import com.onlineexam.domain.Category;
import com.onlineexam.domain.Exam;
import com.onlineexam.domain.Option;
import com.onlineexam.domain.Question;
import com.onlineexam.domain.User;
import com.onlineexam.service.ExamService;

/**
 * @author zhujoe
 *
 */
public class ExamServiceImpl implements ExamService {
	
	private ExamDAO examDAO;
	private CategoryDAO categoryDAO;
	private QuestionDAO questionDAO;
	private AnswerDAO answerDAO;
	private UserDAO userDAO;
	private OptionDAO optionDAO;
	/* (non-Javadoc)
	 * @see com.onlineexam.service.ExamService#caculateScore(com.onlineexam.domain.Exam)
	 */
	private int caculateScore(Exam exam) {
		List<Answer> answerLst = new ArrayList<Answer>(exam.getAnswers()); 
		int passedQuestion =0;
		for (int i=0;i<answerLst.size();i++){
			Answer answer = answerLst.get(i);
			if (answer.getAnswers().equals(questionDAO.getCorrectOptions(answer.getQuestion()))){
				passedQuestion++;
			}
		}
		return 	(exam.getCategory().getTotalScore()/exam.getCategory().getTotalQuestions())*passedQuestion;
	}
	

	/* (non-Javadoc)
	 * @see com.onlineexam.service.ExamService#createExam(com.onlineexam.domain.User)
	 */
	public Exam createExam(String userName,int categoryID) {
		// TODO Auto-generated method stub
		User user = userDAO.getUser(userName);
		Category category = categoryDAO.findById(categoryID, false);
		List<Question> questionList = questionDAO.getRandomeQuestions(category);
		if (questionList.size()<category.getTotalQuestions()){
			return null;
		}
		List<Answer> answerList = answerDAO.initialAnswers(questionList);
		Exam exam = examDAO.createExam(category, user, answerList);
		return exam;
	}

	public ExamDAO getExamDAO() {
		return examDAO;
	}

	public void setExamDAO(ExamDAO examDAO) {
		this.examDAO = examDAO;
	}

	public Exam submitExam(int examID) {
		// TODO Auto-generated method stub
		Exam exam = examDAO.findById(examID, false);
		Date today = new Date();
		exam.setLastModified(today);
		exam.setScore(this.caculateScore(exam));
		exam = examDAO.makePersistent(exam);
		return exam;
	}
	
	public Answer submitAnswer(int answerID, int... optionID){
		Answer answer = answerDAO.findById(answerID, false);
		List<Option> optLst = new ArrayList<Option>();
		for (int id:optionID){
			Option option = optionDAO.findById(id, false);
			optLst.add(option);
		}
		answer.setAnswers(new HashSet<Option>(optLst));
		answer.setAnswered(true);
		answer = answerDAO.makePersistent(answer);
		return answer;
	}


	public Answer getQuestion(int examID, int seqNUM, Boolean isLAST) {
		// TODO Auto-generated method stub
		isLAST = Boolean.FALSE;
		Answer answer = answerDAO.findByExamIDAndSeqNUM(examID, seqNUM); 
		Exam exam = examDAO.findById(examID, false);
		if (exam.getCategory().getTotalQuestions()==seqNUM)
			isLAST = Boolean.TRUE;
		return answer;
	}


	public AnswerDAO getAnswerDAO() {
		return answerDAO;
	}


	public void setAnswerDAO(AnswerDAO answerDAO) {
		this.answerDAO = answerDAO;
	}


	public CategoryDAO getCategoryDAO() {
		return categoryDAO;
	}


	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}


	public OptionDAO getOptionDAO() {
		return optionDAO;
	}


	public void setOptionDAO(OptionDAO optionDAO) {
		this.optionDAO = optionDAO;
	}


	public QuestionDAO getQuestionDAO() {
		return questionDAO;
	}


	public void setQuestionDAO(QuestionDAO questionDAO) {
		this.questionDAO = questionDAO;
	}


	public UserDAO getUserDAO() {
		return userDAO;
	}


	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}