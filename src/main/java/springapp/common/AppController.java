package main.java.springapp.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import main.java.springapp.customer.dao.CustomerDao;
import main.java.springapp.customer.model.Customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
 
public class AppController extends AbstractController{
 
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
 
		
		ApplicationContext context = 
	    		new ClassPathXmlApplicationContext("Spring-Module.xml");
	 
	        CustomerDao customerDao = (CustomerDao) context.getBean("customerDAO");
	        Customer customer = new Customer(10, "Brad1",31);
	        customerDao.insert(customer);
	 
	        Customer customer1 = customerDao.findByCustomerId(5);
	        System.out.println("Customer Name : " + customer1.getName() +"\nCustomer Age: "+customer1.getAge()+"\nCustomer ID: "+customer1.getCustId());
	 
		
		ModelAndView model = new ModelAndView("cust");
		model.addObject("msg", customer1.getName());
		model.addObject("msg1", customer1.getCustId());
		
		return model;
	}
}