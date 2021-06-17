package com.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Course;
import com.entity.Instructor;

@Repository
public class InstructorDAOImpl implements InstructorDAO {
	
	// injection SessionFactory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Instructor> getInstructors() {
		
		Session session = sessionFactory.getCurrentSession();
		
		List<Instructor> instructors = session.createQuery("from Instructor", Instructor.class).getResultList();
		
		return instructors;
	}

	@Override
	public void addInstructor(Instructor theInstructor) {
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(theInstructor);
		
	}

	@Override
	public Instructor getInstructor(int theId) {
		Session session = sessionFactory.getCurrentSession();
		
		Instructor theInstructor = session.get(Instructor.class, theId);
		
		return theInstructor;
	}

	@Override
	public void deleteInstructor(int theId) {
		Session session = sessionFactory.getCurrentSession();
		
		Query query =session.createQuery("delete from Instructor where id = :instructorId");
		
		query.setParameter("instructorId", theId);
		
		query.executeUpdate();
		
	}

	@Override
	public void saveCourse(Course theCourse, int theInstructorId) {
		Session session = sessionFactory.getCurrentSession();
		
		session.save(theCourse);
		
		Instructor theInstructor = session.get(Instructor.class, theInstructorId);
		
		theInstructor.addCourse(theCourse);
		
	}
	
	
}
