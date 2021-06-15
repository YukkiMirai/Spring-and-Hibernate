package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="title")
	private String title;

	@Column(name="instructor_id")
	private Instructor instructor;
	
	public Course() {
		
	}

	public Course(String title) {
		this.title = title;
	}

	
}
