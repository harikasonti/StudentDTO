package com.student.app.util;

import org.springframework.stereotype.Component;

import com.student.app.dto.StudentBasicDetailsDTO;
import com.student.app.dto.SudentSavePostDTO;
import com.student.app.entity.Student;

@Component
public class StudentDTOConversionClass {
	public StudentBasicDetailsDTO getStudentBasicDetailsDTO(Student student) {
		StudentBasicDetailsDTO dtoObj=new StudentBasicDetailsDTO();
		dtoObj.setStudentName(student.getStudentName());
		dtoObj.setEmail(student.getEmail());
		dtoObj.setAge(student.getAge());
		dtoObj.setDateOfBirth(student.getDateOfBirth());
		
		return dtoObj;
		
	}
	
	public Student getStudentFromPostStudentDTO(SudentSavePostDTO dto)
	{
		Student a = new Student();
		a.setStudentName(dto.getStudentName());
		a.setAge(dto.getAge());
		return a;
	}

}
