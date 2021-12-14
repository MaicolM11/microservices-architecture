package com.uptc.students.services;

import java.util.List;

import com.uptc.commonsmicroservices.services.CommonServiceImpl;
import com.uptc.students.repository.StudentRepository;
import org.springframework.transaction.annotation.Transactional;

import com.uptc.commons.students.entities.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends CommonServiceImpl<Student, StudentRepository> implements StudentService {

	@Override
    @Transactional(readOnly = true)
	public List<Student> findByNameOrLastName(String term) {
		return repository.findByNameOrLastName(term);
	}
    
}
