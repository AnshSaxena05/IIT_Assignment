package com.anshSaxena.IIT_Assignment.Controllers;

import com.anshSaxena.IIT_Assignment.Entities.CourseInstance;
import com.anshSaxena.IIT_Assignment.Services.CourseInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instances")
public class CourseInstanceController {

    @Autowired
    private CourseInstanceService courseInstanceService;

    @PostMapping
    public CourseInstance createCourseInstance(@RequestBody CourseInstance instance) {
        return courseInstanceService.createCourseInstance(instance);
    }

    @GetMapping("/{year}/{semester}")
    public List<CourseInstance> getInstancesByYearAndSemester(@PathVariable int year, @PathVariable int semester) {
        return courseInstanceService.getInstancesByYearAndSemester(year, semester);
    }

    @GetMapping("/{year}/{semester}/{id}")
    public CourseInstance getInstanceDetails(@PathVariable int year, @PathVariable int semester, @PathVariable Long id) {
        return courseInstanceService.getInstanceDetails(year, semester, id);
    }

    @DeleteMapping("/{year}/{semester}/{id}")
    public void deleteInstance(@PathVariable int year, @PathVariable int semester, @PathVariable Long id) {
        courseInstanceService.deleteInstance(year, semester, id);
    }
}