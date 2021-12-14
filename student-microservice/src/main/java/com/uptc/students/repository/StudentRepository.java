package com.uptc.students.repository;


import com.uptc.commons.students.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}