package com.luv2code.hibernate.demo;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


 
public class CreateDemo {
 
    public static void main(String[] args) {
        
        // create session factory
        SessionFactory factory = new Configuration()
        		.configure("hibernate.cfg.xml")
        		.addAnnotatedClass(Instructor.class)
        		.addAnnotatedClass(InstructorDetail.class)
        		.buildSessionFactory();
                
        // create a session
        Session session = factory.getCurrentSession();
 
        try {
        	
        	// create the objects
        	/*Instructor tempInstructor = 
        			new Instructor("Chad", "Darby", "darby@luv2code.com");
        	InstructorDetail tempInstructorDetail=
        			new InstructorDetail("Http://www.luv2code.com/youtube",
        					"luv 2 code !!!");*/
        	// create the objects
        	Instructor tempInstructor = 
        			new Instructor("Madhu", "Patel", "madhu@luv2code.com");
        	InstructorDetail tempInstructorDetail=
        			new InstructorDetail("Http://www.youtube.com",
        					"Guitar!!!");
        	// associate the objects
        	tempInstructor.setInstructorDetail(tempInstructorDetail);
        	
            // start transaction
            session.beginTransaction();
            
            // save the instructor
            //
            // Note: this will AlSO save the details onject
            // because of CascadeType.All
            //
            System.out.println("Saveing instructor: "+tempInstructor);
            session.save(tempInstructor);
         
            // commit transaction
            session.getTransaction().commit();
            System.out.println("Success!");
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            factory.close();
        }
    }
    
}