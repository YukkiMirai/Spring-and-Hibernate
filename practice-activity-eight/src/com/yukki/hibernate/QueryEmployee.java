package com.yukki.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yukki.entity.Employee;

public class QueryEmployee {
	public static void main(String[] args) {
		
		// create factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		// create session
		
		Session session = factory.getCurrentSession();
		
		// start transaction
		session.beginTransaction();
		
		Employee emp1 = new Employee("Assuna", "Yfuukiff", "Idollll");
		Employee emp2 = new Employee("Bssakieee", "Yuufkie", "Sidaee");
		
		session.save(emp1);
		session.save(emp2);
		
		// commit transaction
		session.getTransaction().commit();
	}
}
