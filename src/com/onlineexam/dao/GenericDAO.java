/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

/**
 * @author zhujoe
 *
 */
public interface GenericDAO<T> {

    T findById(int id, boolean lock);

    List<T> findAll();

    List<T> findByExample(T exampleInstance, String... excludeProperty);

    T makePersistent(T entity);

    void makeTransient(T entity);
    
	List<T> executeQuery(DetachedCriteria query);

}
