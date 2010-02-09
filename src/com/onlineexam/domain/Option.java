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
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * @author Joe Zhu
 *
 */
@Entity
@Table(name = "QUSTION_OPTION")
public class Option implements Serializable{
	// common attributes for all POJO
	@Id
	@GeneratedValue
	@Column(name = "OPTION_ID")
	private int id;



	@Version
	@Column(name = "OBJ_VERSION")
	private int version = 0;
	
	@Column(name = "OPTION_CONTENT", length = 1000, nullable = false)
	private String optionContent;
	
	@Column(name = "IS_CORRECT", nullable = false)
	private boolean correct;
	
	
	
	public Option(String optionContent, boolean correct) {
		super();
		this.optionContent = optionContent;
		this.correct = correct;
	}
	
	public Option(){}

	public int getVersion() {
		return version;
	}

	public int getId() {
		return id;
	}
	
	public String getOptionContent() {
		return optionContent;
	}

	public void setOptionContent(String optionContent) {
		this.optionContent = optionContent;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	
	

}
