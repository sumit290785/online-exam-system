/**
 * Software Engineering Course task
 * copyright © 2010 USS.
 */
package com.onlineexam.domain;

/**
 * Basic JavaBean domain object with an id property.
 * @author Joe Zhu
 *
 */
public class BaseEntity {

	private Integer id;
	

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public boolean isNew() {
		return (this.id == null);
	}

}