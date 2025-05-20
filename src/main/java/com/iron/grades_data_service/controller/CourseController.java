package com.iron.grades_data_service.controller;

import com.iron.grades_data_service.models.Course;
import com.iron.grades_data_service.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/{courseCode}")
    public ResponseEntity<?> getCourseByCourseCode(@PathVariable  String courseCode){
        return courseService.getCourseByCourseCode(courseCode);
    }

}
