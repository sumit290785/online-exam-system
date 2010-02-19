/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * @author Joe Zhu
 * 
 */

@Entity
@Table(name = "EXAM_ANSWERS")
public class Answer implements Serializable {
	// common attributes for all POJO
	@Id
	@GeneratedValue
	@Column(name = "ANSWER_ID")
	private int id;

	@Version
	@Column(name = "OBJ_VERSION")
	private int version = 0;

	// other attributes

	@OneToOne
	@JoinColumn(name = "Question_ID", nullable = false)
	private Question question;

	@ManyToMany
	@JoinTable(name = "ANSWER_OPTION", joinColumns = { @JoinColumn(name = "ANSWER_ID") }, inverseJoinColumns = { @JoinColumn(name = "OPTION_ID") })
	private Set<Option> answers = new HashSet<Option>();

	// if the question is once every page
	@Column(name = "IS_MARK_REVIEW", nullable = true)
	private boolean markReview;

	@Column(name = "IS_ANSWERED", nullable = true)
	private boolean answered;
	
	@Column(name = "SEQUENCE_ID")
	private int sequenceId;

	// ********************** Constructor ********************** //

	public Answer(Question question) {
		super();
		this.question = question;
	}

	public Answer() {
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

	public Set<Option> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Option> answers) {
		this.answers = answers;
	}

	public int getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(int sequenceId) {
		this.sequenceId = sequenceId;
	}

	
}
