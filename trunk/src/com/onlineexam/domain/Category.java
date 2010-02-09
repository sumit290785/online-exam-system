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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "EXAM_CATEGORYS")
public class Category implements Serializable {

	// common attributes for all POJO
	@Id
	@GeneratedValue
	@Column(name = "CATEGORY_ID")
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

	// other attributes

	@Column(name = "CATEGORY_NAME", length = 50, nullable = false, unique = true)
	private String categoryName;

	@OneToMany(cascade = { CascadeType.REMOVE }, mappedBy = "category", fetch = FetchType.LAZY)
	private Set<Question> Questions = new HashSet<Question>();

	@Column(name = "TOTAL_SCORE", nullable = false)
	private int totalScore;

	@Column(name = "TOTAL_QUESTION", nullable = false)
	private int totalQuestions;

	@Column(name = "PASSED_SCORE", nullable = false)
	private int passedQuestions;

	@Column(name = "EXAM_TIME", nullable = false)
	private int examTime;

	// ********************** Constructor ********************** //

	public Category(String categoryName, int totalScore, int totalQuestions,
			int passedQuestions, int examTime) {
		super();
		this.categoryName = categoryName;
		this.totalScore = totalScore;
		this.totalQuestions = totalQuestions;
		this.passedQuestions = passedQuestions;
		this.examTime = examTime;
	}

	// ********************** Accessor Methods ********************** //
	
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

	public Set<Question> getQuestions() {
		return Questions;
	}

	public void setQuestions(Set<Question> questions) {
		Questions = questions;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public int getTotalQuestions() {
		return totalQuestions;
	}

	public void setTotalQuestions(int totalQuestions) {
		this.totalQuestions = totalQuestions;
	}

	public int getPassedQuestions() {
		return passedQuestions;
	}

	public void setPassedQuestions(int passedQuestions) {
		this.passedQuestions = passedQuestions;
	}

	public int getExamTime() {
		return examTime;
	}

	public void setExamTime(int examTime) {
		this.examTime = examTime;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	
	public String toString() {
		return "Category ('" + getCategoryName();
	}
}
