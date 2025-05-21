package com.iron.grades_data_service.dto;

import com.iron.grades_data_service.models.Course;
import com.iron.grades_data_service.models.Grade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GradeResponseDTO {

    private int id;

    private int grade;

    private Course course;

    private int studentId;

    private StudentDTO student;

    public GradeResponseDTO(Grade grade, StudentDTO studentDTO){
        setId(grade.getId());
        setGrade(grade.getGrade());
        setCourse(grade.getCourse());
        setStudentId(grade.getStudentId());
        setStudent(studentDTO);
    }




}
