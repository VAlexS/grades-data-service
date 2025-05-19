package com.iron.grades_data_service.services;

import com.iron.grades_data_service.models.Grade;
import com.iron.grades_data_service.repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {

    @Autowired
    private GradeRepository gradeRepository;


    public List<Grade> getAllGrades(){
        return gradeRepository.findAll();
    }



}
