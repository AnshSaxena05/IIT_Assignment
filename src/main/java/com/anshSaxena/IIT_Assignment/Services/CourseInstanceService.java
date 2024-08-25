package com.anshSaxena.IIT_Assignment.Services;

import com.anshSaxena.IIT_Assignment.Entities.CourseInstance;
import com.anshSaxena.IIT_Assignment.Repositories.CourseInstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseInstanceService {

    @Autowired
    private CourseInstanceRepository courseInstanceRepository;

    public CourseInstance createCourseInstance(CourseInstance instance) {
        return courseInstanceRepository.save(instance);
    }

    public List<CourseInstance> getInstancesByYearAndSemester(int year, int semester) {
        return courseInstanceRepository.findByYearAndSemester(year, semester);
    }

    public CourseInstance getInstanceDetails(int year, int semester, Long id) {
        return courseInstanceRepository.findByYearAndSemesterAndId(year, semester, id);
    }

    public void deleteInstance(int year, int semester, Long id) {
        CourseInstance instance = getInstanceDetails(year, semester, id);
        courseInstanceRepository.delete(instance);
    }
}
