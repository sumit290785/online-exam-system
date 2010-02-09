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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * @author Joe Zhu
 * 
 */
@Entity
@Table(name = "EXAMS")
public class Exam implements Serializable{
	
	// common attributes for all POJO
	@Id
	@GeneratedValue
	@Column(name = "EXAM_ID")
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
	
	//other attributes
	@Column(name = "USED_TIME", nullable = false)
	private int usedTime;
	
	@Column(name = "EXAM_SCORE", nullable = true)
	private int score;
	
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "EXAM_ID", nullable = false)
	private Set<Answer> answers = new HashSet<Answer>();
	
	@OneToOne
	@JoinColumn(name = "CATEGORY_ID", nullable = false)
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID", nullable = false)
	private User user;
	
	// ********************** Constructor ********************** //

	public Exam(int usedTime, Set<Answer> answers, Category category) {
		super();
		this.usedTime = usedTime;
		this.answers = answers;
		this.category = category;
	}
	public Exam(){}
	
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

	public int getUsedTime() {
		return usedTime;
	}

	public void setUsedTime(int usedTime) {
		this.usedTime = usedTime;
	}

	public Set<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
