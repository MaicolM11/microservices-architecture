package com.uptc.students.services;

import com.uptc.commonsmicroservices.services.CommonService;

import org.springframework.stereotype.Service;

import com.uptc.commons.students.entities.Student;

@Service
public interface StudentService extends CommonService<Student> {
    
}