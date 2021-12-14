package com.uptc.students.repository;

import java.util.List;

import com.uptc.commons.students.entities.Student;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

    @Query("select s from Student s where s.name like  %?1% or s.lastName like %?1%")
    public List<Student> findByNameOrLastName(String term); 
}