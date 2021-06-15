package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(int theId);
	
	public List<Customer> getCustomers();
	
	public void updateCustomer(int theId);
	
	public void deleteCustomer(int theId);
}
