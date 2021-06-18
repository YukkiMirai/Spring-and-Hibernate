package com.dao;

import java.util.List;

import com.entity.Course;
import com.entity.Instructor;

public interface InstructorDAO {
	
	public List<Instructor> getInstructors();

	public void addInstructor(Instructor theInstructor);

	public Instructor getInstructor(int theId);

	public void deleteInstructor(int theId);

	public void saveCourse(Course theCourse);
	
}
