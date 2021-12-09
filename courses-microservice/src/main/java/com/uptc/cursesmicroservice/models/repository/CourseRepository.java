package com.uptc.cursesmicroservice.models.repository;

import com.uptc.cursesmicroservice.models.entity.Course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {

}
