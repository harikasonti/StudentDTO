package com.student.app.web;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.app.dto.StudentBasicDetailsDTO;
import com.student.app.dto.SudentSavePostDTO;
import com.student.app.entity.Student;
import com.student.app.service.IStudentService;


@RestController
@RequestMapping("/app")
@Validated
public class MyRestWebController {
	
	@Autowired
	IStudentService service;
	
	@GetMapping("/students")
	public List<Student> getAllStudent()
	{
		return service.getAllStudent();
	}
	
	@PostMapping("/student")
	public ResponseEntity<StudentBasicDetailsDTO> saveAccount(@RequestBody @Valid SudentSavePostDTO a)	{
		
		System.out.println("--->> "+a.getStudentName()+" - "+a.getAge());
		
		StudentBasicDetailsDTO dto =  service.saveStudent(a);
		return new ResponseEntity<StudentBasicDetailsDTO>(dto,HttpStatus.OK);
	}

	@GetMapping("/studentlist")
	public List<Student> getAllStudent(@RequestParam String course)
	{
		return service.getStudentsByCourse(course);
	}
}