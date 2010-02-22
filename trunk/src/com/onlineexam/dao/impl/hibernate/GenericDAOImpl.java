/**
 * 
 */
package com.onlineexam.dao.impl.hibernate;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.hibernate.criterion.DetachedCriteria;

import com.onlineexam.dao.GenericDAO;
import com.onlineexam.main.HibernateUtil;

/**
 * @author zhujoe
 * 
 */
public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

	private Class<T> entityBeanType;

	private EntityManager em;

	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		this.entityBeanType = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
		this.em = HibernateUtil.getEntityManager();
	}

	/**
	 * get the EntityManger.
	 * 
	 * @return
	 */
	protected EntityManager getEntityManager() {
		if (em == null)
			throw new IllegalStateException(
					"EntityManager has not been set on DAO before usage");
		return em;
	}

	public Class<T> getEntityBeanType() {
		return entityBeanType;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		List<T> result = getEntityManager().createQuery(
				"from " + getEntityBeanType().getName()).getResultList();
		tx.commit();
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByExample(T exampleInstance, String... excludeProperty) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		org.hibernate.Criteria crit = ((org.hibernate.ejb.HibernateEntityManager) getEntityManager())
				.getSession().createCriteria(getEntityBeanType());
		org.hibernate.criterion.Example example = org.hibernate.criterion.Example
				.create(exampleInstance);
		for (String exclude : excludeProperty) {
			example.excludeProperty(exclude);
		}
		crit.add(example);
		List<T> result = crit.list();
		tx.commit();
		return result;
	}

	@Override
	public T findById(int id, boolean lock) {
		T entity;
		EntityTransaction tx = this.getEntityManager().getTransaction();
		tx.begin();
		if (lock) {
			entity = getEntityManager().find(getEntityBeanType(), id);
			em.lock(entity, javax.persistence.LockModeType.WRITE);
		} else {
			entity = getEntityManager().find(getEntityBeanType(), id);
		}
		tx.commit();
		return entity;
	}

	@Override
	public T makePersistent(T entity) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		T result = getEntityManager().merge(entity);
		tx.commit();
		return result;
	}

	@Override
	public void makeTransient(T entity) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		getEntityManager().remove(entity);
		tx.commit();

	}

	public void flush() {
		getEntityManager().flush();
	}

	public void clear() {
		getEntityManager().clear();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> executeQuery(DetachedCriteria query){
//		EntityTransaction tx = this.getEntityManager().getTransaction();;
		List<T> results = query.getExecutableCriteria(((org.hibernate.ejb.HibernateEntityManager) getEntityManager()).getSession()).list();
//		tx.commit();
		return results;
	}

}
