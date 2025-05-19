package com.iron.grades_data_service.repositories;

import com.iron.grades_data_service.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
}
