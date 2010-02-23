/**
 * 
 */
package com.onlineexam.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.faces.model.SelectItem;

import com.onlineexam.domain.Answer;
import com.onlineexam.domain.Option;
import com.onlineexam.domain.Question;
import com.onlineexam.main.ServiceHandler;
import com.onlineexam.service.ExamService;
import com.onlineexam.util.ExamTerminatorUtil;
import com.onlineexam.util.FacesUtil;
import com.onlineexam.util.InterBoolean;

/**
 * @author Joel Tsai
 *
 */
public class TakeExamForm {
	
	private String questionName;
	
	private String questionId;
	
	private String answer;
	private int answerId;
	
	private int questionNumber = 1;
	
	private boolean fstQuestion;
	private boolean lastQuesion;

	private List<SelectItem> optionItems = new ArrayList<SelectItem>();
	
	public TakeExamForm() {	
		fetchQuestion();
	}
	
	public String showPreQuest() {
		questionNumber--;
		fetchQuestion();
		setPassedTime();
		submitAnswer();
		return "";
	}
	
	public String showNxtQuest() {
		questionNumber++;
		fetchQuestion();
		setPassedTime();
		submitAnswer();
		System.out.println("answer:" + answer);
		return "";
	}

	public String finish() {
		return "FINISH_EXAM";
	}

	private void submitAnswer() {
		if (answer != null && !"".equals(answer)) {
			ExamService examService = (ExamService) ServiceHandler.getInstance().getService("examService");
			examService.submitAnswer(answerId, Integer.parseInt(answer));
		}
	}
	private void setPassedTime() {
		FacesUtil.getServletRequest().setAttribute("passedTime", String.valueOf(ExamTerminatorUtil.getCurrentTerminatorRemainingTime()));
	}
	
	private void fetchQuestion() {
		ExamService examService = (ExamService) ServiceHandler.getInstance().getService("examService");
		InterBoolean lastQuestionIndicator = new InterBoolean();
		Answer answer = examService.getQuestion(1, questionNumber, lastQuestionIndicator);
		if (lastQuestionIndicator.isInterBoolean()) {
			lastQuesion = true;
		} else {
			lastQuesion = false;
		}
		answerId = answer.getId();
		System.out.println("----is last question:" + lastQuesion);
		Question question = answer.getQuestion();
		questionName = question.getQuestionContent();
		questionId = String.valueOf(question.getId());
		Set<Option> options = question.getOptions();
		for (Option option : options) {
			optionItems.add(new SelectItem(option.getId(),option.getOptionContent()));
		}
		if (questionNumber == 1) {
			fstQuestion = true;
		} else {
			fstQuestion = false;
		}
	}

	/**
	 * @return the questionName
	 */
	public String getQuestionName() {
		return questionName;
	}

	/**
	 * @param questionName the questionName to set
	 */
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	/**
	 * @return the questionId
	 */
	public String getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * @return the fstQuestion
	 */
	public boolean isFstQuestion() {
		return fstQuestion;
	}

	/**
	 * @param fstQuestion the fstQuestion to set
	 */
	public void setFstQuestion(boolean fstQuestion) {
		this.fstQuestion = fstQuestion;
	}




	/**
	 * @return the lastQuesion
	 */
	public boolean isLastQuesion() {
		return lastQuesion;
	}

	/**
	 * @param lastQuesion the lastQuesion to set
	 */
	public void setLastQuesion(boolean lastQuesion) {
		this.lastQuesion = lastQuesion;
	}

	/**
	 * @return the questionNumber
	 */
	public int getQuestionNumber() {
		return questionNumber;
	}

	/**
	 * @param questionNumber the questionNumber to set
	 */
	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}

	/**
	 * @return the optionItems
	 */
	public List<SelectItem> getOptionItems() {
		return optionItems;
	}

	/**
	 * @param optionItems the optionItems to set
	 */
	public void setOptionItems(List<SelectItem> optionItems) {
		this.optionItems = optionItems;
	}

}
