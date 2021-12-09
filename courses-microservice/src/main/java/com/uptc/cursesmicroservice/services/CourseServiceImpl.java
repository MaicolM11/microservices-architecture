package com.uptc.cursesmicroservice.services;

import com.uptc.commonsmicroservices.services.CommonServiceImpl;
import com.uptc.cursesmicroservice.models.entity.Course;
import com.uptc.cursesmicroservice.models.repository.CourseRepository;

import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends CommonServiceImpl<Course, CourseRepository> implements CourseService{

}
