package main.java.springapp.customer.model;

import java.sql.Timestamp;

public class Customer 
{
	int custId;
	String name;
	int age;

	//getter and setter methods
	
	public Customer(int int1, String string, int int2) {
		// TODO Auto-generated constructor stub
		
		this.custId = int1;
		this.name = string;
		this.age = int2;
	}
	
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
 
}