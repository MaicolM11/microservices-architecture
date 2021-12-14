package com.uptc.students.services;

import com.uptc.commonsmicroservices.services.CommonService;
import com.uptc.commons.students.entities.Student;
import java.util.List;

public interface StudentService extends CommonService<Student> {
    
    public List<Student> findByNameOrLastName(String term);
}