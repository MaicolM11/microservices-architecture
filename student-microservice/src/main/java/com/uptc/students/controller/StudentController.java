package com.uptc.students.controller;

import com.uptc.commonsmicroservices.controllers.CommonController;
import com.uptc.students.entities.Student;
import com.uptc.students.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController extends CommonController<Student, StudentService> {

    @Autowired
    private StudentService service;

    @PutMapping("/{id}")
    public ResponseEntity<?> edit(@RequestBody Student student, @PathVariable Long id) {
        Optional<Student> o = service.findById(id);
        if (o.isEmpty()) {
            ResponseEntity.notFound().build();
        }

        Student studentDb = o.get();
        studentDb.setName(student.getName());
        studentDb.setLastName(student.getLastName());
        studentDb.setEmail(student.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(studentDb));
    }

}