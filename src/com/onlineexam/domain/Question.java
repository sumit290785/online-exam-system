/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * @author Joe Zhu
 * 
 */

@Entity
@Table(name = "QUESTIONS")
public class Question implements Serializable {
	// common attributes for all POJO
	@Id
	@GeneratedValue
	@Column(name = "QUESTION_ID")
	private int id;

	@Version
	@Column(name = "OBJ_VERSION")
	private int version = 0;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED", nullable = false, updatable = false)
	private Date created = new Date();

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LASTMODIFIED", nullable = false, updatable = true)
	private Date lastModified = new Date();

	@Column(name = "QUESTION_CONTENT", length = 1000, nullable = false)
	private String questionContent;
	
	//for new function like essay
	@Column(name = "IS_ESSAY", nullable = false)
	private boolean essay = false;
	
	@Column(name = "OPTION_ANSWER", nullable = true)
	private int optionAnswer;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "QUESTION_ID", nullable = true)
	private Set<Option> options = new HashSet<Option>();

	@ManyToOne
	@JoinColumn(name = "CATEGORY_ID", nullable = false)
	private Category category;

	public int getVersion() {
		return version;
	}

	public int getId() {
		return id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Set<Option> getOptions() {
		return options;
	}

	public void setOptions(Set<Option> options) {
		this.options = options;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public boolean isEssay() {
		return essay;
	}

	public void setEssay(boolean essay) {
		this.essay = essay;
	}
	

	public int getOptionAnswer() {
		return optionAnswer;
	}

	public void setOptionAnswer(int optionAnswer) {
		this.optionAnswer = optionAnswer;
	}

	// ********************** Constructor ********************** //

	public Question(String questionContent, Set<Option> options,
			Category category) {
		this(questionContent, false, options, category);
	}

	public Question(String questionContent, boolean essay, Set<Option> options,
			Category category) {
		super();
		this.questionContent = questionContent;
		this.essay = essay;
		this.options = options;
		this.category = category;
	}

	// ********************** Common Methods ********************** //

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Question))
			return false;
		final Question question = (Question) o;
		return getQuestionContent().equalsIgnoreCase(
				question.getQuestionContent());
	}

	public int hashCode() {
		return getQuestionContent().hashCode();
	}

	public String toString() {
		return "Question ('" + getQuestionContent();
	}


}
