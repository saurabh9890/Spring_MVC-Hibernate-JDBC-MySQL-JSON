package main.java.springapp.customer.dao;

import main.java.springapp.customer.model.Customer;
	 
	public interface CustomerDao 
	{
		public void insert(Customer customer);
		public Customer findByCustomerId(int custId);
	}