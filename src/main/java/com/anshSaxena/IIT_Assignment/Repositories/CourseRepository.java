package com.anshSaxena.IIT_Assignment.Repositories;

import com.anshSaxena.IIT_Assignment.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
