package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.InstructorDAO;
import com.entity.Course;
import com.entity.Instructor;

@Service
public class InstructorServiceImpl implements InstructorService {
	
	@Autowired
	private InstructorDAO instructorDAO;
	
	@Override
	@Transactional
	public List<Instructor> getInstructors() {
		// TODO Auto-generated method stub
		return instructorDAO.getInstructors();
	}

	@Override
	@Transactional
	public void saveInstructor(Instructor theInstructor) {
		instructorDAO.addInstructor(theInstructor);		
	}

	@Override
	@Transactional
	public Instructor getInstructor(int theId) {
		
		return instructorDAO.getInstructor(theId);
	}

	@Override
	@Transactional
	public void deleteInstructor(int theId) {
		instructorDAO.deleteInstructor(theId);
		
	}

	@Override
	@Transactional
	public void saveCourse(Course theCourse) {
		instructorDAO.saveCourse(theCourse);
		
	}

}
