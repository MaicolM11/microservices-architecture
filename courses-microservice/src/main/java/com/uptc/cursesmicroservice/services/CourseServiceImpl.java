package com.uptc.cursesmicroservice.services;

import com.uptc.commonsmicroservices.services.CommonServiceImpl;
import com.uptc.cursesmicroservice.entities.Course;
import com.uptc.cursesmicroservice.repository.CourseRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CourseServiceImpl extends CommonServiceImpl<Course, CourseRepository> implements CourseService{

	@Override
    @Transactional(readOnly = true)
	public Course findCourseByStudentId(Long id) {
		return repository.findCourseByStudentId(id);
	}

}
