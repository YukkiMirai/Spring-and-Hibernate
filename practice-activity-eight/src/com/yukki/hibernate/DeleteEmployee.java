package com.yukki.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yukki.entity.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			//
			session.beginTransaction();
			
			// delete with id =4;
			Employee employee = session.get(Employee.class, 4);
			session.delete(employee);
			List<Employee> e = session.createQuery("from Employee").getResultList();
			displayEmployeeList(e);
			
			
			// delete with id = 5
			session.createQuery("Delete from Employee where id = 5").executeUpdate();
			 e = session.createQuery("from Employee").getResultList();
			displayEmployeeList(e);
			//
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}

	private static void displayEmployeeList(List<Employee> employees) {
		for (Employee tempEmployee : employees) {
			System.out.println(tempEmployee);
		}
	}
}
