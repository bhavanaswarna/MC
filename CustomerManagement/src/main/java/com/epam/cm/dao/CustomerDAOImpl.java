package com.epam.cm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epam.cm.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public List<Customer> getCustomers() {
		Session currentSession = sessionFactory.getCurrentSession();
		final Query<Customer> theQuery = currentSession.createQuery("from Customer order by firstName",Customer.class);
		final List<Customer> customers = theQuery.getResultList();
		return customers;
	}

	
	public void saveCustomer(Customer theCustomer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCustomer);
		
	}


	public Customer getCustomer(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Customer theCustomer = currentSession.get(Customer.class, theId);
		return theCustomer;
	}


	public void deleteCustomer(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Customer theCustomer = currentSession.get(Customer.class, theId);
		currentSession.delete(theCustomer);
		
	}
}
