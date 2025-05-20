package com.iron.grades_data_service.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "grades")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private int grade;

    @NonNull
    @Column(name = "student_id")
    private int studentId;
}
