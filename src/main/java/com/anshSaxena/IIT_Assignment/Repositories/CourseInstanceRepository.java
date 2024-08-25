package com.anshSaxena.IIT_Assignment.Repositories;

import com.anshSaxena.IIT_Assignment.Entities.CourseInstance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseInstanceRepository extends JpaRepository<CourseInstance, Long> {
    List<CourseInstance> findByYearAndSemester(int year, int semester);
    CourseInstance findByYearAndSemesterAndId(int year, int semester, Long id);
}