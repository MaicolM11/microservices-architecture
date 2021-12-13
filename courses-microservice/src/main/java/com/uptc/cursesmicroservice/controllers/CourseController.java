package com.uptc.cursesmicroservice.controllers;

import java.util.Optional;

import com.uptc.commonsmicroservices.controllers.CommonController;
import com.uptc.cursesmicroservice.entities.Course;
import com.uptc.cursesmicroservice.services.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
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
}
