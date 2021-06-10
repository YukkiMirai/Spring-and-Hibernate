package com.yukki.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yukki.entity.Employee;

public class RetrieveEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		try {
			// begin transaction
			session.beginTransaction();
			// retrieve
			System.out.println("All employee");
			List<Employee> employees = session.createQuery("from Employee").getResultList();
			
			displayEmployeeList(employees);
			
			// retrieve employee with id
			int employeeId = 1;
			System.out.println("retrive employee with id :" + employeeId);
			Employee employee = session.get(Employee.class, employeeId);
			System.out.println(employee);

			// find employee for company

			System.out.println("retrieve employee for Idol company");
			employees = session.createQuery("from Employee where company = 'Idol'").getResultList();
			displayEmployeeList(employees);

			// commit
			session.getTransaction().commit();
			System.out.println("oh no");
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
