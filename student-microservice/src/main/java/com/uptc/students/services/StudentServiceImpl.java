package com.uptc.students.services;

import com.uptc.commonsmicroservices.services.CommonServiceImpl;
import com.uptc.students.models.Student;
import com.uptc.students.repository.StudentRepository;

//import com.uptc.commons.students.entities.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends CommonServiceImpl<Student, StudentRepository> implements StudentService {
    
}
