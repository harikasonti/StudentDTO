package com.student.app.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.app.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IStudentRepository extends CrudRepository<Student, Integer>,
CustomStudentRepository{

}
