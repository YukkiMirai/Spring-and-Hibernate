package com.yukki.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yukki.entity.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			/*
			 * Employee employee = new Employee("i", "love", "you");
			 * 
			 * Employee employee_update = session.get(Employee.class, 1);
			 * 
			 * System.out.println("update for: "+ employee_update);
			 * employee_update.setFirstName(employee.getFirstName());
			 * employee_update.setLastName(employee.getLastName());
			 * employee_update.setCompany(employee.getCompany());
			 * System.out.println("Updating ........"); System.err.println("Done!");
			 * employee_update = session.get(Employee.class, 1);
			 * System.out.println(employee_update);
			 */
			
			session.createQuery("update Employee set company = 'i love you somuch'").executeUpdate();
			
			
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
		
		
				
	}

}
