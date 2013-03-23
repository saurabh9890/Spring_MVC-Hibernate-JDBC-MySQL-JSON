package main.java.springapp.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import main.java.springapp.customer.dao.CustomerDao;
import main.java.springapp.customer.model.Customer;
 
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    		new ClassPathXmlApplicationContext("Spring-Module.xml");
 
        CustomerDao customerDao = (CustomerDao) context.getBean("customerDAO");
        Customer customer = new Customer(3, "Sarthak",10);
      //  customerDao.insert(customer);
 
        Customer customer1 = customerDao.findByCustomerId(2);
        System.out.println("Customer Name : " + customer1.getName() +"\nCustomer Age: "+customer1.getAge()+"\nCustomer ID: "+customer1.getCustId());
 
    }
}