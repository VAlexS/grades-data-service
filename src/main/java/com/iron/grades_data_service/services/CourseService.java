package com.iron.grades_data_service.services;

import com.iron.grades_data_service.models.Course;
import com.iron.grades_data_service.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public ResponseEntity<?> getCourseByCourseCode(String courseCode){
        Optional<Course> foundCourse = courseRepository.findById(courseCode);

        if (foundCourse.isPresent()){
            return new ResponseEntity<>(foundCourse.get(), HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    //todo: endpoint to get the grades based on the course code.




}
