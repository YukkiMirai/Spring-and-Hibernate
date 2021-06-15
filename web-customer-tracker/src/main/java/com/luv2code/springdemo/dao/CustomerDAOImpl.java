package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveCustomer(Customer theCustomer) {
		int theId = theCustomer.getId();
		
		// get current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save theCustomer to database
		currentSession.saveOrUpdate(theCustomer);

	}

	@Override
	public Customer getCustomer(int theId) {
		int customerId = theId;
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// get Customer with customerId
		Customer theCustomer = currentSession.get(Customer.class, customerId);

		return theCustomer;
	}

	@Override
	public List<Customer> getCustomers() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query ... sort by last name
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);

		// execute query and get the result list
		List<Customer> customers = theQuery.getResultList();

		// return the results
		return customers;
	}

	@Override
	public void updateCustomer(int theId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCustomer(int theId) {
		// get current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// get Customer
		Customer theCustomer = currentSession.get(Customer.class, theId);
		
		// delete Customer
		currentSession.delete(theCustomer);

	}
	
}
