package com.luv2code.hibernate.demo;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


 
public class CreateInstructorDemo {
 
    public static void main(String[] args) {
        
        // create session factory
        SessionFactory factory = new Configuration()
        		.configure("hibernate.cfg.xml")
        		.addAnnotatedClass(Instructor.class)
        		.addAnnotatedClass(InstructorDetail.class)
        		.addAnnotatedClass(Course.class)
        		.buildSessionFactory();
                
        // create a session
        Session session = factory.getCurrentSession();
 
        try {        	
     
        	// create the objects
        	Instructor tempInstructor = 
        			new Instructor("Susan", "Publicl", "madhu.susan@luv2code.com");
        	InstructorDetail tempInstructorDetail=
        			new InstructorDetail("Http://www.youtube.com",
        					"Video Games!!!");
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
        	//add clean up code
        	session.close();
        	
            factory.close();
        }
    }
    
}