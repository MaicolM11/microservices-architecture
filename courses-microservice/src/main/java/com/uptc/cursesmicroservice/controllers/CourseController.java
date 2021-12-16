package com.uptc.cursesmicroservice.controllers;

import java.util.List;
import java.util.Optional;

import com.uptc.commons.students.entities.Student;
import com.uptc.commonsmicroservices.controllers.CommonController;
import com.uptc.cursesmicroservice.entities.Course;
import com.uptc.cursesmicroservice.services.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController extends CommonController<Course, CourseService> {

    @PutMapping("/{id}")
    public ResponseEntity<?> edit(@RequestBody Course course, @PathVariable Long id) {
        Optional<Course> o = this.service.findById(id);
        if (o.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        Course dbCourse = o.get();
        dbCourse.setName(course.getName());
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(dbCourse));
    }

    @PutMapping("/{id}/assign-student")
    public ResponseEntity<?> assignStudents(@RequestBody List<Student> students, @PathVariable Long id) {
        Optional<Course> o = this.service.findById(id);
        if (!o.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Course dbCourse = o.get();
        students.forEach(a -> {
            dbCourse.addStudent(a);
        });
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(dbCourse));
    }

    @PutMapping("/{id}/delete-student")
    public ResponseEntity<?> deleteStudent(@RequestBody Student student, @PathVariable Long id) {
        Optional<Course> o = this.service.findById(id);
        if (!o.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        Course dbCourse = o.get();
        dbCourse.removeStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(dbCourse));
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<?> searchCourseOfStudentWithId(@PathVariable Long id){
        return ResponseEntity.ok(service.findCourseByStudentId(id));
    } 

}