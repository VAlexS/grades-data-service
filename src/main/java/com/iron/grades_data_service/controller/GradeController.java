package com.iron.grades_data_service.controller;

import com.iron.grades_data_service.dto.GradeResponseDTO;
import com.iron.grades_data_service.models.Grade;
import com.iron.grades_data_service.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/grades")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @GetMapping
    public List<GradeResponseDTO> getAllGrades(){
        return gradeService.getAllGrades();
    }




}
