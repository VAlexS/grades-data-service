package com.iron.grades_data_service.services;

import com.iron.grades_data_service.clients.UserFeignClient;
import com.iron.grades_data_service.dto.GradeResponseDTO;
import com.iron.grades_data_service.dto.StudentDTO;
import com.iron.grades_data_service.models.Grade;
import com.iron.grades_data_service.repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserFeignClient userFeignClient;


    public List<GradeResponseDTO> getAllGrades(){
        List<Grade> grades = gradeRepository.findAll();

        return grades.stream().map(grade -> {

            StudentDTO student = userFeignClient.getStudentById(grade.getStudentId());

            return new GradeResponseDTO(grade, student);
        }).collect(Collectors.toList());
    }



}
