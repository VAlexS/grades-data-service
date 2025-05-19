package com.iron.grades_data_service.repositories;

import com.iron.grades_data_service.models.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Integer> {
}
