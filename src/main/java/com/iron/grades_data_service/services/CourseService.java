package com.iron.grades_data_service.services;

import com.iron.grades_data_service.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    //todo: will contain an endpoint to get a course by course code and an endpoint to get the grades based
    // on the course code.


}
