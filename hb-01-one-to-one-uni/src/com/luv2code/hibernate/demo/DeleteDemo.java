package com.luv2code.hibernate.demo;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


 
public class DeleteDemo {
 
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
             // start transaction
            session.beginTransaction();
           
            // get instructor by primary key / id
            int theId=1;
            Instructor tempInstructor = session.get(Instructor.class, theId);//return null if found
            
            System.out.println("Found instructor:" + tempInstructor);            
              
            // delete the instructors
            if(tempInstructor!=null) {
            	System.out.println("Deleting: "+tempInstructor);
            	// Note: will ALSO delete associated "details" object
            	// because of CacadeType.All
            	//
            	session.delete(tempInstructor);
            }
         
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