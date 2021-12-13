package com.uptc.students.repository;

import com.uptc.students.entities.Student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long>{

}