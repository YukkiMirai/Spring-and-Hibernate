package com.service;

import java.util.List;

import com.entity.Course;
import com.entity.Instructor;

public interface InstructorService {
	public List<Instructor> getInstructors();

	public void saveInstructor(Instructor theInstructor);

	public Instructor getInstructor(int theId);

	public void deleteInstructor(int theId);

	public void saveCourse(Course theCourse, int theInstructorId);
}
