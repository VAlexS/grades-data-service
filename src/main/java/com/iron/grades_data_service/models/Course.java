package com.iron.grades_data_service.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "courses")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @Column(name = "course_code")
    private String courseCode;

    @NonNull
    private String name;

}
