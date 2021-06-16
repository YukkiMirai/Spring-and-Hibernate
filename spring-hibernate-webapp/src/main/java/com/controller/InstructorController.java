package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Instructor;
import com.service.InstructorService;

@Controller
@RequestMapping("/instructor")
public class InstructorController {

	@Autowired
	private InstructorService instructorService;

	@GetMapping("/list")
	public String getInstructor(Model theModel) {

		List<Instructor> theInstructors = instructorService.getInstructors();

		theModel.addAttribute("instructors", theInstructors);

		return "/list-instructors";
	}

	@RequestMapping("/showFormForAdd")
	public String addInstructor(Model theModel) {

		Instructor instructor = new Instructor();

		theModel.addAttribute("instructor", instructor);

		return "/instructor-form";
	}

	@RequestMapping("/saveInstructor")
	public String saveInstructor(@ModelAttribute("instructor") Instructor theInstructor) {

		instructorService.saveInstructor(theInstructor);

		return "redirect:/instructor/list";
	}

	@RequestMapping("/showFormForUpdate")
	public String updateInstructor(@RequestParam("instructorId") int theId, Model theModel) {

		Instructor instructor = instructorService.getInstructor(theId);

		theModel.addAttribute("instructor", instructor);

		return "/instructor-form";
	}

	@RequestMapping("/delete")
	public String deleteInstructor(@ModelAttribute("instructorId") int theId) {

		instructorService.deleteInstructor(theId);

		return "redirect:/instructor/list";
	}

	@RequestMapping("/detail")
	public String detailInstructor(@RequestParam("instructorId") int theId, Model theModel) {
		Instructor theInstructor = instructorService.getInstructor(theId);
		
		theModel.addAttribute("instructor", theInstructor);
		
		return "/instructor-detail";
	}
	
	@RequestMapping("/showFormForUpdateDetail")
	public String updateInstructorDetail(@RequestParam("instructorId") int theId, Model theModel) {

		Instructor instructor = instructorService.getInstructor(theId);

		theModel.addAttribute("instructor", instructor);

		return "/instructor-detail-form";
	}
	
	@RequestMapping("/saveInstructorDetail")
	public String saveInstructorDetail(@ModelAttribute("instructor") Instructor theInstructor) {

		instructorService.saveInstructor(theInstructor);

		return "redirect:/instructor/detail?instructorId="+theInstructor.getId();
	}
}
