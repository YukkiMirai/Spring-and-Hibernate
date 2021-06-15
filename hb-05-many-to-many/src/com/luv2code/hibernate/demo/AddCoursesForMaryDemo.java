package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;
import com.luv2code.hibernate.demo.entity.Student;

public class AddCoursesForMaryDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class).addAnnotatedClass(Student.class).buildSessionFactory();

		// create a session
		Session session = factory.getCurrentSession();

		try {
			// start transaction
			session.beginTransaction();

			// get the student mary from database
			int studentId = 5;
			Student tempStudent = session.get(Student.class, studentId);

			System.out.println("\nLoaded student: " + tempStudent);
			System.out.println("Courses: " + tempStudent.getCourses());

			// create more courses
			Course tempCourse1 = new Course("Rubik Cube - How to Speed Cubev2");
			Course tempCourse2 = new Course("Atari 2600 - Game Developmentv2");
			/*
			// add student to courses 
			tempCourse1.addStudent(tempStudent);
			tempCourse2.addStudent(tempStudent);

			// save the courses System.out.println("\nSaving the courses ... ");
			*/
			session.save(tempCourse1);
			session.save(tempCourse2);
			
			tempStudent.addCourse(tempCourse1);
			tempStudent.addCourse(tempCourse2);
			session.save(tempStudent);
			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} catch (Exception exc) {

			exc.printStackTrace();
		} finally {
			// add clean up code
			session.close();

			factory.close();
		}
	}

}
