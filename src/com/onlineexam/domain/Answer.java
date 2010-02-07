/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * @author Joe Zhu
 *
 */

@Entity
@Table(name = "EXAM_ANSWERS")
public class Answer implements Serializable{
	// common attributes for all POJO
	@Id
	@GeneratedValue
	@Column(name = "ANSWER_ID")
	private int id;

	@Version
	@Column(name = "OBJ_VERSION")
	private int version = 0;
	
	//other attributes
	@OneToOne
	@JoinColumn(name = "Question_ID", nullable = false)
	private Question question;
	
	@Column(name = "EXAM_ANSWER", nullable = true)
	private int answer; 
	
	//if the question is once every page
	@Column(name = "IS_MARK_REVIEW", nullable = true)
	private boolean markReview;
	
	@Column(name = "IS_ANSWERED", nullable = true)
	private boolean answered;
	
	// ********************** Constructor ********************** //
	
	public Answer(Question question) {
		super();
		this.question = question;
	}
	
	public int getVersion() {
		return version;
	}


	public int getId() {
		return id;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public boolean isMarkReview() {
		return markReview;
	}

	public void setMarkReview(boolean markReview) {
		this.markReview = markReview;
	}

	public boolean isAnswered() {
		return answered;
	}

	public void setAnswered(boolean answered) {
		this.answered = answered;
	}
	
}
