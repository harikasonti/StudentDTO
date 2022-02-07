package com.student.app.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.student.app.entity.Student;
@Repository
public interface CustomStudentRepository {
	public List<Student> getStudentsByCourse(String course);

}
