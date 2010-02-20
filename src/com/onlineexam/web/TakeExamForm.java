/**
 * 
 */
package com.onlineexam.web;

import java.util.Map;
import java.util.TimerTask;
import java.util.TreeMap;

import com.onlineexam.util.ExamTerminatorUtil;
import com.onlineexam.util.FacesUtil;

/**
 * @author Joel Tsai
 *
 */
public class TakeExamForm {
	
	private Map<String, String> optionMap;
	
	private String questionName;
	
	private String questionId;
	
	private String answer;
	
	private int questionNumber;
	
	private boolean fstQuestion;
	private boolean lastQuesion;

	public TakeExamForm() {
		questionName = "sdfdsfdsfsdfsdfsdfsdfsdf";
		optionMap = new TreeMap<String, String>();
		optionMap.put("《COSMOPOLITAN》的内容", "1");
		optionMap.put("《COSMOPOLITAN》的发行情况", "2");
		optionMap.put("《COSMOPOLITAN》现在有48个版本", "3");
		optionMap.put("10年03月刊封面 Carrie Underwood(凯莉·安德伍德", "4");
		fstQuestion = false;
		lastQuesion = true;
		questionNumber = 40;
	}

	public String showPreQuest() {

		return "";
	}
	
	public String showNxtQuest() {
		System.out.println("answer:" + answer);
		FacesUtil.getServletRequest().setAttribute("passedTime", String.valueOf(ExamTerminatorUtil.getCurrentTerminatorRemainingTime()));
		return "";
	}

	public String finish() {
		return "FINISH_EXAM";
	}
	/**
	 * @return the optionMap
	 */
	public Map<String, String> getOptionMap() {
		return optionMap;
	}

	/**
	 * @param optionMap the optionMap to set
	 */
	public void setOptionMap(Map<String, String> optionMap) {
		this.optionMap = optionMap;
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

	
}
