/**
 * Software Engineering Course task
 * copyright 2010 USS.
 */
package com.onlineexam.dao;

import java.util.List;

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

}
