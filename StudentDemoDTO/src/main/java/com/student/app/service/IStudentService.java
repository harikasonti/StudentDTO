package com.student.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.app.dto.StudentBasicDetailsDTO;
import com.student.app.dto.SudentSavePostDTO;
import com.student.app.entity.Student;

@Service
public interface IStudentService {
	public List<Student> getAllStudent();
	public List<Student> getStudentsByCourse(String course);
	public StudentBasicDetailsDTO saveStudent(SudentSavePostDTO student);
}
