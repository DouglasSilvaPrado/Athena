package com.squad55.athena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.squad55.athena.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
