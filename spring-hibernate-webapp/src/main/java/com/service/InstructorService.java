package com.service;

import java.util.List;

import com.entity.Instructor;

public interface InstructorService {
	public List<Instructor> getInstructors();

	public void addInstructor(Instructor theInstructor);

	public Instructor getInstructor(int theId);

	public void deleteInstructor(int theId);
}
