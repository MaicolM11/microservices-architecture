package com.uptc.examsmicroservice.repository;

import java.util.List;

import com.uptc.examsmicroservice.entities.Exam;
import org.springframework.data.repository.CrudRepository;

public interface ExamRepository extends CrudRepository<Exam, Long>{

    List<Exam> findByNameOrLastName(String term);
    
}
