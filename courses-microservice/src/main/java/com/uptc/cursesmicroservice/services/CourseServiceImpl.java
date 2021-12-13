package com.uptc.cursesmicroservice.services;

import com.uptc.commonsmicroservices.services.CommonServiceImpl;
import com.uptc.cursesmicroservice.entities.Course;
import com.uptc.cursesmicroservice.repository.CourseRepository;

import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends CommonServiceImpl<Course, CourseRepository> implements CourseService{

}
