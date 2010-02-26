package com.onlineexam.dao.impl.hibernate;

import javax.persistence.Query;

import com.onlineexam.dao.CategoryDAO;
import com.onlineexam.domain.Category;
import com.onlineexam.domain.User;
/**
 * 
 * @author chenecho
 *
 */
public class CategoryDAOImpl extends GenericDAOImpl<Category> implements CategoryDAO{

	@Override
	public Category getCategoryByName(String name) {
		// TODO Auto-generated method stub
		Query q  = this.getEntityManager().createQuery("FROM Category where categoryName = ?");
		q.setParameter(1, name);
		Category category  = (Category) q.getSingleResult();
		return category;
	}

}
