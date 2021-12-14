package com.uptc.cursesmicroservice.repository;

import com.uptc.cursesmicroservice.entities.Course;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

    @Query("select c from Course c join fetch c.students s where s.id = ?1")
    public Course findCourseByStudentId(Long id);

}
