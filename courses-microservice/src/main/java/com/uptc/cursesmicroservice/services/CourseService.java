package com.uptc.cursesmicroservice.services;

import com.uptc.commonsmicroservices.services.CommonService;
import com.uptc.cursesmicroservice.entities.Course;

public interface CourseService extends CommonService<Course> {

    public Course findCourseByStudentId(Long id);
}
