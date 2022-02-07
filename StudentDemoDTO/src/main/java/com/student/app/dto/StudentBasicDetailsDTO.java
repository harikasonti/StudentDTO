package com.student.app.dto;

import java.time.LocalDate;

public class StudentBasicDetailsDTO {
	private String studentName;
	private String email;
	private int age;
	private LocalDate dateOfBirth;
	public StudentBasicDetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public StudentBasicDetailsDTO(String studentName, String email, int age, LocalDate dateOfBirth) {
		super();
		this.studentName = studentName;
		this.email = email;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
	}
	

}
