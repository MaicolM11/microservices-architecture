package com.uptc.cursesmicroservice.repository;

import com.uptc.cursesmicroservice.entities.Course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {

}
