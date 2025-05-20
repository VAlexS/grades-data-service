package com.iron.grades_data_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseGradeDTO {

    private String courseCode;
    private String courseName;
    private List<Double> grades;


}
