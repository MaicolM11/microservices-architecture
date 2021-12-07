package com.uptc.students.repository;

import com.uptc.students.entity.Student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long>{

}