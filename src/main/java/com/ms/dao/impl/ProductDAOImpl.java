package com.ms.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ms.dao.ProductDAO;
import com.ms.entity.Product;
import com.ms.model.ProductPriceModel;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Product save(Product product) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(product);
		transaction.commit();
		session.close();
		return product;
	}

	@Override
	public Product update(Product product) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(product);
		transaction.commit();
		session.close();
		return product;
	}

	@Override
	public Product deleteById(int id) {
		Product product=findById(id);
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.delete(product);
		transaction.commit();
		session.close();
		return product;
	}

	@Override
	public Product findById(int id) {
		Session session=sessionFactory.openSession();
		Product product=session.get(Product.class, id);
		session.close();
		return product;
	}

	@Override
	public List<Product> findAll() {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Product.class);
		List<Product> products=criteria.list();
		session.close();
		return products;
	}

	@Override
	public List<Product> findByBrand(String brand) {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Product.class);
		criteria.add(Restrictions.eq("brand", brand));
		List<Product> products=criteria.list();
		session.close();
		return products;
	}
	@Override
	public List<Product> findByPriceRange(int low, int high){
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Product.class);
		criteria.add(Restrictions.between("price", low, high));
		List<Product> products=criteria.list();
		session.close();
		return products;
	}

	@Override
	public List<ProductPriceModel> findAllPriceList() {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Product.class);
		Projection pr1=Projections.property("name");
		Projection pr2=Projections.property("price");
		ProjectionList pList=Projections.projectionList();
		pList.add(pr1, "name");
		pList.add(pr2,"price");
		criteria.setProjection(pList);
		criteria.setResultTransformer(Transformers.aliasToBean(ProductPriceModel.class));
		List<ProductPriceModel> productPriceModelList=criteria.list();
		session.close();
		return productPriceModelList;
	}

}
